<template>
<FlInputBase class="input-checkbox">
  <Checkbox ></Checkbox>
</FlInputBase>
</template>
<script lang="ts" setup>
import {Checkbox} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/checkbox/style/index.css';

import FlInputBase from "./FlInputBase.vue";
</script>
<style lang="scss">
.input.input-checkbox {

  .arco-checkbox {
    padding-left: 0;
  }
}
</style>
