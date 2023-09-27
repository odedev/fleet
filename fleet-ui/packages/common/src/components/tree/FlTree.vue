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
        :selectable="true"
        :multiple="false"
        :checkable="false"
        :check-strictly="true"
        :block-node="true"
        :draggable="true"
        :show-line="false"
        :field-names="fieldNames"
        size="small"
      >
        <template #icon="node">
          <i>
            <component :is="node.icon" />
          </i>
        </template>
      </Tree>
    </div>
  </section>
</template>
<script lang="ts" setup>
import {ref, h} from "vue";
import {Tree, InputSearch, } from '@arco-design/web-vue'
import "@arco-design/web-vue/es/tree/style/index.css";
import "@arco-design/web-vue/es/tree-select/style/index.css";
import "@arco-design/web-vue/es/input/style/index.css";

import { IconApps, IconCommon, IconLayout, IconRelation, IconUnorderedList } from '@arco-design/web-vue/es/icon';

import type {TreeFieldNames} from '@arco-design/web-vue'

interface Props {
  modelValue: boolean,
  disabled?: boolean,
  checkable?: boolean,
  selectionType?: 'none' | 'single' | 'multiple',
}

const props = withDefaults(defineProps<Props>(), {
  disabled: false,
});

const emits = defineEmits(['click']);

const selectedKeys = ref([]);
const multiple = ref(true);

// 指定节点数据中的字段名
const fieldNames = ref<TreeFieldNames>({
  key: 'id',
  title: 'title',
  children: 'children',
  icon: 'icon',
  disabled: '',
  isLeaf: '',
  disableCheckbox: '',
  checkable: '',
});

const defaultTreeData = [
  {
    title: '用户中心',
    id: '0-0',
    children: [
      {
        icon: () => h(IconApps),
        draggable: false,
        title: '应用',
        id: '0-0-11',
        children: [
          {
            title: 'Leaf',
            id: '0-0-1-1'
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-1-2'
          }
        ]
      },
      {
        icon: () => h(IconCommon),
        draggable: false,
        title: '模型',
        id: '0-0-2',
        children: [
          {
            title: 'Leaf',
            id: '0-0-2-1'
          },
          {
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-2-2'
          }
        ]
      },
      {
        icon: () => h(IconUnorderedList),
        draggable: false,
        title: '枚举',
        id: '0-0-3',
        children: [
          {
            title: 'Leaf',
            id: '0-0-3-1'
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-3-2'
          }
        ]
      },
      {
        icon: () => h(IconRelation),
        draggable: false,
        title: '接口',
        id: '0-0-21',
        children: [
          {
            title: 'Leaf',
            id: '0-0-21-1'
          },
          {
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-21-2'
          }
        ]
      },
      {
        icon: () => h(IconLayout),
        draggable: false,
        title: '视图',
        id: '0-0-4',
        children: [
          {
            title: 'Leaf',
            id: '0-0-4-1'
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-4-2'
          }
        ]
      },
    ],
  },
  {
    title: '系统管理',
    id: '0-1',
    children: [
      {
        title: 'Branch 0-1-1',
        id: '0-1-1',
        children: [
          {
            title: 'Leaf',
            id: '0-1-1-1',
          },
          {
            title: 'Leaf',
            id: '0-1-1-2',
          },
        ]
      },
      {
        title: 'Leaf',
        id: '0-1-2',
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
  .arco-tree-node-icon {
    margin-right: 8px;
  }
}
</style>
