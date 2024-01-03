<template>
  <FlInputBase class="input-number">
    <InputNumber
      ref="el"
      :model-value="value"
      :min="min"
      :max="max"
      :precision="precision"
      :placeholder="placeholder"
      :disabled="isDisabled"
      :readonly="isReadonly"
      :error="isInvalid"
      :allow-clear="isNullable"
      :hide-button="true"
      :step="1"
      @update:model-value="handleUpdate"
      @input="handleInput"
      @change="handleChange"
      @focus="handleFocus"
      @blur="handleBlur"
      @clear="handleClear"
      size="small"
    >
      <template #suffix>
        <IconOriginalSize />
      </template>
    </InputNumber>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {ref, computed, onMounted} from "vue";
import {InputNumber} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input-number/style/index.css";
import {IconOriginalSize} from "@arco-design/web-vue/es/icon";
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
  modelValue: number,
  min?: number,
  max?: number,
  precision?: number,
  placeholder?: string,
  isNullable?: boolean,
  isDisabled?: boolean,
  isReadonly?: boolean,
  isInvalid?: boolean,
  autofocus?: boolean,
}>(), {
  precision: 0,
  isNullable: true,
  isDisabled: false,
  isReadonly: false,
  isInvalid: false,
  autofocus: false,
});


const value = computed<number>(() => props.modelValue);
const min = computed<number>(() => props.min || -Infinity);
const max = computed<number>(() => props.max || Infinity);
const precision = computed<number>(() => props.precision);
const placeholder = computed<string>(() => props.placeholder || '');
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid || (!props.isNullable && !props.modelValue));


const handleUpdate = (value: number): void => {
  emits('update:modelValue', value);
};

const handleInput = (value: number, inputValue: string, e: Event): any => {
  emits('input', value);
};

const handleChange = (value: number, e: Event) => {
  emits('change', value);
};

const handleFocus = (e: FocusEvent) => {
  emits('focus', e);
};

const handleBlur = (e: FocusEvent) => {
  emits('blur', e);
};

const handleClear = (e: MouseEvent): void => {
  emits('clear', e);
  e.preventDefault();
  e.stopPropagation();
  emits('update:modelValue', 0);
};


onMounted(() => {
  console.log('mounted')
  if (props.autofocus) {
    el.value?.focus();
  }
})

</script>
<style lang="scss">
.input-number {
  .arco-input-number {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }

}
</style>
