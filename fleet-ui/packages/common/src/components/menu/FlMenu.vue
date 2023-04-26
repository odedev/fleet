<template>
  <menu class="menu">
    <slot></slot>
    <Menu
      :style="{ width: '100%', height: '100%' }"
      :default-open-keys="['0']"
      :default-selected-keys="['0_2']"
      :show-collapse-button="false"
      breakpoint="xl"
      @collapse="onCollapse"
    >
      <SubMenu key="0">
        <template #icon><icon-apps></icon-apps></template>
        <template #title>Navigation 1</template>
        <MenuItem key="0_0">Menu 1</MenuItem>
        <MenuItem key="0_1">Menu 2</MenuItem>
        <MenuItem key="0_2">Menu 3</MenuItem>
        <MenuItem key="0_3">Menu 4</MenuItem>
      </SubMenu>
      <SubMenu key="1">
        <template #icon><icon-bug></icon-bug></template>
        <template #title>Navigation 2</template>
        <MenuItem key="1_0">Menu 1</MenuItem>
        <MenuItem key="1_1">Menu 2</MenuItem>
        <MenuItem key="1_2">Menu 3</MenuItem>
      </SubMenu>
      <SubMenu key="2">
        <template #icon><icon-bulb></icon-bulb></template>
        <template #title>Navigation 3</template>
        <MenuItem key="2_0">Menu 1</MenuItem>
        <MenuItem key="2_1">Menu 2</MenuItem>
        <MenuItem key="2_2" title="Navigation 4">
          <MenuItem key="2_2_0">Menu 1</MenuItem>
          <MenuItem key="2_2_1">Menu 2</MenuItem>
        </MenuItem>
      </SubMenu>
    </Menu>
  </menu>
</template>

<script lang="ts" setup>
import { ref } from 'vue';
import Menu from '@arco-design/web-vue/es/menu';
import {MenuItem, SubMenu} from '@arco-design/web-vue/es/menu';
import '@arco-design/web-vue/es/menu/style/css.js';
import { Message } from '@arco-design/web-vue';
import {
  IconMenuFold,
  IconMenuUnfold,
  IconApps,
  IconBug,
  IconBulb,
} from '@arco-design/web-vue/es/icon';

const onCollapse = (val: any, type: string) => {
  const content = type === 'responsive' ? '触发响应式收缩' : '点击触发收缩';
  Message.info({
    content,
    duration: 2000,
  });
}
</script>
<style lang="scss">
.menu {
  --menu-width: 208px;
  width: var(--menu-width);
  height: 100%;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--menu-width);
  //padding: 16px;
  /* border-right: 1px solid #f5f5f5; */

  .arco-menu {
    width: 100%;
    height: 100%;
    padding: 0;
  }
  .arco-menu-inner {
    padding: 0;
  }
}
</style>
