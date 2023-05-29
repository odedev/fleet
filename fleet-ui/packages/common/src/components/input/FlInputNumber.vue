<template>
  <FlInputBase class="input-number">
    <InputNumber allow-clear hide-button size="small" :step="1" :precision="2" >
      <template #suffix>
        <IconOriginalSize />
      </template>
    </InputNumber>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {InputNumber} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input-number/style/index.css";
import {IconOriginalSize} from "@arco-design/web-vue/es/icon";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-number {
  .arco-input-number {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }

}
</style>
