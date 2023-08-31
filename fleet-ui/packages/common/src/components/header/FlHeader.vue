<template>
  <header id="header" class="header">
    <FlLogo></FlLogo>
    <slot></slot>
    <FlProfile></FlProfile>
  </header>
</template>

<script lang="ts" setup>
import FlLogo from './FlLogo.vue'
import FlProfile from './FlProfile.vue'

</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.header {
  --header-height: 64px;
  --header-height: 56px;
  width: 100%;
  height: var(--header-height);
  padding: 0;
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
}

</style>
