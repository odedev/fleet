<template>
  <div class="tree">
    <slot></slot>
    <Tree v-model:selected-keys="selectedKeys"
      :data="treeData"
      size="small"
      :selectable="true"
      :multiple="false"
      :checkable="false"
      :check-strictly="true"
      :block-node="true"
      :draggable="true"
      :show-line="false"
    ></Tree>
  </div>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import {Tree} from '@arco-design/web-vue'
import '@arco-design/web-vue/es/tree/style/css.js';

const selectedKeys = ref([]);
const multiple = ref(true);
const treeData = [
  {
    title: '用户中心',
    key: '0-0',
    children: [
      {
        title: '用户',
        key: '0-0-1',
      },
      {
        title: 'Branch 0-0-2',
        key: '0-0-2',
        children: [
          {
            title: 'Leaf',
            key: '0-0-2-1'
          }
        ]
      },
    ],
  },
  {
    title: '系统管理',
    key: '0-1',
    children: [
      {
        title: 'Branch 0-1-1',
        key: '0-1-1',
        children: [
          {
            title: 'Leaf',
            key: '0-1-1-1',
          },
          {
            title: 'Leaf',
            key: '0-1-1-2',
          },
        ]
      },
      {
        title: 'Leaf',
        key: '0-1-2',
      },
    ],
  },
];

</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.tree {
  height: 100%;
  width: 100%;
  max-width: 272px;
  display: flex;
  flex-direction: column;
  padding: 0;
  overflow: auto;

  .arco-tree-node-title {
    padding: 3px 0;
  }
  .arco-tree-node-title-block .arco-tree-node-drag-icon {
    right: -14px;
  }
  .arco-tree-node-switcher {
    height: 28px;
  }
}
</style>
