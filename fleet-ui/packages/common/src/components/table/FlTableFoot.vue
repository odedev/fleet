<template>
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
</template>

<script lang="ts" setup>
import {Pagination, Tooltip} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/pagination/style/index.css";
import {IconFilter, IconSettings, IconUpload, IconDownload} from "@arco-design/web-vue/es/icon";

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

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
</style>
