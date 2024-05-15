<template>
<FlInputBase class="input-textarea">
  <Textarea allow-clear show-word-limit auto-size size="small"/>
</FlInputBase>
</template>
<script lang="ts" setup>
import {Textarea} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/textarea/style/index.css";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-textarea {
  height: max-content;
  padding-top: 2px;
  padding-bottom: 2px;
  .arco-textarea {
    padding-left: 8px;
    padding-right: 8px;
    min-height: 28px;
  }
}
</style>
