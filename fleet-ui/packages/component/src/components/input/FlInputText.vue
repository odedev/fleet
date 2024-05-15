<template>
<FlInputBase class="input-text">
  <Input
    ref="el"
    :model-value="value"
    :placeholder="placeholder"
    :disabled="isDisabled"
    :readonly="isReadonly"
    :error="isInvalid"
    :allow-clear="isNullable"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
    size="small"
  />
</FlInputBase>
</template>
<script lang="ts" setup>
import {ref, computed, onMounted} from "vue";
import {Input} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/input/style/index.css';
import FlInputBase from "./FlInputBase.vue";

const el = ref<HTMLInputElement>();

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
  modelValue: string,
  placeholder?: string,
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

const value = computed<string>(() => props.modelValue);
const placeholder = computed<string>(() => props.placeholder || '');
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid || (!props.isNullable && !props.modelValue));


const handleUpdate = (value: string) => {
  emits('update:modelValue', value);
};

const handleInput = (value: string, e: Event) => {
  emits('input', value);
};

const handleChange = (value: string, e: Event) => {
  emits('change', value);
};

const handleFocus = (e: FocusEvent) => {
  emits('focus', e);
};

const handleBlur = (e: FocusEvent) => {
  emits('blur', e);
};

const handleClear = (e: MouseEvent) => {
  console.log('clear')
  emits('clear', e);
  e.preventDefault();
  e.stopPropagation();
  emits('update:modelValue', '');
};


onMounted(() => {
  console.log('mounted')
  if (props.autofocus) {
    el.value?.focus();
  }
})
</script>
<style lang="scss">
.input-text {
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
}

</style>
