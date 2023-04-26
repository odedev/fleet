<template>
  <main class="main">
    <slot></slot>
  </main>
</template>
<script lang="ts" setup>

</script>
<style lang="scss">
.main {
  width: 100%;
  height: 100%;
  flex-grow: 1;
  flex-shrink: 1;
  flex-basis: auto;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
</style>
