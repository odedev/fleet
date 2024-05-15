<script setup lang="ts">
import { ref, computed } from 'vue';
import { useRouter } from "vue-router";
import { Menu, SubMenu, MenuItem, MenuItemGroup, Message } from '@arco-design/web-vue';
import '@arco-design/web-vue/es/menu/style/css.js';
import FlIcon from '../icon/FlIcon.vue';

import {
  IconMenuFold,
  IconMenuUnfold,
  IconList,
  IconApps,
  IconBug,
  IconBulb,
  IconUser,
  IconUserGroup,
  IconSettings,
  IconCode,
} from '@arco-design/web-vue/es/icon';
import { ArrayUtils } from "@fleet/common";

const router = useRouter();

const emit = defineEmits(['update:modelValue', 'change']);

const props = defineProps<{
  modelValue: any,
  menus: any[],
}>();

const menuMap = ArrayUtils.arrayToMap(props.menus);

const menus = computed(() => {
  return ArrayUtils.arrayToTree(props.menus);
});

const menu = computed<any>({
  get: () => {
    return props.modelValue
  },
  set: (value) => {
    emit('update:modelValue', value);
  }
});

const selectedKeys = computed(() => {
  return props.modelValue ? [props.modelValue.id] : [];
});

const openKeys = computed(() => {
  return props.modelValue ? [props.modelValue.parent?.id || props.modelValue.parent] : [];
});

const onCollapse = (val: any, type: string) => {
  const content = type === 'responsive' ? '触发响应式收缩' : '点击触发收缩';
  Message.info({
    content,
    duration: 2000,
  });
}

const onSubMenuClick = (key: string) => {
  console.log(key)
}

const onMenuItemClick = (key: string) => {
  const item = menuMap.get(key);
  if (item && item.path) {
    menu.value = item;
    router.push(item.path);
  }
}

</script>

<template>
  <menu class="menu">
    <slot></slot>
    <Menu
      :selected-keys="selectedKeys"
      :show-collapse-button="false"
      :auto-open-selected="true"
      :accordion="true"
      breakpoint="xl"
      @menu-item-click="onMenuItemClick"
      @sub-menu-click="onSubMenuClick"
      @collapse="onCollapse"
    >
      <template v-for="menu in menus">
        <template v-if="menu.children && menu.children.length">
          <SubMenu :key="menu.id">
            <template #icon><FlIcon v-model="menu.icon" /></template>
            <template #title>{{menu.name}}</template>
            <template v-for="child in menu.children">
              <template v-if="child.children && child.children.length">
    <!--            <SubMenu :key="child.id">-->
    <!--              <template #title>{{child.name}}</template>-->
    <!--              <MenuItem v-for="item in child.children" :key="item.id">{{item.name}}</MenuItem>-->
    <!--            </SubMenu>-->
                <MenuItemGroup :title="child.name" :key="child.id">
                  <MenuItem v-for="item in child.children" :key="item.id" :disabled="!item.path">{{item.name}}</MenuItem>
                </MenuItemGroup>
              </template>
              <template v-else>
                <MenuItem :key="child.id" :disabled="!child.path">{{child.name}}</MenuItem>
              </template>
            </template>
          </SubMenu>
        </template>
        <template v-else>
          <MenuItem :key="menu.id" :disabled="!menu.path">
            <template #icon><FlIcon v-model="menu.icon" /></template>
            {{menu.name}}
          </MenuItem>
        </template>
      </template>

      <!-- <SubMenu key="1660841476692684880">
        <template #icon><IconCode /></template>
        <template #title>开发工具</template>
        <MenuItem key="1660841476692684881">应用管理</MenuItem>
        <MenuItem key="1660841476692684882">模块管理</MenuItem>
      </SubMenu>
      <SubMenu key="01">
        <template #icon><IconUserGroup /></template>
        <template #title>组织架构</template>
        <MenuItem key="01_0">组织管理</MenuItem>
        <MenuItem key="01_1">部门管理</MenuItem>
      </SubMenu>
      <SubMenu key="1660843130011824130">
        <template #icon><IconSettings /></template>
        <template #title>系统管理</template>
        <MenuItemGroup title="角色权限">
          <MenuItem key="1660843130011824131">菜单管理</MenuItem>
          <MenuItem key="1660843130011824132">角色管理</MenuItem>
          <MenuItem key="1660843130011824133">用户角色</MenuItem>
        </MenuItemGroup>
        <MenuItemGroup title="用户中心">
          <MenuItem key="1660843130011824134">用户管理</MenuItem>
          <MenuItem key="1660843130011824135">用户资料</MenuItem>
        </MenuItemGroup>
      </SubMenu>
      <SubMenu key="1">
        <template #icon><IconUser /></template>
        <template #title>用户中心</template>
        <MenuItem key="1_0">用户管理</MenuItem>
        <MenuItem key="1_1">用户资料</MenuItem>
      </SubMenu> -->
    </Menu>
  </menu>
</template>

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

  .arco-menu-vertical .arco-menu-item.arco-menu-has-icon .arco-menu-icon,
  .arco-menu-vertical .arco-menu-group-title.arco-menu-has-icon .arco-menu-icon,
  .arco-menu-vertical .arco-menu-pop-header.arco-menu-has-icon .arco-menu-icon,
  .arco-menu-vertical .arco-menu-inline-header.arco-menu-has-icon .arco-menu-icon {
    margin-right: 12px;
  }

  .arco-menu-light .arco-menu-group-title {
    font-weight: 600;
  }
}
</style>
