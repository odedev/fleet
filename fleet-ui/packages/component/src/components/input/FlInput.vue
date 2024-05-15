<template>
  <FlInputBoolean
    v-if="dataType === DataTypeEnum.Boolean.value"
    :model-value="value"
    :placeholder="placeholder"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    @update:model-value="handleUpdate"
    @change="handleChange"
  />
  <FlInputText
    v-else-if="dataType === DataTypeEnum.String.value"
    :model-value="value"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputTextarea
    v-else-if="dataType === DataTypeEnum.Text.value"
    :model-value="value"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputNumber
    v-else-if="dataType === DataTypeEnum.Integer.value"
    :model-value="value"
    :precision="0"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputNumber
    v-else-if="dataType === DataTypeEnum.Float.value"
    :model-value="value"
    :precision="2"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputDate
    v-else-if="dataType === DataTypeEnum.Date.value"
    :model-value="value"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputEnum
    v-else-if="dataType === DataTypeEnum.Enum.value"
    :model-value="value"
    :enumeration="enumeration"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputModel
    v-else-if="dataType === DataTypeEnum.Model.value"
    :model-value="value"
    :model="model"
    :model-data="modelData"
    :model-parameter="modelParameter"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputJson
    v-else-if="dataType === DataTypeEnum.Json.value"
    :model-value="value"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputFile
    v-else-if="dataType === DataTypeEnum.File.value"
    :model-value="value"
    :placeholder="placeholder"
    :is-nullable="isNullable"
    :is-disabled="isDisabled"
    :is-readonly="isReadonly"
    :is-invalid="isInvalid"
    :autofocus="props.autofocus"
    @update:model-value="handleUpdate"
    @input="handleInput"
    @change="handleChange"
    @focus="handleFocus"
    @blur="handleBlur"
    @clear="handleClear"
  />
  <FlInputBase v-else>{{value}}</FlInputBase>
</template>

<script lang="ts" setup>
import {computed} from "vue";
import FlInputBase from "./FlInputBase.vue";
import FlInputBoolean from "./FlInputBoolean.vue";
import FlInputText from "./FlInputText.vue";
import FlInputTextarea from "./FlInputTextarea.vue";
import FlInputNumber from "./FlInputNumber.vue";
import FlInputDate from "./FlInputDate.vue";
import FlInputEnum from "./FlInputEnum.vue";
import FlInputModel from "./FlInputModel.vue";
import FlInputJson from "./FlInputJson.vue";
import FlInputFile from "./FlInputFile.vue";
import { DataTypeEnum } from "@fleet/common";

const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
  'focus',
  'blur',
  'clear',
  'pressEnter'
]);

const props = withDefaults(defineProps<{
  modelValue: any,
  dataType: number,
  enumeration?: any | any[],
  model?: any,
  modelData?: any[],
  modelParameter?: any,
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

const value = computed<any>(() => props.modelValue);
const dataType = computed<number>(() => props.dataType);
const enumeration = computed<any>(() => props.enumeration);
const model = computed<any>(() => props.model);
const modelData = computed<any>(() => props.modelData);
const modelParameter = computed<any>(() => props.modelParameter);
const placeholder = computed<string>(() => props.placeholder || '');
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid);


const handleUpdate = (value: any) => {
  emits('update:modelValue', value);
};

const handleInput = (value: any, e: Event) => {
  emits('input', value);
};

const handleChange = (value: any, e: Event) => {
  emits('change', value);
};

const handleFocus = (e: FocusEvent) => {
  emits('focus', e);
};

const handleBlur = (e: FocusEvent) => {
  emits('blur', e);
};

const handleClear = (e: MouseEvent) => {
  emits('clear', e);
};

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

</style>
