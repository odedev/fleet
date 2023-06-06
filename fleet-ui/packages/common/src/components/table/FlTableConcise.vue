<template>
  <FlTableBox ref="table">
    <FlTableHead></FlTableHead>
    <FlTableBody>
      <Table
        :columns="columns"
        :data="data"
        v-model:selected-keys="selectedKeys"
        row-key="id"
        :stripe="false"
        :table-layout-fixed="true"
        :column-resizable="true"
        :sticky-header="10"
        :bordered="{cell:true}"
        :row-selection="rowSelection"
        @row-click="handleRowClick"
        :pagination="false"
        size="large"
      >
        <template #columns>
          <template v-for="column in columns">
            <TableColumn :title="column.name" :data-index="column.code" :width="column.width">
              <template #cell="{ record }">
                <FlContent v-model="record[column.code]" :data-type="column.dataType" />
              </template>
            </TableColumn>
          </template>
          <TableColumn title="code">
            <template #cell>
              <FlTableCell :model-value="12" :data-type="1" :is-editable="false"/>
            </template>
          </TableColumn>
        </template>
      </Table>
    </FlTableBody>
    <FlTableFoot></FlTableFoot>
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
  modelValue: any,
  model: any,
  data?: any[],
  columns?: any[],
}>();

const table = ref(null);
const value = ref('123');

const rowSelection = ref({
  type: 'radio',
  // type: 'checkbox',
  showCheckedAll: true,
  onlyCurrent: false,
});
const selectedKeys = ref([])
const selectedRows = ref([])

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


 let c = [
  {
    name: 'Name',
    code: 'name',
    ellipsis: true,
    tooltip: true,
    width: 100,
    dataType: 1,
  },
  {
    name: 'Salary',
    code: 'salary',
    width: 100,
    dataType: 2,
  },
  {
    name: 'Address',
    code: 'address',
    width: 100,
    dataType: 1,
  },
  {
    name: 'Email',
    code: 'email',
    dataType: 1,
  },
];


const handleRowClick = (row: never) => {
  selectedKeys.value = [row.id];
  selectedRows.value = [row];

  console.log(row);
  console.log(selectedKeys.value)

  emits('update:modelValue', unref(selectedRows));
};

onMounted(() => {
  console.log(table.value.clientHeight)
})
</script>

<style lang="scss">
@use "../../assets/mixin" as *;


</style>
