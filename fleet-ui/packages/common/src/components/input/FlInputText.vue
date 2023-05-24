<template>
<FlInputBase class="input-checkbox">
  <Input allow-clear size="small"/>
</FlInputBase>
</template>
<script lang="ts" setup>
import {Input} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/input/style/index.css';
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">

.arco-input-wrapper {
  padding-left: 8px;
  padding-right: 8px;
 //background-color: #FFFFFF;
}
</style>
