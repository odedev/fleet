<template>
  <FlInputBoolean
    v-if="dataType === DataTypeEnum.Boolean.value"
    :model-value="value"
    :is-disabled="isDisabled"
    @update:model-value="handleUpdate"
    @change="handleChange"
  />
  <FlInputText
    v-else-if="dataType === DataTypeEnum.String.value"
    :model-value="value"
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
  <FlInputNumber v-else-if="dataType === DataTypeEnum.Integer.value || dataType === DataTypeEnum.Float.value"/>
  <FlInputDate v-else-if="dataType === DataTypeEnum.Date.value"/>
  <FlInputEnum v-else-if="dataType === DataTypeEnum.Enum.value"/>
  <FlInputModel v-else-if="dataType === DataTypeEnum.Model.value"/>
  <FlInputJson v-else-if="dataType === DataTypeEnum.Json.value"/>
  <FlInputFile v-else-if="dataType === DataTypeEnum.File.value"/>
  <FlInputBase v-else>{{value}}</FlInputBase>
</template>

<script lang="ts" setup>
import {computed} from "vue";
import FlInputBase from "./FlInputBase.vue";
import FlInputBoolean from "./FlInputBoolean.vue";
import FlInputText from "./FlInputText.vue";
import FlInputNumber from "./FlInputNumber.vue";
import FlInputDate from "./FlInputDate.vue";
import FlInputEnum from "./FlInputEnum.vue";
import FlInputModel from "./FlInputModel.vue";
import FlInputJson from "./FlInputJson.vue";
import FlInputFile from "./FlInputFile.vue";
import DataTypeEnum from "../../enumerations/data_type_enum";

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

const dataTypes = computed<string>(() => {
  switch (props.dataType) {
    case 0:
      return 'boolean';
    case 1:
    case 2:
      return 'text';
    case 3:
    case 4:
      return 'number';
    case 5:
      return 'date';
    case 6:
      return 'enum';
    case 7:
      return 'model';
    case 8:
      return 'json';
    case 9:
      return 'file';
  }
  return '';
});

const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid);


const handleUpdate = (value: string) => {
  console.log(value);
  emits('update:modelValue', value);
};

const handleInput = (value:string, e: Event) => {
  emits('input', value);
};

const handleChange = (value:string, e: Event) => {
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
