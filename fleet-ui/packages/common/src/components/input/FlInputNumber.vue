<template>
  <FlInputBase class="input-number">
    <InputNumber allow-clear hide-button size="small" :step="1" :precision="2" />
  </FlInputBase>
</template>
<script lang="ts" setup>
import {InputNumber} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input-number/style/index.css";
import FlInputBase from "./FlInputBase.vue";

</script>
