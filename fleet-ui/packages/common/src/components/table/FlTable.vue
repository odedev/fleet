<template>
  <section ref="table" class="table-box">
    <div class="table-head">
      <h3>标题</h3>
      <div style="font-size: 10px;line-height: 1;">已选 3 项 <span>清空</span></div>
      <div>
        <FlButtonGroup>
          <FlButton type="primary" size="small">执行DDL</FlButton>
          <FlButton type="primary" size="small">生成代码</FlButton>
          <FlButton type="primary" size="small">维护功能</FlButton>
          <FlButton type="primary" size="small">新增</FlButton>
        </FlButtonGroup>
      </div>
    </div>
    <div class="table-body">
      <Table
        :columns="columns"
        :data="data"
        size="large"
        :stripe="true"
        :table-layout-fixed="true"
        :column-resizable="true"
        :sticky-header="10"
        :bordered="{cell:true}"
        :draggable="{ type: 'handle', width: 40 }"
        :pagination="false">
        <template #columns>
          <TableColumn title="name">
            <template #cell>
              <FlTableCell  v-model="value" :data-type="1" :is-editable="isEditable"/>
            </template>
          </TableColumn>
          <TableColumn title="code">
            <template #cell>
              <FlTableCell v-model="value" :data-type="0" :is-editable="isEditable"/>
            </template>
          </TableColumn>
          <TableColumn title="code" :width="221">
            <template #cell>
              <FlTableCell v-model="value" :data-type="1" :is-editable="isEditable"/>
            </template>
          </TableColumn>
          <TableColumn title="code" :width="221">
            <template #cell>
              <FlTableCell v-model="value" :data-type="1" :is-editable="isEditable"/>
            </template>
          </TableColumn>
          <TableColumn title="code" :width="221">
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
    </div>
    <div class="table-foot">
      <div class="table-action">
        <i class="icon">
          <Tooltip :mini="true" content="设置"><IconSettings /></Tooltip>
        </i>
        <i class="icon">
          <Tooltip :mini="true" content="导入"><IconUpload /></Tooltip>
        </i>
        <i class="icon">
          <Tooltip :mini="true" content="导出"><IconDownload /></Tooltip>
        </i>
      </div>
      <div class="table-pagination">
        <div style="margin-right: 18px;">每页 10 条</div>
        <Pagination  :total="150000" size="small" show-total></Pagination>
      </div>
    </div>
  </section>

</template>

<script lang="ts" setup>
import { ref, reactive, computed, onMounted } from 'vue';
import {Table, TableColumn, Pagination, Tooltip, Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/table/style/css.js';
import {IconFilter, IconSettings, IconUpload, IconDownload} from "@arco-design/web-vue/es/icon";
import FlButton from "../button/FlButton.vue";
import FlButtonGroup from "../button/FlButtonGroup.vue";
import FlTableCell from "./FlTableCell.vue";
import FlTableCellButton from "./FlTableCellButton.vue";

const table = ref(null);
const value = ref('123');

const props = defineProps<{
  dataType: number,
  modelValue: string,
  isEditable?: boolean,
  isNullable?: boolean,
  isDisabled?: boolean,
}>();

const isEditable = computed<boolean>(() => props.isEditable);
const operationColumnWidth = computed<number>(() => {
  if (props.isEditable) {
    return 86;
  } else {
    return 140;
  }
});

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

.table-box {
  display: flex;
  flex-direction: column;
  height: 100%;

  .table-head {
    width: 100%;
    height: 36px;
    flex-basis: 36px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: flex-end;
    padding-bottom: 4px;

    h3 {
      font-size: 18px;
      line-height: 1;
      font-weight: 500;
    }
  }
  .table-body {
    height: 100%;
    border: 1px solid #F6EDFF;
    border-bottom-width: 0;
    overflow: auto;

    .arco-table-container {
      border-radius: 0;
    }

    .arco-table-th,
    .arco-table-td {
      min-width: 34px;
    }
    .arco-table-th .arco-table-cell {
      padding: 9px 8px;
    }
    .arco-table-td .arco-table-cell {
      padding: 4px 0;
      padding: 0;
    }

    .arco-table-border-cell .arco-table-th.arco-table-col-fixed-right,
    .arco-table-border-cell .arco-table-td.arco-table-col-fixed-right:not(.arco-table-tr-expand) {
      border-left: 1px solid var(--color-neutral-3);
    }

  }
  .table-foot {
    width: 100%;
    height: 32px;
    flex-basis: 32px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    border: 1px solid #F6EDFF;

    .table-action {
      height: 100%;
      width: 80px;
      flex-basis: 80px;
      flex-grow: 0;
      flex-shrink: 0;
      display: flex;
      flex-direction: row;
      justify-content: space-between;
      align-items: center;
      font-size: 20px;
      line-height: 1;
      padding: 0 4px;

      .icon {
        display: block;
        width: 28px;
        height: 28px;
        padding: 4px;
        cursor: pointer;

        &:hover {
          @include background-color-tertiary();
          @include background-color-tertiary-theme();
        }
      }
    }

    .table-pagination {
      height: 100%;
      width: 100%;
      flex-basis: 100%;
      flex-grow: 1;
      flex-shrink: 1;
      display: flex;
      flex-direction: row;
      justify-content: flex-end;
      align-items: center;

      overflow-y: hidden;
      overflow-x: auto;
      overflow-x: overlay;

      font-size: 14px;
    }
  }
  .arco-table-hover:not(.arco-table-dragging) .arco-table-tr:not(.arco-table-tr-empty):not(.arco-table-tr-summary):hover .arco-table-td:not(.arco-table-col-fixed-left):not(.arco-table-col-fixed-right),
  .arco-table-hover .arco-table-tr-drag .arco-table-td:not(.arco-table-col-fixed-left):not(.arco-table-col-fixed-right) {
    @include background-color-tertiary();
    @include background-color-tertiary-theme();
  }

  .arco-pagination-item:hover,
  .arco-pagination-item-active,
  .arco-pagination-item-active:hover {
    @include background-color-tertiary();
    @include background-color-tertiary-theme();
  }

  .arco-pagination .arco-pagination-item-previous.arco-pagination-item-disabled,
  .arco-pagination .arco-pagination-item-next.arco-pagination-item-disabled {
    color: rgb(201,205,212);
    background-color: transparent;
  }
}

</style>
