<template>
<div class="card-group">
  <slot></slot>
</div>
</template>

<script lang="ts" setup>

</script>

<style lang="scss">
.card-group {
  display: grid;
  grid-template-columns: repeat(3, auto);
  grid-row-gap: 16px;
  grid-column-gap: 16px;
}
</style>
