<template>
  <div class="view-body">
    <slot></slot>
  </div>
</template>
<script setup>
</script>
<style lang="scss">
.view-body {
  height: 100%;
  flex-grow: 1;
  flex-shrink: 1;
  flex-basis: auto;
  display: flex;
  flex-direction: column;
  overflow: auto;
  overflow: overlay;
  padding: 0;
}
</style>
