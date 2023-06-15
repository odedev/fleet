<template>
  <FlTableBox ref="table">
    <FlTableHead v-if="false" v-model="selectedRows" :model="model" ></FlTableHead>
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

const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
]);

const props = defineProps<{
  modelValue: any[],
  model: any,
  data?: any[],
  columns?: any[],
  isShowHead?: boolean,
}>();

const table = ref(null);
const value = ref('123');

const rowSelection = ref({
  // type: 'radio',
  type: 'checkbox',
  showCheckedAll: true,
  onlyCurrent: false,
});
const selectedKeys = ref([])
const selectedRows = ref([])
const fields = computed(() => props.model.fields);


const columns = computed(() => {
  let fields = props.columns || props.model.fields;
  let columns = [];

  for (let i = 0; i < fields.length; i++) {
    let field = fields[i];
    columns.push({
      code: field.code,
      name: field.name,
      dataType: field.dataType,
      width: field.width || 128,
    });
  }
  columns[columns.length - 1].width = '';
  return columns;
});

const data = computed(() => {
  return props.modelValue;
});


const handleRowClick = (row: never) => {
  const id = row.id;
  // selectedKeys.value = [id];
  // selectedRows.value = [row];
  if (!selectedKeys.value.includes(id)) {
    selectedKeys.value.push(id)
    selectedRows.value.push(row)
  } else {
    selectedKeys.value.splice(selectedKeys.value.indexOf(id), 1);
  }

  console.log(row);
  console.log(selectedKeys.value)

  emits('update:modelValue', unref(selectedRows));
};

const handleCellClick = (row, column) => {
  console.log(row, column)
}

onMounted(() => {
  console.log(table.value.clientHeight)
})
</script>

<style lang="scss">
@use "../../assets/mixin" as *;


</style>
