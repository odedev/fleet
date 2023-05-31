<template>
  <FlButtonBase>
    <Upload action="/" :auto-upload="false">
      <template #upload-button>
        <FlButton type="primary">上传</FlButton>
      </template>
    </Upload>
  </FlButtonBase>
</template>
<script lang="ts" setup>
import {Upload} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/upload/style/css.js';
import FlButtonBase from "./FlButtonBase.vue";
import FlButton from "./FlButton.vue";

import {computed} from "vue";

const emit = defineEmits(['click']);

const handleClick = () => {
  emit('click');
};

</script>
<style lang="scss">
@use "../../assets/mixin" as *;


</style>
