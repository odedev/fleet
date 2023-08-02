<template>
  <FlTableBox ref="table">
    <FlTableHead>
      <FlButtonGroup>
        <FlButton type="primary">执行DDL</FlButton>
        <FlButton type="success">生成代码</FlButton>
        <FlButton type="primary">维护功能</FlButton>
        <FlButtonAdd>新增</FlButtonAdd>
      </FlButtonGroup>
    </FlTableHead>
    <FlTableBody>
      <Table
        :columns="columns"
        :data="data"
        size="large"
        :stripe="true"
        :table-layout-fixed="true"
        :column-resizable="true"
        :sticky-header="10"
        :bordered="{cell:true}"
        :draggable="draggable"
        :pagination="false">
          <template #columns>
            <TableColumn title="name" :width="208">
              <template #cell>
                <FlTableCell  v-model="value" :data-type="1" :is-editable="isEditable"/>
              </template>
            </TableColumn>
            <TableColumn title="code" :width="64">
              <template #cell>
                <FlTableCell v-model="value" :data-type="0" :is-editable="isEditable"/>
              </template>
            </TableColumn>
            <TableColumn title="code" :width="208">
              <template #cell>
                <FlTableCell v-model="value" :data-type="1" :is-editable="isEditable"/>
              </template>
            </TableColumn>
            <TableColumn title="code" :width="208">
              <template #cell>
                <FlTableCell v-model="value" :data-type="1" :is-editable="isEditable"/>
              </template>
            </TableColumn>
            <TableColumn title="code" :width="221">
            <template #cell>
              <FlTableCell v-model="value" :data-type="1" :is-editable="isEditable"/>
            </template>
          </TableColumn>
            <TableColumn title="code" width="auto">
              <template #cell>
                <FlTableCell v-model="value" :data-type="1" :is-editable="isEditable"/>
              </template>
            </TableColumn>
          <TableColumn title="操作" :width="operationColumnWidth" align="center" fixed="right">
            <template #cell>
              <FlTableCellButton :is-editable="isEditable"/>
            </template>
          </TableColumn>
        </template>
      </Table>
    </FlTableBody>
    <FlTableFoot
      :page-size="10"
      :page-total="1200"
      :is-filterable="props.isFilterable"
      :is-settable="props.isSettable"
      :is-importable="props.isImportable"
      :is-exportable="props.isExportable">
    </FlTableFoot>
  </FlTableBox>

</template>

<script lang="ts" setup>
import { ref, reactive, computed, onMounted } from 'vue';
import {Table, TableColumn, Pagination, Tooltip, Button} from "@arco-design/web-vue";
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
const table = ref(null);
const value = ref('123456789abcdefghijklmnopqrstuvwxyz');

const props = withDefaults(defineProps<{
  dataType: number,
  modelValue: string,
  isEditable?: boolean,
  isNullable?: boolean,
  isDisabled?: boolean,
  isDraggable?: boolean,
  isFilterable?: boolean,
  isSettable?: boolean,
  isImportable?: boolean,
  isExportable?: boolean,
}>(), {
  isFilterable: true,
  isSettable: true,
  isImportable: true,
  isExportable: true,
});

const isEditable = computed<boolean>(() => props.isEditable);
const operationColumnWidth = computed<number>(() => {
  if (props.isEditable) {
    return 86;
  } else {
    return 140;
  }
});

const draggable = computed(() => {
  if (props.isDraggable) {
    return {
      type: 'handle',
      width: 40
    }
  }
  return;
})
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
  key: '1',
  name: 'Jane Doe',
  salary: 23000,
  address: '32 Park Road, London',
  email: 'jane.doe@example.com'
}, {
  key: '2',
  name: 'Alisa Ross',
  salary: 25000,
  address: '35 Park Road, London',
  email: 'alisa.ross@example.com'
}, {
  key: '3',
  name: 'Kevin Sandra',
  salary: 22000,
  address: '31 Park Road, London',
  email: 'kevin.sandra@example.com'
}, {
  key: '4',
  name: 'Ed Hellen',
  salary: 17000,
  address: '42 Park Road, London',
  email: 'ed.hellen@example.com'
}, {
  key: '5',
  name: 'William Smith',
  salary: 27000,
  address: '62 Park Road, London',
  email: 'william.smith@example.com'
}]);

onMounted(() => {
  console.log(table.value.clientHeight)
})
</script>

<style lang="scss">
@use "../../assets/mixin" as *;


</style>
