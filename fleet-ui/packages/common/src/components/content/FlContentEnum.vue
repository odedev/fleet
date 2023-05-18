<template>
  <FlContentBase class="content-enum">
    <slot></slot>
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";

</script>
<style lang="scss">
.content.content-enum {
  justify-content: center;
}
</style>
