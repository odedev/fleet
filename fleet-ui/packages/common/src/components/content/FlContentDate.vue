<template>
  <FlContentBase class="content-date">
    <slot></slot>
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";

</script>
<style lang="scss">
.content.content-date {
  justify-content: center;
}
</style>
