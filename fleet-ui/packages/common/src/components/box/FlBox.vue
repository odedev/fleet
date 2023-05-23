<template>
  <section class="box">
    <h3 class="box-title">表单</h3>
    <div class="box-content">
      <slot></slot>
    </div>
  </section>
</template>

<script lang="ts" setup>

</script>

<style lang="scss">
.box {
  width: 100%;
  height: max-content;
  flex-basis: max-content;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: flex-start;
  align-content: flex-start;
  padding: 16px;

  .box-title {
    width: 100%;
    padding-bottom: 8px;
    font-size: 18px;
    line-height: 1;
    font-weight: 600;
    display: none;
  }
  .box-content {
    width: 100%;
    display: flex;
    flex-direction: row;
    align-items: flex-start;
    justify-content: flex-start;
    align-content: flex-start;
    flex-wrap: wrap;
  }
}
</style>
