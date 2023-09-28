<template>
  <FlInputBase class="input-json" @click="handleClick">
    <Input
      :model-value="value"
      :placeholder="placeholder"
      allow-clear
      allow-search
      readonly
      size="small"
    >
      <template #suffix>
        <IconCodeBlock />
      </template>
    </Input>
  </FlInputBase>
  <FlModal
      v-model="visible"
      :title="modelName"
      width="60%"
      @confirm="handleConfirm"
      @cancel="handleCancel"
  >
    <FlBlock>
      <FlEditorCode :model-value="codeValue" @update:model-value="handleUpdate"/>
    </FlBlock>
  </FlModal>
</template>
<script lang="ts" setup>
import {ref, computed} from "vue";
import {Input} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import {IconCodeBlock} from "@arco-design/web-vue/es/icon";
import FlInputBase from "./FlInputBase.vue";
import FlModal from "../modal/FlModal.vue";
import FlBlock from "../block/FlBlock.vue";
import FlEditorCode from "../editor/FlEditorCode.vue";

const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
  'focus',
  'blur',
  'clear',
  'pressEnter'
]);

let props = withDefaults(defineProps<{
  modelValue: any,
  model: any,
  modelData?: any[],
  modelParameter?: any,
  placeholder?: string,
  displayField?: string,
  isNullable?: boolean,
  isDisabled?: boolean,
  isReadonly?: boolean,
  isInvalid?: boolean,
  autofocus?: boolean,
}>(), {
  isNullable: true,
  isDisabled: false,
  isReadonly: false,
  isInvalid: false,
  autofocus: false,
});


const visible = ref(false);
const codeValue = ref<any>();

const modelName = computed(() => props.model?.name || '详情');

const value = computed<any>(() => {
  try {
    return JSON.stringify(props.modelValue);
  } catch (e) {
    return props.modelValue;
  }
});

const placeholder = computed<string>(() => props.placeholder || '');
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid || (!props.isNullable && !props.modelValue));


const handleClick = () => {
  console.log(isDisabled, isReadonly)
  if (isDisabled.value || isReadonly.value) {
    return;
  }
  codeValue.value = props.modelValue;
  visible.value = true;
};

const handleClear = (e: MouseEvent) => {
  console.log('clear')
  e.preventDefault();
  e.stopPropagation();
  emits('update:modelValue', null);
};

const handleUpdate = (val: any) => {
  console.log(val);
  codeValue.value = val;
};

const handleConfirm = () => {
  emits('update:modelValue', codeValue.value);
};

const handleCancel = (e: Event): any => {

};

</script>
<style lang="scss">
.input-json {
  .arco-input-wrapper {
    padding-left: 8px;
    padding-right: 8px;
  }
}
</style>
