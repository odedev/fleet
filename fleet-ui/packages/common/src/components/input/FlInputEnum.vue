<template>
  <FlInputBase class="input-enum">
    <Select
      :model-value="value"
      :disabled="isDisabled"
      :readonly="isReadonly"
      :error="isInvalid"
      :allow-clear="isNullable"
      :multiple="false"
      :allow-search="true"
      @update:model-value="handleUpdate"
      @change="handleChange"
      @clear="handleClear"
      size="small">
      <Option v-for="item in props.enums" :value="item.value" :label="item.name"></Option>
    </Select>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {Select, Option} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/select/style/index.css";
import FlInputBase from "./FlInputBase.vue";
import {computed} from "vue";


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
  modelValue: number,
  enums: any[],
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

const value = computed<number>(() => props.modelValue)
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid);


const handleUpdate = (value: number) => {
  console.log(value);
  emits('update:modelValue', value);
};

const handleChange = (value:number, e: Event) => {
  emits('change', value);
};

const handleClear = (e: MouseEvent) => {
  emits('clear', e);
  handleUpdate(0);
  handleChange(0, e);
};

</script>
<style lang="scss">
.input-enum {
  .arco-select {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }
}
.arco-select-dropdown .arco-select-option {
  line-height: 30px;
}
</style>
