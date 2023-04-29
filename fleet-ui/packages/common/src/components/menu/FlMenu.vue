<template>
  <menu class="menu">
    <slot></slot>
    <Menu
      :style="{ width: '100%', height: '100%' }"
      :default-open-keys="['0']"
      :default-selected-keys="['0_2']"
      :show-collapse-button="false"
      :accordion="true"
      breakpoint="xl"
      @collapse="onCollapse"
    >
      <SubMenu key="00">
        <template #icon><IconCode /></template>
        <template #title>开发工具</template>
        <MenuItem key="00_0">应用管理</MenuItem>
        <MenuItem key="00_1">模块管理</MenuItem>
      </SubMenu>
      <SubMenu key="01">
        <template #icon><IconApps /></template>
        <template #title>组织架构</template>
        <MenuItem key="01_0">组织管理</MenuItem>
        <MenuItem key="01_1">部门管理</MenuItem>
      </SubMenu>
      <SubMenu key="0">
        <template #icon><IconSettings /></template>
        <template #title>系统管理</template>
        <MenuItem key="0_0">菜单管理</MenuItem>
        <MenuItem key="0_1">角色管理</MenuItem>
        <MenuItem key="0_2">用户角色</MenuItem>
      </SubMenu>
      <SubMenu key="1">
        <template #icon><IconUser /></template>
        <template #title>用户中心</template>
        <MenuItem key="1_0">用户管理</MenuItem>
        <MenuItem key="1_1">用户资料</MenuItem>
      </SubMenu>
    </Menu>
  </menu>
</template>

<script lang="ts" setup>
import { ref } from 'vue';
import {Menu, MenuItem, SubMenu, Message} from '@arco-design/web-vue';
import '@arco-design/web-vue/es/menu/style/css.js';
import {
  IconMenuFold,
  IconMenuUnfold,
  IconApps,
  IconBug,
  IconBulb,
  IconUser,
  IconSettings,
  IconCode,
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
@use "../../assets/mixin" as *;

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

  .arco-menu-vertical .arco-menu-item.arco-menu-has-icon .arco-menu-title,
  .arco-menu-vertical .arco-menu-group-title.arco-menu-has-icon .arco-menu-title,
  .arco-menu-vertical .arco-menu-pop-header.arco-menu-has-icon .arco-menu-title,
  .arco-menu-vertical .arco-menu-inline-header.arco-menu-has-icon .arco-menu-title {
    font-weight: 500;
  }



  .arco-menu-inner .arco-icon:not(.arco-icon-down) {
    font-size: 16px;
  }
  .arco-menu-indent {
    width: 30px;
  }
  //.arco-menu .arco-menu-item .arco-icon,
  //.arco-menu .arco-menu-group-title .arco-icon,
  //.arco-menu .arco-menu-pop-header .arco-icon,
  //.arco-menu .arco-menu-inline-header .arco-icon,
  //.arco-menu .arco-menu-item .arco-menu-icon,
  //.arco-menu .arco-menu-group-title .arco-menu-icon,
  //.arco-menu .arco-menu-pop-header .arco-menu-icon,
  .arco-menu .arco-menu-inline-header .arco-menu-icon {
    margin-right: 12px;
  }
}
</style>
