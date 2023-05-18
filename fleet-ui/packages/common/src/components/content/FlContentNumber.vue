<template>
  <FlContentBase class="content-number">
    <slot></slot>
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";

</script>
<style lang="scss">
.content.content-number {
  justify-content: flex-end;
}
</style>
