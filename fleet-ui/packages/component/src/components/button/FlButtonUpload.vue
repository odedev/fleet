<script setup lang="ts">
import {ref, computed} from "vue";
import {Upload} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/upload/style/css.js';
import FlButtonBase from "./FlButtonBase.vue";
import FlButton from "./FlButton.vue";
import type {FileItem} from "@arco-design/web-vue";

interface Props {
  accept?: string,     // 接收的上传文件类型
  limit?: number,      // 限制上传文件的数量。0表示不限制
  multiple?: boolean,  // 是否支持多文件上传
  isDirectory?: boolean, // 是否支持文件夹上传（需要浏览器支持）
  disabled?: boolean,  // 是否禁用

  directory?: string,  // 上传目录
  category?: string,  // 分类
  scope?: string,     // 域
}

const props = withDefaults(defineProps<Props>(), {
  limit: 0,
  multiple: true,
  disabled: false,
});

const emits = defineEmits(['click']);

const fileList = ref([]);

const limit = computed(() => props.limit || 0);
const multiple = computed(() => props.multiple || true);
const isDirectory = computed(() => props.isDirectory || false);
const disabled = computed(() => props.disabled || false);

const handleChange = (fileList: FileItem[], fileItem: FileItem) => {
  console.log(fileList, fileItem.file);
  emits('click');
};

const handleProgress = (fileItem: FileItem, event: ProgressEvent) => {
  console.log(event, fileItem);
  emits('click');
};

</script>
<template>
  <FlButtonBase>
    <Upload
      v-model:file-list="fileList"
      action="/"
      :auto-upload="false"
      :show-file-list="false"
      :limit="limit"
      :multiple="multiple"
      :directory="isDirectory"
      :disabled="disabled"
      @change="handleChange"
    >
      <template #upload-button>
        <FlButton type="primary" :disabled="disabled">上传</FlButton>
      </template>
    </Upload>
  </FlButtonBase>
</template>
<style lang="scss">
@use "../../assets/mixin" as *;

</style>
