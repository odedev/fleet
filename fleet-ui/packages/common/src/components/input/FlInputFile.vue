<template>
  <FlInputBase class="input-file">
    <Upload
      action="/"
      :file-list="fileList"
      :multiple="false"
      :limit="2"
      :auto-upload="false"
      :show-file-list="false"
      :show-remove-button="false"
      :show-retry-button="false"
      :show-cancel-button="false"
      @change="handleChange" size="small">
      <template #upload-button>
        <Input allow-clear readonly size="small" >
          <template #suffix>
            <i v-show="isPreview" class="preview arco-icon-hover" @click="handlePreview">
              <IconEye />
            </i>
            <IconUpload />
          </template>
        </Input>
      </template>
    </Upload>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {ref} from 'vue';
import {Upload, Input} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/upload/style/index.css";
import '@arco-design/web-vue/es/input/style/index.css';
import {IconUpload, IconEye} from "@arco-design/web-vue/es/icon";
import FlInputBase from "./FlInputBase.vue";

const fileList = ref([]);
const file = ref(null);

const isPreview = ref(false);

const handleChange = (list, item) => {
  console.log(item);
  fileList.value = [item]
  file.value = item.file;
};

const handlePreview = (e: Event) => {
  e.stopPropagation();
  e.preventDefault();

};

</script>
<style lang="scss">
.input-file {

  cursor: auto  ;
  .arco-upload {
    width: 100%;
  }
  .arco-upload-hide {
    display: inline-block;
  }
  .arco-btn {
    height: 28px;
  }
  .arco-input-wrapper {
    padding-left: 8px;
    padding-right: 8px;
    //padding-top: 1px;
    //padding-bottom: 1px;
    //background-color: #FFFFFF;

    input.arco-input {
      height: 28px;
      line-height: 22px;
    }
  }

  .preview {
    padding: 4px 8px;
    cursor: pointer;

  }
}
</style>
