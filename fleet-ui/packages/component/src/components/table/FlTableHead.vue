<script setup lang="ts">
import {Modal} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/modal/style/index.css";
import FlTableConcise from "./FlTableConcise.vue";
import {ref} from "vue";

const props = defineProps<{
  modelValue: any[],
  model: any,
  data?: any[],
  columns?: any[],
}>();

const visible = ref(false);

const handleView = (e: FocusEvent) => {

  visible.value = true;
};

</script>

<template>
  <div class="table-head">
    <h3>标题</h3>
    <div style="font-size: 11px;line-height: 1;">已选 <span @click="handleView">3</span> 项 <span>清空</span></div>
    <div>
      <slot></slot>
    </div>
  </div>
  <Modal v-model:visible="visible" title="已选数据" title-align="start" width="80%" unmountOnClose>
    <FlTableConcise :model-value="props.modelValue" :model="props.model"/>
  </Modal>
</template>

<style lang="scss">
.table-head {
  --table-head-height: 36px;
  --table-head-height: 32px;
  width: 100%;
  height: var(--table-head-height);
  flex-basis: var(--table-head-height);
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
</style>
