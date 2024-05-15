<script setup lang="ts">
import {ref, computed} from 'vue';
import {Modal} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/modal/style/css.js';

interface Props {
  modelValue: boolean,
  title?: string,
  width?: string,
}

const props = withDefaults(defineProps<Props>(), {
  modelValue: false,
});

const emits = defineEmits(['update:modelValue', 'confirm', 'cancel']);

const value = computed(() => props.modelValue);
const title = computed(() => props.title || '详情');
const width = computed(() => props.width || '80%');

const handleBeforeOk = () => {
  return true;
};

const handleBeforeCancel = () => {
  return true;
};

const handleUpdate = (value: boolean) => {
  emits('update:modelValue', value);
}

const handleOk = () => {
  emits('confirm');
};

const handleCancel = () => {
  emits('cancel')
}

const handleClose = () => {
};
</script>
<template>
  <Modal
    class="modal"
    title-align="start"
    v-model:visible="value"
    :width="width"
    :title="title"
    :hide-cancel="false"
    :unmount-on-close="true"
    :mask-closable="true"
    :on-before-ok="handleBeforeOk"
    :on-before-cancel="handleBeforeCancel"
    @update:visible="handleUpdate"
    @ok="handleOk"
    @cancel="handleCancel"
    @close="handleClose"
  >
    <slot></slot>
  </Modal>
</template>
<style lang="scss">
.modal {
  .arco-modal {
    height: 80%;
  }
  .arco-modal-body {
    height: calc(100% - 113px);
    padding: 0;
  }
}
</style>
