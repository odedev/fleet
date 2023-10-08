<script setup lang="ts">
import {Steps, Step} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/steps/style/css.js";

</script>

<template>
<div>
  <Steps label-placement="vertical">
    <Step description="This is a description">Succeeded</Step>
    <Step description="This is a description">Processing</Step>
    <Step description="This is a description">Pending</Step>
  </Steps>
</div>
</template>

<style scoped lang="scss">

</style>
