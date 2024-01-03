<script setup lang="ts">
</script>
<template>
  <div class="view-main">
    <slot></slot>
  </div>
</template>
<style lang="scss">
.view-main {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  padding: 0;
  overflow: hidden;
}
</style>
