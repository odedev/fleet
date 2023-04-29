<template>
  <nav class="tab">
    <IconMenuFold />
    <IconMenuUnfold />
    <slot></slot>
  </nav>
</template>
<script lang="ts" setup>
import {IconMenuFold, IconMenuUnfold} from "@arco-design/web-vue/es/icon";
</script>
<style lang="scss">
.tab {
  --tab-height: 48px;
  --tab-height: 40px;
  height: var(--tab-height);
  flex-basis: var(--tab-height);
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
