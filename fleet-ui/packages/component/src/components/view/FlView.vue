<template>
  <div class="view">
    <slot></slot>
  </div>
</template>
<script setup lang="ts">
</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.view {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
  padding: 0;
  background-color: #FFFFFF;
  @include background-color-surface();
}
</style>
