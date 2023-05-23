<template>
  <div class="page">
    <RouterView />
  </div>
</template>
<script setup>
import {RouterView} from 'vue-router';

</script>
<style lang="scss">
.page {
  height: 100%;
  width: 100%;
  background-color: #F8F8F8;
  overflow: hidden;
  flex-basis: auto;
  flex-grow: 1;
  flex-shrink: 1;
  padding: 16px;
  padding: 20px;

  // display: flex;
  // flex-direction: row;
  // justify-content: flex-start;
}
</style>
