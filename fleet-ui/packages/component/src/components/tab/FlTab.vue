<script setup lang="ts">
import { computed } from 'vue';
import { useRouter } from "vue-router";
import {IconMenuFold, IconMenuUnfold, IconClose} from "@arco-design/web-vue/es/icon";

const router = useRouter();

const emit = defineEmits(['update:modelValue', 'update:tabs'])

const props = defineProps<{
  modelValue: any,
  tabs: any[],
}>();

const tab = computed<any>({
  get: () => {
    return props.modelValue
  },
  set: (value) => {
    emit('update:modelValue', value);
  }
});

const tabs = computed<any []>({
  get: () => props.tabs,
  set: (value) => {
    emit('update:tabs', value);
  }
});

const onClick = (item: any) => {
  tab.value = item;
  router.push(item.path);
};

const onClose = (item: any) => {
  // let node = tabs.value.findIndex(tab => tab.id === item.id);
  const index = tabs.value.findIndex(tab => tab.id === item.id);
  tabs.value.splice(index, 1);
  if (tab.value.id === item.id) {
    const preTab = index === 0 ? tabs.value[0] : tabs.value[index-1];
    onClick(preTab);
  }
};

</script>

<template>
  <nav class="tab">
    <IconMenuFold />
    <IconMenuUnfold />
    <slot></slot>
    <ol class="tab-list">
      <li class="tab-item" v-for="item in tabs" :key="item.id" :class="{'active': tab && tab.id === item.id}">
        <span @click="onClick(item)">{{item.name}}</span>
        <i class="icon" @click="onClose(item)"><IconClose /></i>
      </li>
    </ol>
  </nav>
</template>

<style lang="scss">
@use "../../assets/mixin" as *;

.tab {
  --tab-height: 48px;
  --tab-height: 40px;
  height: var(--tab-height);
  flex-basis: var(--tab-height);
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  padding: 0;

  .tab-list {
    height: 100%;
    display: flex;
    flex-direction: row;
    list-style: none;
    overflow: auto;
    overflow: overlay;
  }
  .tab-item {
    height: 100%;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    padding: 0 8px;

    &.active {
      background-color: #F8F8F8;
      @include background-color();

      span, a {
        @include color-secondary();
      }
    }

    span, a {
      line-height: 22px;
      padding: 0 4px;
      //@include color-secondary();
      cursor: pointer;
      min-width: max-content;
    }

    .icon {
      height: 16px;
      width: 16px;
      //padding: 4px;
      font-size: 12px;
      display: flex;
      justify-content: center;
      align-items: center;

      border-radius: 50%;
      color: #BFBFBF;

      &:hover {
        @include background-color-tertiary();
      }
    }

  }
}
</style>
