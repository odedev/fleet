<template>
<div class="item">
  <div class="item-label">
    <b style="padding-right: 4px;color: red;">*</b>
    <label>名称</label>
    <Tooltip :mini="true" content="文档"><IconQuestionCircle /></Tooltip>
  </div>
  <div class="item-content">
    <slot></slot>
  </div>
</div>
</template>

<script lang="ts" setup>
import {Breadcrumb, BreadcrumbItem, Tooltip} from "@arco-design/web-vue";
import {IconQuestionCircle} from "@arco-design/web-vue/es/icon";

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.item {
  width: 440px;
  max-width: 440px;
  max-width: 400px;
  height: 28px;
  height: 32px;
  height: 40px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  line-height: 22px;
  .item-label {
    width: 104px;
    width: 128px;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    align-items: center;
    flex-wrap: nowrap;
    label {
      white-space: nowrap;
      @include ellipsis();
    }
    .arco-icon {
      margin-left: 6px;
    }
  }
  .item-content {
    width: 336px;
    width: 272px;
    padding: 0 8px;
  }
}
</style>
