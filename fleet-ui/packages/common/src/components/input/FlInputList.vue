<template>
  <FlInputBase class="input-list">
    <InputSearch allow-clear allow-search size="small">

    </InputSearch>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {InputSearch} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-list {
  .arco-select {
    padding-left: 8px;
    padding-right: 8px;
  }
}
</style>
