<template>
<div class="cell">
  <slot></slot>
</div>
</template>

<script lang="ts" setup>
import {Breadcrumb, BreadcrumbItem, Tooltip} from "@arco-design/web-vue";
import {IconQuestionCircle} from "@arco-design/web-vue/es/icon";

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.cell {
  width: 336px;
  width: 272px;
  max-width: 272px;
  height: 28px;
  height: 32px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  flex-wrap: nowrap;
  font-size: 14px;
  line-height: 22px;
  padding: 0 8px;

  @include ellipsis();

}
</style>
