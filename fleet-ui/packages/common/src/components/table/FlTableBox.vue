<template>
  <section ref="table" class="table-box">
    <slot></slot>
  </section>
</template>

<script lang="ts" setup>

</script>

<style lang="scss">
.table-box {
  display: flex;
  flex-direction: column;
  height: 100%;
}
</style>
