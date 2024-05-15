<script setup lang="ts">

</script>

<template>
  <div class="view-body">
    <slot></slot>
  </div>
</template>

<style lang="scss">
@use "../../assets/mixin" as *;

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
  //@include background-color();

}
</style>
