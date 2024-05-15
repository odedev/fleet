<script setup lang="ts">
import {computed, ref} from "vue";
import FlContentBase from "./FlContentBase.vue";
import FlModal from "../modal/FlModal.vue";
import FlBlock from "../block/FlBlock.vue";
import FlDescription from "../description/FlDescription.vue";

interface Props {
  modelValue: any,
  color?: string,
}

const props = defineProps<Props>();

const visible = ref(false);

const value = computed<any>(() => props.modelValue?.name);
const color = computed<any>(() => props.color);

const handleClick = () => {
  visible.value = true;
};

const model = {
  id: "1665926265829355520",
  code: 'ResourceFile',
  name: '资源文件',
  fullName: "dev.osmanthus.fleet.core.file.model.ResourceFileModel",
  description: null,
  fields: [
    {
      id: "1665926651155869697",
      code: "name",
      name: "名称",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
    {
      id: "1665926651155869697",
      code: "size",
      name: "大小",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
    {
      id: "1665926651155869697",
      code: "type",
      name: "类型",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
    {
      id: "1665926651155869697",
      code: "path",
      name: "路径",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
    {
      id: "1665926651155869697",
      code: "url",
      name: "url",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
    {
      id: "1665926651155869697",
      code: "location",
      name: "位置",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
    {
      id: "1665926651155869697",
      code: "directory",
      name: "目录",
      dataType: 1,
      dataLength: 255,
      enumType: null,
      modelType: null,
      isSlaveModel: false,
      isNullable: false,
      isSearchable: true,
      isDefaultDisplay: true,
      note: null,
      sequence: "20",
    },
  ]
}

</script>
<template>
  <FlContentBase class="content-file" :color="color" @click="handleClick">
    {{value}}
  </FlContentBase>
  <FlModal v-model="visible" :title="value" width="70%">
    <FlBlock>
      <FlDescription :model-value="props.modelValue" :model="model"/>
    </FlBlock>
  </FlModal>
</template>
<style lang="scss">
.content.content-file {
  //justify-content: center;
  cursor: pointer;
}
</style>
