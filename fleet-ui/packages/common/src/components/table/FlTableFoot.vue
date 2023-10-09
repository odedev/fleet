<template>
  <div class="table-foot">
    <div class="table-action">
      <i class="icon" v-if="props.isFilterable" @click="handleFilterClick">
        <Tooltip :mini="true" content="过滤"><IconFilter /></Tooltip>
      </i>
      <i class="icon" v-if="props.isSettable" @click="handleSettingClick">
        <Tooltip :mini="true" content="设置"><IconSettings /></Tooltip>
      </i>
      <i class="icon" v-if="props.isImportable" @click="handleImportClick">
        <Tooltip :mini="true" content="导入"><IconUpload /></Tooltip>
      </i>
      <i class="icon" v-if="props.isExportable" @click="handleExportClick">
        <Tooltip :mini="true" content="导出"><IconDownload /></Tooltip>
      </i>
<!--      <FlTableFilter />-->
      <slot></slot>
    </div>
    <div class="table-pagination">
      <div class="table-pagination-size">每页 {{pageSize}} 条</div>
      <Pagination
        :current="pageNum"
        :page-size="pageSize"
        :total="pageCount"
        :show-total="true"
        :hide-on-single-page="false"
        @change="handleChange"
        size="small" />
    </div>
  </div>
</template>

<script lang="ts" setup>
import {ref, computed} from "vue";
import {Pagination, Tooltip} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/pagination/style/index.css";
import {IconFilter, IconSettings, IconUpload, IconDownload} from "@arco-design/web-vue/es/icon";
import FlTableFilter from "./FlTableFilter.vue";
const emits = defineEmits([
  'update:pageNum',
  'change',
  'filterClick',
  'settingClick',
  'importClick',
  'exportClick',
]);

const props = withDefaults(defineProps<{
  pageNum: number,
  pageSize: number,
  pageCount: number,
  count?: number,
  isFilterable: boolean,
  isSettable: boolean,
  isImportable: boolean,
  isExportable: boolean,
}>(), {
  isFilterable: true,
  isSettable: true,
  isImportable: false,
  isExportable: false,
});

const pageNum = computed<number>(() => props.pageNum || 1);
const pageSize = computed<number>(() => props.pageSize || 10);
const pageCount = computed<number>(() => props.pageCount || 0);

const handleFilterClick = () => {
  emits('filterClick');
};

const handleSettingClick = () => {
  emits('settingClick');
}

const handleImportClick = () => {
  emits('importClick');
}

const handleExportClick = () => {
  emits('exportClick');
}

const handleChange = (current: number) => {
  emits('update:pageNum', current);
  emits('change', current)
}

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
    width: 120px;
    flex-basis: 80px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    justify-content: flex-start;
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
  .table-pagination-size {
    margin-right: 16px;
  }
}
</style>
