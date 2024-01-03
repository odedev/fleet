<template>
  <FlInputBase class="input-password">
    <InputPassword allow-clear size="small" />
  </FlInputBase>
</template>
<script lang="ts" setup>
import {InputPassword} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-password {
  .arco-input-wrapper {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }
}
</style>
