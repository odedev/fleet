<script setup lang="ts">
import {ref, computed, onMounted, watch} from 'vue';
import {Table, TableColumn} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/table/style/css.js';
import FlTableBox from "./FlTableBox.vue";
import FlTableHead from "./FlTableHead.vue";
import FlTableBody from "./FlTableBody.vue";
import FlTableFoot from "./FlTableFoot.vue";
import FlTableCell from "./FlTableCell.vue";
import FlTableCellButton from "./FlTableCellButton.vue";

import FlButton from "../button/FlButton.vue";
import FlButtonAdd from "../button/FlButtonAdd.vue";
import FlButtonGroup from "../button/FlButtonGroup.vue";

import {usePageSize, usePageValue} from "@fleet/base";

import type { TableDraggable } from '@arco-design/web-vue';

let data: any[] = [];


interface Props {
  modelValue: any[],
  model: any,
  modelData?: any[],
  modelParameter?: any,
  load?: Function,

  pageCount?: number,

  isEditable?: boolean,
  isNullable?: boolean,
  isDisabled?: boolean,
  isDraggable?: boolean,
  isFilterable?: boolean,
  isSettable?: boolean,
  isImportable?: boolean,
  isExportable?: boolean,
}

const emits = defineEmits(['update:model-value']);

const props = withDefaults(defineProps<Props>(), {
  isEditable: false,
  isFilterable: true,
  isSettable: true,
  isImportable: true,
  isExportable: true,
});

const table = ref<HTMLDivElement>();
const tableBody = ref<HTMLDivElement>();

const pageNum = ref(1);

const selectionValues = ref<any[]>([]);

// const value = computed(() => props.modelValue);
const fields = computed(() => props.model.fields);
const pageCount = computed(() => props.pageCount ?? props.modelValue.length);

const isEditable = computed<boolean>(() => props.isEditable);

const pageSize = usePageSize(tableBody, 10, 33, 41);
const value = usePageValue(data, props.modelValue, pageNum, pageSize, props.pageCount);

const model = computed<any>(() => props.model);

const operationColumnWidth = computed<number>(() => {
  if (props.isEditable) {
    // return 86;
    return 121;
  } else {
    return 141;
  }
});

const draggable = computed<TableDraggable | undefined>(() => {
  if (props.isDraggable) {
    return {
      type: 'handle',
      width: 40
    }
  }
  return;
});


watch(
  pageSize,
  value => {
    if (value) {
      handleLoad(pageNum.value, value)
    }
  }
);

const handlePageNumChange = (pageNum: number) => {
  console.log('handlePageNumChange', pageNum);
  handleLoad(pageNum, pageSize.value);
};

const handleLoad = (pageNum: number, pageSize: number) => {
  console.log('onLoad', pageNum, pageSize);
};

onMounted(() => {
})
</script>

<template>
  <FlTableBox>
    <FlTableHead v-model="selectionValues" :model="model">
      <FlButtonGroup>
        <slot></slot>
        <FlButtonAdd></FlButtonAdd>
      </FlButtonGroup>
    </FlTableHead>
    <FlTableBody>
     <div class="table-body--content" ref="tableBody">
      <Table
        :data="value"
        size="large"
        :stripe="true"
        :table-layout-fixed="true"
        :column-resizable="true"
        :sticky-header="0"
        :bordered="{cell:true}"
        :draggable="draggable"
        :pagination="false">
          <template #columns>
            <template v-for="field in fields">
              <TableColumn :title="field.name" :data-index="field.code" :width="field.width">
                <template #cell="{ record }">
                  <FlTableCell v-model="record[field.code]" :data-type="field.dataType" :model="field.modelType" :enumeration="field.enumType"  :is-editable="isEditable"/>
                </template>
              </TableColumn>
            </template>
            <TableColumn title="操作" :width="operationColumnWidth" align="center" fixed="right">
              <template #cell>
                <FlTableCellButton :is-editable="isEditable"/>
              </template>
            </TableColumn>
          </template>
      </Table>
     </div>
   </FlTableBody>
    <FlTableFoot
      v-model:page-num="pageNum"
      :page-size="pageSize"
      :page-count="pageCount"
      :is-filterable="props.isFilterable"
      :is-settable="props.isSettable"
      :is-importable="props.isImportable"
      :is-exportable="props.isExportable"
      @change="handlePageNumChange"
    >
    </FlTableFoot>
  </FlTableBox>

</template>

<style lang="scss">
@use "../../assets/mixin" as *;

.table-body--content {
  height: 100%;
  overflow: auto;
}
</style>
