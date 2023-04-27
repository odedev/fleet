<template>
  <header id="header" class="header">
    <slot></slot>
  </header>
</template>

<script lang="ts" setup>

</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.header {
  --header-height: 64px;
  width: 100%;
  height: var(--header-height);
  padding: 0 16px 0 0;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--header-height);
  font-size: 16px;
  line-height: 1.5;
  color: #ffffff;
  background-color: #13c2c2;
  background-color: #69b1ff;
  background-color: #009688;
  background-color: #607D8B;
  background-color: #546E7A;
  @include background-color-primary();
  @include background-color-primary-theme();
}

</style>
