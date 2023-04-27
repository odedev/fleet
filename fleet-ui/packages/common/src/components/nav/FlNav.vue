<template>
  <nav class="nav">
    <IconMenuFold />
    <IconMenuUnfold />
    <slot></slot>
  </nav>
</template>
<script lang="ts" setup>
import {IconMenuFold, IconMenuUnfold} from "@arco-design/web-vue/es/icon";
</script>
<style lang="scss">
.nav {
  height: 48px;
  flex-basis: 48px;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  padding: 0;
}
</style>
