<template>
  <div class="content">
    <div class="content-value">
      <slot></slot>
    </div>
  </div>
</template>
<script lang="ts" setup>
</script>
<style lang="scss">
.content {
  height: 28px;
  height: 32px;
  //height: 40px;
  width: 100%;
  width: 336px;
  width: 272px;
  min-width: 40px;
  padding: 0 8px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  flex-direction: row;
  flex-wrap: nowrap;

  .content-value {

    font-size: 14px;
    line-height: 22px;
    overflow: hidden;
    white-space: nowrap;
    text-overflow:ellipsis;
    letter-spacing: normal;
  }
}
</style>
