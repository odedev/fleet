<template>
<FlInputBase class="input-boolean">
  <Checkbox />
</FlInputBase>
</template>
<script lang="ts" setup>
import {Checkbox} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/checkbox/style/index.css';

import FlInputBase from "./FlInputBase.vue";
</script>
<style lang="scss">
.input.input-boolean {
  width: 32px;
  padding: 0;
  align-items: center;
  justify-content: center;

  .arco-checkbox {
    padding-left: 0;
  }
}
</style>
