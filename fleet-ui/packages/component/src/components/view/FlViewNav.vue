<template>
  <div class="view-nav">
    <slot></slot>
    <Breadcrumb  separator=">" >
      <BreadcrumbItem>Home</BreadcrumbItem>
      <BreadcrumbItem>Channel</BreadcrumbItem>
      <BreadcrumbItem>News</BreadcrumbItem>
    </Breadcrumb>
  </div>
</template>
<script lang="ts" setup>
import {Breadcrumb, BreadcrumbItem} from '@arco-design/web-vue';
import '@arco-design/web-vue/es/breadcrumb/style/css.js';


</script>
<style lang="scss">
.view-nav {
  width: 100%;
  height: 32px;
  flex-basis: 32px;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  flex-wrap: nowrap;
  overflow: hidden;
  padding: 0 16px;
  font-size: 12px;
  line-height: 12px;
  border-bottom: 1px solid #f5f5f5;
}
</style>
