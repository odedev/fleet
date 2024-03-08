<template>
  <div class="wrapper">
    <FlHeader name="应用功能有限公司"></FlHeader>
    <FlBody>
      <FlMenu v-model="current" :menus="menus" @update:model-value="onMenuChange"></FlMenu>
      <FlMain>
        <FlTab v-model="current" v-model:tabs="tabs" @update:model-value="onTabChange"></FlTab>
        <FlNav></FlNav>
        <FlPage />
      </FlMain>
    </FlBody>
    <!--  <FlFooter />-->
  </div>
</template>
<script setup lang="ts">
import { ref, computed } from 'vue';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
} from '@fleet/component';


interface Props {
  menus?: any[],
}

const props = defineProps<Props>();

const menus = computed(() => props.menus ?? [])

const tabs = ref<any[]>([]);
const current = ref<any>(null);

const onMenuChange = (menu: any) => {
  let item = tabs.value.find(tab => tab.id === menu.id);
  if (item) {
    current.value = item;
  } else {
    tabs.value.push(menu);
    current.value = menu;
  }
};

const onTabChange = (menu: any) => {
  let item = tabs.value.find(tab => tab.id === menu.id);
  if (item) {
    current.value = item;
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
