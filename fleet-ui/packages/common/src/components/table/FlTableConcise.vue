<template>
  <FlTableBox>
<!--    <FlTableHead v-if="false" v-model="selectedRows" :model="model" ></FlTableHead>-->
<!--    <div class="table-head">-->
<!--      <h3>标题</h3>-->
<!--    </div>-->
<!--    <FlTableBody v-model="tableBodyDOMRect" ref="tableBody" >-->
    <div class="table-body" ref="tableBody">
      <Table
        :data="data"
        v-model:selected-keys="selectedKeys"
        row-key="id"
        :stripe="false"
        :table-layout-fixed="true"
        :column-resizable="true"
        :sticky-header="true"
        :bordered="{cell:true}"
        :row-selection="rowSelection"
        @row-click="handleRowClick"
        @cell-click="handleCellClick"
        @select="handleSelect"
        @selection-change="handleSelectionChange"
        @select-all="handleSelectAll"
        :pagination="false"
        size="large"
      >
        <template #columns>
          <template v-for="field in fields">
            <TableColumn :title="field.name" :data-index="field.code" :width="field.width">
              <template #cell="{ record }">
                <FlContent v-model="record[field.code]" :data-type="field.dataType" :model="field.modelType" :enumeration="field.enumType" />
              </template>
            </TableColumn>
          </template>
        </template>
      </Table>
    </div>
<!--    </FlTableBody>-->
    <FlTableFoot
      v-model:page-num="pageNum"
      :page-size="pageSize"
      :page-total="120"
      :is-filterable="true"
      :is-settable="true"
      :is-exportable="false"
      :is-importable="false"
      @change="handlePageNumChange"
      @filter-click="handleFilterClick"
    />
  </FlTableBox>
</template>

<script setup lang="ts">
import { ref, reactive, unref, computed, watch, watchEffect, onMounted } from 'vue';
import {Table, TableColumn} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/table/style/css.js';
import FlTableBox from "./FlTableBox.vue";
import FlTableHead from "./FlTableHead.vue";
import FlTableBody from "./FlTableBody.vue";
import FlTableFoot from "./FlTableFoot.vue";
import FlContent from "../content/FlContent.vue";
import {usePageSize, usePageSizes} from "../../composables/data_grid";

import type {TableRowSelection, TableData, TableColumnData} from "@arco-design/web-vue";

const emits = defineEmits([
  'update:modelValue',
  'update:selectionValue',
  'input',
  'change',
]);

interface Props {
  modelValue: any | any[],
  model: any,
  modelData?: any[],
  modelParameter?: any,
  selectionValue?: any[],
  selectionType?: 'none' | 'single' | 'multiple',
  // data?: any[],
  // columns?: any[],
  // isShowHead?: boolean,
  load?: Function,
}

const props = defineProps<Props>();

const tableBody = ref<HTMLDivElement>();
const tableBodyDOMRect = ref<DOMRect>();

const value = ref('123');
const pageNum = ref(1);
// const pageSize = usePageSize(tableBodyDOMRect, 10, 33, 41);
const pageSize = usePageSize(tableBody, 10, 33, 41);

const selectedKeys = ref<string[]>([]);
const selectedRows = ref<any[]>([]);
const fields = computed(() => props.model.fields);

watch(
  pageSize,
  value => {
    if (value) {
      handleLoad(pageNum.value, value)
    }
  }
)

// watch(
//   () => props.selectionValue,
//   value => {
//     if (value) {
//       selectedRows.value = props.selectionValue || [];
//       selectedKeys.value = props.selectionValue?.map(item => {
//         return item.id
//       }) || [];
//     }
//   }
// )

const rowSelection = computed<TableRowSelection | undefined>(() => {
  if (props.selectionType === 'none') {
    return null;
  } else if (props.selectionType === 'single') {
    return {
      title: '#',
      type: 'radio',
      fixed: true,
      showCheckedAll: true,
      onlyCurrent: true,
    }
  } else if (props.selectionType === 'multiple') {
    return {
      type: 'checkbox',
      fixed: true,
      showCheckedAll: true,
      onlyCurrent: false,
    }
  } else {
    return null;
  }
});

const data = computed(() => {
  return props.modelValue;
});


const handleRowClick = (row: TableData, e: Event) => {
  const id = row?.id;
  if (props.selectionType === 'none') {
    return;
  }

  if (props.selectionType === 'single') {
    selectedKeys.value = [id];
    selectedRows.value = [row];
  }

  if (props.selectionType === 'multiple') {
    if (!selectedKeys.value.includes(id)) {
      selectedKeys.value.push(id);
      selectedRows.value.push(row);
    } else {
      selectedKeys.value.splice(selectedKeys.value.indexOf(id), 1);
    }
  }
  console.log(selectedRows.value);
  console.log(selectedKeys.value)

  emits('update:selectionValue', selectedRows.value);
};

const handleCellClick = (row: TableData, column: TableColumnData, e: Event) => {
  console.log(row, column)
}

const handleSelect = (rowKeys: (string | number)[], rowKey: string | number, row: TableData): void => {
  console.log(rowKeys, rowKey, row)
}

const handleSelectionChange = (rowKeys: (string | number)[]) => {
  console.log(rowKeys);
}

const handleSelectAll = (checked: boolean) => {
  console.log(checked)
}

const handlePageNumChange = (pageNum: number) => {
    console.log('handlePageNumChange', pageNum);
    handleLoad(pageNum, pageSize.value);
};

const handleFilterClick = () => {
  console.log('filterClick');
};

const handleLoad = (pageNum: number, pageSize: number) => {
    console.log('onLoad', pageNum, pageSize);
};

onMounted(() => {
console.log('tableCOn')
})
</script>

<style lang="scss">
@use "../../assets/mixin" as *;


</style>
