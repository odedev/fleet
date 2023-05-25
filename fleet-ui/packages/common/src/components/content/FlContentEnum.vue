<template>
  <FlContentBase class="content-enum">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";
const value = '已认证';
</script>
<style lang="scss">
.content.content-enum {
  //justify-content: center;
}
</style>
