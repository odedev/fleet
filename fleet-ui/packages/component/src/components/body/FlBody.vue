<template>
  <div class="body">
    <slot></slot>
  </div>
</template>
<script lang="ts" setup>

</script>
<style lang="scss">
.body {
  width: 100%;
  height: 100%;
  position: relative;
  flex: 1 1 auto;
  display: flex;
  flex-direction: row;
  overflow: hidden;
}

</style>
