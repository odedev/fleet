<template>
  <FlInputBase class="input-file">
    <Upload :auto-upload="false" size="small"></Upload>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {Upload} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/upload/style/index.css";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-file {
  width: max-content;
  .arco-btn {
    height: 28px;
  }
}
</style>
