<template>
  <FlInputBase class="input-enum">
    <Select allow-clear allow-search size="small">
      <Option>Beijing</Option>
      <Option>Shanghai</Option>
      <Option>Chongqing</Option>
    </Select>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {Select, Option} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/select/style/index.css";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-enum {
  .arco-select {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }
}
</style>
