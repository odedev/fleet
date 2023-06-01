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
          <TableColumn title="name">
            <template #cell>
              <FlContent  v-model="value" :data-type="1" />
            </template>
          </TableColumn>
          <TableColumn title="code">
            <template #cell>
              <FlContent v-model="value" :data-type="0" />
            </template>
          </TableColumn>
          <TableColumn title="code" :width="221">
            <template #cell>
              <FlContent v-model="value" :data-type="1" />
            </template>
          </TableColumn>
          <TableColumn title="code" :width="221">
            <template #cell>
              <FlContent v-model="value" :data-type="0" />
            </template>
          </TableColumn>
          <TableColumn title="code" :width="221">
            <template #cell>
              <FlContent v-model="value" :data-type="1" />
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
  datas: any[],
  columns: any[],
  dataType?: number,
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

const columns = [
  {
    title: 'Name',
    dataIndex: 'name',
    ellipsis: true,
    tooltip: true,
    width: 100
  },
  {
    title: 'Salary',
    dataIndex: 'salary',
  },
  {
    title: 'Address',
    dataIndex: 'address',
  },
  {
    title: 'Email',
    dataIndex: 'email',
  },
];
const data = reactive([{
  id: '1',
  name: 'Jane Doe',
  salary: 23000,
  address: '32 Park Road, London',
  email: 'jane.doe@example.com'
}, {
  id: '2',
  name: 'Alisa Ross',
  salary: 25000,
  address: '35 Park Road, London',
  email: 'alisa.ross@example.com'
}, {
  id: '3',
  name: 'Kevin Sandra',
  salary: 22000,
  address: '31 Park Road, London',
  email: 'kevin.sandra@example.com'
}, {
  id: '4',
  name: 'Ed Hellen',
  salary: 17000,
  address: '42 Park Road, London',
  email: 'ed.hellen@example.com'
}, {
  id: '5',
  name: 'William Smith',
  salary: 27000,
  address: '62 Park Road, London',
  email: 'william.smith@example.com'
}]);

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
