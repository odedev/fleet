<template>
  <section class="section">
    <slot></slot>
  </section>
</template>
<script lang="ts" setup>
</script>
<style lang="scss">
.section {
  height: max-content;
  height: 100%;
  min-height: max-content;
  max-height: 100%;
  width: 100%;
  padding: 0;
  padding: 10px 16px;
  padding: 16px;
  //padding-top: 0;
  //padding-bottom: 24px;
  display: flex;
  flex-direction: column;
  //overflow: auto;
  white-space: nowrap;
  white-space: normal;
  letter-spacing: normal;
  vertical-align: baseline;

  .search {
    padding: 0;
  }
}
</style>
