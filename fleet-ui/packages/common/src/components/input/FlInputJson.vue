<template>
  <FlInputBase class="input-json">
    <Input allow-clear allow-search readonly size="small">
      <template #suffix>
        <IconCodeBlock />
      </template>
    </Input>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {Input} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import {IconCodeBlock} from "@arco-design/web-vue/es/icon";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-json {
  .arco-input-wrapper {
    padding-left: 8px;
    padding-right: 8px;
  }
}
</style>
