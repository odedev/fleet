<template>
  <section ref="table" class="table-box">
    <div class="table-head">
      <h3>标题</h3>
      <div>
        <FlButton type="primary" size="small">新增</FlButton>
      </div>
    </div>
    <div class="table-body">
      <Table
        :columns="columns"
        :data="data"
        :stripe="true"
        :table-layout-fixed="true"
        :column-resizable="true"
        :bordered="{cell:true}"
        :draggable="{ type: 'handle', width: 40 }"
        :pagination="false">
      </Table>
    </div>
    <div class="table-foot">
      <div class="icon">
        <i><IconFilter /></i>
        <i><IconUpload /></i>
        <i><IconDownload /></i>
      </div>
      <div>
        <Pagination  :total="150000" size="small" show-total></Pagination>
      </div>
    </div>
  </section>

</template>

<script lang="ts" setup>
import { ref, reactive, onMounted } from 'vue';
import FlButton from "../button/FlButton.vue";
import {IconFilter, IconUpload, IconDownload} from "@arco-design/web-vue/es/icon";
import {Table, Pagination} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/table/style/css.js';

const table = ref(null);

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

    .arco-table-container {
      border-radius: 0;
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

    .icon {

      height: 100%;
      width: 80px;
      display: flex;
      flex-direction: row;
      justify-content: space-between;
      align-items: center;
      font-size: 24px;
      line-height: 1;
    }
  }
}

</style>
