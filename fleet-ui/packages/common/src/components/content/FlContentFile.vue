<template>
  <FlContentBase class="content-file">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";
const value = '已认证.pdf';
</script>
<style lang="scss">
.content.content-file {
  //justify-content: center;
}
</style>
