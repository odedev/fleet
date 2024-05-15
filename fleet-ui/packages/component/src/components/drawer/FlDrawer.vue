<script setup lang="ts">
import {ref, computed} from "vue";
import {Drawer, Modal} from '@arco-design/web-vue';
import '@arco-design/web-vue/es/drawer/style/css.js';

// width: 720, 552, 440, 336

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
const width = computed(() => props.width || '50%');

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
  <Drawer
    class="drawer"
    :width="width"
    v-model:visible="value"
    :unmount-on-close="true"
    :footer="false"
    @update:visible="handleUpdate"
    @ok="handleOk"
    @cancel="handleCancel"
  >
    <template #title>
      {{title}}
    </template>
    <div>
      <slot></slot>
    </div>
  </Drawer>
</template>
<style lang="scss">
.drawer {

}
</style>
