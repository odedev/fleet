<template>
  <Drawer :width="552" :visible="visible" @ok="handleOk" @cancel="handleCancel" unmountOnClose>
    <template #title>
      Title
    </template>
    <div>You can customize modal body text by the current situation. This modal will be closed immediately once you
      press the OK button.
    </div>
  </Drawer>
</template>

<script lang="ts" setup>
import {ref} from "vue";

import {Drawer} from '@arco-design/web-vue';
import '@arco-design/web-vue/es/drawer/style/css.js';

// width: 720, 552, 440, 336
const visible = ref(true);


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

<style scoped>

</style>
