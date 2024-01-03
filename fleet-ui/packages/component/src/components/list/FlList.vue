<script setup lang="ts">
import {computed} from 'vue';
import {List, ListItem, Checkbox} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/list/style/css.js';

interface Props {
  modelValue: any,
  dataType?: number,
}

const props = defineProps<Props>();

const value = computed<any>(() => props.modelValue);

</script>
<template>
<div class="list">
  <List size="small">
    <ListItem>
      <div class="list-item">
        <Checkbox></Checkbox>
        <div>Beijing Bytedance Technology Co., Ltd.</div>
      </div>
    </ListItem>
    <ListItem>Bytedance Technology Co., Ltd.</ListItem>
    <ListItem>Beijing Toutiao Technology Co., Ltd.</ListItem>
    <ListItem>Beijing Volcengine Technology Co., Ltd.</ListItem>
    <ListItem>China Beijing Bytedance Technology Co., Ltd.</ListItem>
  </List>
</div>
</template>
<style>
.list {
  .list-item {
    display: flex;
    flex-direction: row;

    .arco-checkbox {
      padding-left: 0;
      padding-right: 6px;
    }
  }
  .arco-list-small .arco-list-content-wrapper .arco-list-footer,
  .arco-list-small .arco-list-content-wrapper .arco-list-content > .arco-list-item,
  .arco-list-small .arco-list-content-wrapper .arco-list-content .arco-list-col > .arco-list-item,
  .arco-list-small .arco-list-content-wrapper .arco-list-content.arco-list-virtual .arco-list-item {
    padding: 9px 16px 8px;
  }
}
</style>
