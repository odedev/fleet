<template>
  <section class="tree">
    <div class="tree-head">
      <slot></slot>
      <InputSearch size="small"/>
    </div>
    <div class="tree-body">
      <Tree
        v-model:selected-keys="selectedKeys"
        :data="treeData"
        size="small"
        :selectable="true"
        :multiple="false"
        :checkable="false"
        :check-strictly="true"
        :block-node="true"
        :draggable="true"
        :show-line="false"
      >
      </Tree>
    </div>
  </section>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import {Tree, InputSearch} from '@arco-design/web-vue'
import "@arco-design/web-vue/es/tree/style/index.css";
import "@arco-design/web-vue/es/tree-select/style/index.css";
import "@arco-design/web-vue/es/input/style/index.css";

const selectedKeys = ref([]);
const multiple = ref(true);
const defaultTreeData = [
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
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            key: '0-0-2-2'
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

const treeData = ref(defaultTreeData);
const checkedKeys = ref([]);
const checked = ref(false);


const onDrop = ({ dragNode, dropNode, dropPosition }) => {
  const data = treeData.value;
  const loop = (data: any, key: any, callback: Function) => {
    data.some((item: any, index: any, arr: any) => {
      if (item.key === key) {
        callback(item, index, arr);
        return true;
      }
      if (item.children) {
        return loop(item.children, key, callback);
      }
      return false;
    });
  };

  loop(data, dragNode.key, (_, index, arr) => {
    arr.splice(index, 1);
  });

  if (dropPosition === 0) {
    loop(data, dropNode.key, (item) => {
      item.children = item.children || [];
      item.children.push(dragNode);
    });
  } else {
    loop(data, dropNode.key, (_, index, arr) => {
      arr.splice(dropPosition < 0 ? index : index + 1, 0, dragNode);
    });
  }
}

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

  .tree-head {
    margin-bottom: 4px;
  }

  .arco-input-search {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }

  .arco-tree-node-title {
    padding: 3px 0;
  }
  .arco-tree-node-title-block .arco-tree-node-drag-icon {
    right: 2px;
  }
  .arco-tree-node-switcher {
    height: 28px;
  }
}
</style>
