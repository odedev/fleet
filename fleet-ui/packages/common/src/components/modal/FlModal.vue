<script lang="ts" setup>
import {ref} from 'vue';
import {Modal} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/modal/style/css.js';

const visible = ref(false);

const handleClick = () => {
  visible.value = true;
};
const handleOk = () => {
  visible.value = false;
};
const handleCancel = () => {
  visible.value = false;
}
</script>

<template>
  <Modal v-model:visible="visible" @ok="handleOk" @cancel="handleCancel">
    <template #title>
      Title
    </template>
    <div>
      You can customize modal body text by the current situation.
      This modal will be closed immediately once you press the OK button.
    </div>
  </Modal>
</template>

<style lang="scss" scoped>

</style>
