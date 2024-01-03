<script setup lang="ts">

</script>
<template>
  <div class="button-group">
    <slot></slot>
  </div>
</template>
<style lang="scss">
.button-group {
  //width: 100%;
  //height: 100%;
  //height: 32px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  overflow: hidden;
  .button {
    margin-left: 8px;

    &:first-child {
      margin-left: 0;
    }
  }

}
</style>
