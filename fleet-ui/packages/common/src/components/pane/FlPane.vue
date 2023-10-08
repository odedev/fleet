<script setup lang="ts">
import {Tabs, TabPane} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/tabs/style/css.js";

</script>

<template>
  <Tabs type="line" default-active-key="1">
    <TabPane key="1" title="Tab 1">
      <slot></slot>
    </TabPane>
    <TabPane key="3">
      <template #title>Tab 3</template>
    </TabPane>
  </Tabs>
</template>

<style scoped lang="scss">

</style>
