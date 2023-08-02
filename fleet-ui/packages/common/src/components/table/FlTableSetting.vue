<template>
  <div class="table-setting">
    <slot></slot>
  </div>
</template>

<script lang="ts" setup>
import {Pagination, Tooltip} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/pagination/style/index.css";
import {IconFilter, IconSettings, IconUpload, IconDownload} from "@arco-design/web-vue/es/icon";

</script>

<style lang="scss">
@use "../../assets/mixin" as *;
.table-body {
  height: 100%;
  border: 1px solid #F6EDFF;
  border-bottom-width: 0;
  overflow: auto;

  .arco-table-container {
    border-radius: 0;
  }

  .arco-table-header {
    background-color: transparent;
  }

  //.arco-table .arco-table-element {
  //  width: auto;
  //  min-width: auto;
  //}

  .arco-table-body {
    min-height: 32px;
    //min-height: 96px;
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

  .arco-table .arco-table-cell {
    min-width: 48px;
  }
  .arco-table-border-cell .arco-table-th.arco-table-col-fixed-right,
  .arco-table-border-cell .arco-table-td.arco-table-col-fixed-right:not(.arco-table-tr-expand) {
    border-left: 1px solid var(--color-neutral-3);
  }

}
</style>
