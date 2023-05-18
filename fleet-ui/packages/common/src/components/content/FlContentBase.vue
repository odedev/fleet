<template>
  <div class="content">
    <slot></slot>
  </div>
</template>
<script lang="ts" setup>
</script>
<style lang="scss">
.content {
  height: 28px;
  height: 32px;
  height: 40px;
  width: 100%;
  min-width: 40px;
  padding: 0 8px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  flex-direction: row;
  overflow: hidden;
  white-space: nowrap;
  text-overflow:ellipsis;
  letter-spacing: normal;
}
</style>
