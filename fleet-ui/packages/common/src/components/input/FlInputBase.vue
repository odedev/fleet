<template>
  <div class="input">
    <slot></slot>
  </div>
</template>

<script lang="ts" setup>
import {Breadcrumb, BreadcrumbItem, Tooltip} from "@arco-design/web-vue";
import {IconQuestionCircle} from "@arco-design/web-vue/es/icon";

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.input {
  width: 336px;
  width: 272px;
  width: 100%;
  height: 28px;
  height: 32px;
  //height: 40px;
  //height: 56px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  line-height: 22px;
  padding: 0 8px;
  padding: 0;
}
</style>
