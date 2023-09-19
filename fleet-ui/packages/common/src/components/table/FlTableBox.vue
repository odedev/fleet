<script setup lang="ts">

</script>
<template>
  <section ref="table" class="table-box">
    <slot></slot>
  </section>
</template>


<style lang="scss">
.table-box {
  display: flex;
  flex-direction: column;
  height: 100%;
}
</style>
