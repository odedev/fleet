<template>
  <FlInputBase class="input-tree">
    <TreeSelect :allow-search="true" :allow-clear="true" size="small" :data="treeData">

    </TreeSelect>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {TreeSelect} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/tree-select/style/index.css";
import FlInputBase from "./FlInputBase.vue";

const treeData = [
  {
    title: 'Trunk 0-0',
    key: '0-0',
    children: [
      {
        title: 'Branch 0-0-1',
        key: '0-0-1',
        children: [
          {
            title: 'Leaf 0-0-1-1',
            key: '0-0-1-1'
          },
          {
            title: 'Leaf 0-0-1-2',
            key: '0-0-1-2'
          }
        ]
      },
    ],
  },
  {
    title: 'Trunk 0-1',
    key: '0-1',
    children: [
      {
        title: 'Branch 0-1-1',
        key: '0-1-1',
        children: [
          {
            title: 'Leaf 0-1-1-0',
            key: '0-1-1-0',
          }
        ]
      },
      {
        title: 'Branch 0-1-2',
        key: '0-1-2',
        children: [
          {
            title: 'Leaf 0-1-2-0',
            key: '0-1-2-0',
          }
        ]
      },
    ],
  },
];
</script>
<style lang="scss">
.input-tree {
  .arco-select-view-search {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }
}
</style>
