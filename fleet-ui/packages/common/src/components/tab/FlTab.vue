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
<script lang="ts" setup>
import {computed} from 'vue';
import {IconMenuFold, IconMenuUnfold, IconClose} from "@arco-design/web-vue/es/icon";
import router from "@/router";

const props = defineProps<{
  modelValue: any,
  tabs: any[],
}>();

const emit = defineEmits(['update:modelValue', 'update:tabs'])

const tab = computed<any>({
  get: () => {
    console.log(props.modelValue)
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

      span, a {
        @include color-secondary();
        @include color-secondary-theme();
      }
    }

    span, a {
      line-height: 22px;
      padding: 0 4px;
      //@include color-secondary();
      //@include color-secondary-theme();
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
        @include background-color-tertiary-theme();
      }
    }

  }
}
</style>
