<template>
  <FlContentBase class="content-mask">
    <slot></slot>
  </FlContentBase>
</template>
<script lang="ts" setup>
// 数据脱敏
import FlContentBase from "./FlContentBase.vue";

</script>
<style lang="scss">
.content.content-mask {
  justify-content: center;
}
</style>
