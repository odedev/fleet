<template>
  <nav class="nav">
    <div class="nav-breadcrumb">
      <IconHome />
      <Breadcrumb :style="{fontSize: `14px`}">
        <BreadcrumbItem>首页</BreadcrumbItem>
        <BreadcrumbItem>用户中心</BreadcrumbItem>
        <BreadcrumbItem>用户管理</BreadcrumbItem>
      </Breadcrumb>
    </div>
    <slot></slot>
    <div class="nav-action">
<!--      <Tooltip :mini="true" content="设置"><IconSettings /></Tooltip>-->
      <Tooltip :mini="true" content="刷新"><IconRefresh /></Tooltip>
<!--      <Tooltip :mini="true" content="帮助"><IconQuestionCircle /></Tooltip>-->
      <Tooltip :mini="true" content="文档"><IconBook /></Tooltip>
    </div>
  </nav>
</template>
<script lang="ts" setup>
import {Breadcrumb, BreadcrumbItem, Tooltip} from "@arco-design/web-vue";
import {IconHome, IconQuestionCircle, IconRefresh, IconBook, IconSettings} from "@arco-design/web-vue/es/icon";
</script>
<style lang="scss">
.nav {
  --nav-height: 40px;
  --nav-height: 28px;
  height: var(--nav-height);
  flex-basis: var(--nav-height);
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: flex-end;
  font-size: 14px;
  line-height: 1;
  padding: 0;
  //border-bottom: 1px solid #F5F5F5;
  background-color: #F8F8F8;

  .nav-breadcrumb {
    padding: 0 20px;
  }
  .nav-action {
    font-size: 20px;
    padding: 0 20px;
    .arco-icon {
      margin-left: 8px;
    }
  }
}
</style>
