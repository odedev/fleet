<script setup lang="ts">
import {ref, computed} from "vue";
import {Tree, InputSearch} from '@arco-design/web-vue'
import "@arco-design/web-vue/es/tree/style/index.css";
import "@arco-design/web-vue/es/tree-select/style/index.css";
import "@arco-design/web-vue/es/input/style/index.css";

import type {TreeFieldNames} from '@arco-design/web-vue'

interface Props {
  modelValue: any | any[],
  title?: string,
  // disabled?: boolean,
  // checkable?: boolean,
  isSearchable?: boolean,
  isDraggable?: boolean,
  selectionType?: 'none' | 'single' | 'multiple',
}

const props = withDefaults(defineProps<Props>(), {
  disabled: false,
  isSearchable: true,
  isDraggable: false,
});

const emits = defineEmits(['click']);

const value = computed(() => props.modelValue);
const title = computed(() => props.title || '');
const isSearchable = computed(() => props.isSearchable || true);
const isDraggable = computed(() => props.isDraggable || false);

const selectedKeys = ref([]);
const multiple = ref(true);

// 指定节点数据中的字段名
const fieldNames = ref<TreeFieldNames>({
  key: 'id',
  title: 'name',
  children: 'children',
  icon: 'icon',
  disabled: '',
  isLeaf: '',
  disableCheckbox: '',
  checkable: '',
});


const checkedKeys = ref([]);
const checked = ref(false);


const onDrop = ({ dragNode, dropNode, dropPosition }) => {
  const data = value.value;
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
<template>
  <section class="tree">
    <h3 class="tree-head" v-if="title">
      {{title}}
    </h3>
    <div class="tree-search" v-if="isSearchable">
      <InputSearch size="small"/>
    </div>
    <div class="tree-body">
      <Tree
        v-model:selected-keys="selectedKeys"
        :data="value"
        :selectable="true"
        :multiple="false"
        :checkable="false"
        :check-strictly="true"
        :default-expand-all="false"
        :draggable="isDraggable"
        :block-node="true"
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
<style lang="scss">
@use "../../assets/mixin" as *;

.tree {
  height: 100%;
  width: 100%;
  //max-width: 272px;
  display: flex;
  flex-direction: column;
  padding: 0;
  overflow: hidden;

  .tree-head {
    flex-grow: 0;
    flex-shrink: 0;
    margin-bottom: 4px;
  }
  .tree-search {
    flex-grow: 0;
    flex-shrink: 0;
    margin-bottom: 4px;
  }
  .tree-body {
    height: 100%;
    flex-grow: 1;
    flex-shrink: 1;
    overflow: auto;
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
