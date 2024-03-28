<template>
  <div class="wrapper">
    <FlHeader name="应用功能有限公司"></FlHeader>
    <FlBody>
      <FlMenu v-model="currentMenu" :menus="menus" @update:model-value="onMenuChange"></FlMenu>
      <FlMain>
        <FlTab v-model="currentMenu" v-model:tabs="tabs" @update:model-value="onTabChange"></FlTab>
        <FlNav></FlNav>
        <FlPage />
      </FlMain>
    </FlBody>
    <!-- <FlFooter /> -->
  </div>
</template>
<script setup lang="ts">
import { ref, computed, toValue } from 'vue';
import { RouterView } from 'vue-router';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
} from '@fleet/component';

const emit = defineEmits(['update:modelValue', 'menuChange']);

interface Props {
  // modelValue: any,
  menus?: any[],
}

const props = defineProps<Props>();

const tabs = ref<any[]>([]);
const currentMenu = ref<any>(null);

const menus = computed(() => props.menus ?? []);

const onMenuChange = (menu: any) => {
  let item = tabs.value.find(tab => tab.id === menu.id);
  if (item) {
    currentMenu.value = item;
  } else {
    tabs.value.push(menu);
    currentMenu.value = menu;
  }

  emit('menuChange', toValue(currentMenu));
};

const onTabChange = (menu: any) => {
  let item = tabs.value.find(tab => tab.id === menu.id);
  if (item) {
    currentMenu.value = item;
  }
};

</script>
<style lang="scss" scoped>
.wrapper {
  width: 100%;
  height: 100%;
  flex-grow: 1;
  flex-shrink: 1;
  flex-basis: auto;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
</style>
