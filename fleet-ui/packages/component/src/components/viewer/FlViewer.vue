<script lang="ts" setup>
import {Scrollbar} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/scrollbar/style/css.js';
</script>

<template>
  <div class="viewer">
    <Scrollbar style="height:100%;overflow: auto;">
      <slot></slot>
    </Scrollbar>
  </div>
</template>

<style lang="scss">
.viewer {
  width: 100%;
  height: 100%;
  overflow: auto;
  padding: 16px;

  .arco-scrollbar-track-direction-vertical {
    width: 6px;
  }
  .arco-scrollbar-thumb-direction-vertical .arco-scrollbar-thumb-bar {
    width: 6px;
    margin: 0;
  }
}
</style>
