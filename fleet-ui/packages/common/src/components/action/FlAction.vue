<template>
<div class="action">
  <slot></slot>
</div>
</template>

<script lang="ts" setup>
</script>

<style lang="scss">
.action {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  overflow: hidden;
  padding: 16px;
  //padding-top: 22px;

  button {
    margin-left: 12px;
  }
}
</style>
