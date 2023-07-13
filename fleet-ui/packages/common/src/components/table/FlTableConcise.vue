<template>
  <FlTableBox ref="table">
<!--    <FlTableHead v-if="false" v-model="selectedRows" :model="model" ></FlTableHead>-->
<!--    <div class="table-head">-->
<!--      <h3>标题</h3>-->
<!--    </div>-->
    <FlTableBody>
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
    </FlTableBody>
    <FlTableFoot :count="10" :is-exportable="false" :is-importable="false" :is-settable="false"></FlTableFoot>
  </FlTableBox>

</template>

<script lang="ts" setup>
import { ref, reactive, unref, computed, onMounted } from 'vue';
import {Table, TableColumn} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/table/style/css.js';
import FlTableBox from "./FlTableBox.vue";
import FlTableHead from "./FlTableHead.vue";
import FlTableBody from "./FlTableBody.vue";
import FlTableFoot from "./FlTableFoot.vue";
import FlContent from "../content/FlContent.vue";

import type {TableRowSelection, TableData, TableColumnData} from "@arco-design/web-vue";

const emits = defineEmits([
  'update:modelValue',
  'update:selectionValue',
  'input',
  'change',
]);

const props = defineProps<{
  modelValue: any[],
  model: any,
  selectionValue?: any[],
  selectionType?: 'none' | 'single' | 'multiple',
  // data?: any[],
  // columns?: any[],
  isShowHead?: boolean,
}>();

const table = ref(null);
const value = ref('123');

const selectedKeys = ref<string[]>([]);
const selectedRows = ref<any[]>([]);
const fields = computed(() => props.model.fields);

const rowSelection = computed<TableRowSelection | null>(() => {
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
    return;
  }

  if (!selectedKeys.value.includes(id)) {
    selectedKeys.value.push(id);
    selectedRows.value.push(row);
  } else {
    selectedKeys.value.splice(selectedKeys.value.indexOf(id), 1);
  }

  console.log(row);
  console.log(selectedKeys.value)

  emits('update:selectionValue', unref(selectedRows));
};

const handleCellClick = (row: TableData, column: TableColumnData, e: Event) => {
  console.log(row, column)
}

const handleSelect = (rowKeys: string | number[], rowKey: string | number, row: TableData) => {
  console.log(rowKeys, rowKey, row)
}

const handleSelectionChange = (rowKeys: (string | number)[]) => {
  console.log(rowKeys);
}

const handleSelectAll = (checked: boolean) => {
  console.log(checked)
}



onMounted(() => {
  const tableEl = table.value as unknown as HTMLDivElement;
  console.log(tableEl?.clientHeight)
})
</script>

<style lang="scss">
@use "../../assets/mixin" as *;


</style>
