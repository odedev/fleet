<template>
  <aside class="view-aside">
    <div class="view-aside-title">
      <h3>标题</h3>
    </div>
    <slot></slot>
    <div class="view-aside-content">
      <FlTree></FlTree>
    </div>
  </aside>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import FlTree from '../tree/FlTree.vue'


</script>
<style lang="scss">
.view-aside {
  height: 100%;
  width: 272px;
  flex-basis: 272px;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: column;
  padding: 0;
  border-right: 1px solid #f5f5f5;
  overflow: auto;

  .view-aside-title {
    padding: 8px;
    padding-bottom: 6px;
    font-size: 18px;
    line-height: 1;
    h3 {
      font-size: inherit;
    }
  }
  .view-aside-content {
    padding: 8px;
    height: 100%;
  }
}
</style>
