<script setup lang="ts">
</script>
<template>
  <div class="view-head">
    <slot></slot>
  </div>
</template>
<style lang="scss">
.view-head {
  --view-head-height: 64px;
  --view-head-height: 104px;
  --view-head-height: 112px;
  --view-head-height: 80px;
  --view-head-height: max-content;

  //--view-head-height: 128px;
  height: var(--view-head-height);
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--view-head-height);
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  //justify-content: space-between;
  //justify-content: flex-start;
  align-items: center;
  align-items: flex-start;
  //padding: 0 16px;
  /* border-bottom: 1px solid #f0f0f0; */
  //background-color: #CFD8DC;
  //border-bottom: 1px solid #f5f5f5;


}
</style>
