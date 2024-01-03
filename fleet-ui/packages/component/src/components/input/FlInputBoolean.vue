<template>
<FlInputBase class="input-boolean">
  <Checkbox
    :model-value="value"
    :disabled="isDisabled"
    @update:model-value="handleUpdate"
    @change="handleChange"
  />
</FlInputBase>
</template>
<script lang="ts" setup>
import {Checkbox} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/checkbox/style/index.css';

import FlInputBase from "./FlInputBase.vue";
import {computed} from "vue";

const emits = defineEmits([
  'update:modelValue',
  'change',
  'pressEnter'
]);


let props = withDefaults(defineProps<{
  modelValue: boolean,
  isNullable?: boolean,
  isDisabled?: boolean,
}>(), {
  isDisabled: false,
});

const value = computed<boolean>(() => props.modelValue)
const isDisabled = computed<boolean>(() => props.isDisabled);

const handleUpdate = (value: boolean): void => {
  emits('update:modelValue', value);
};

const handleChange = (value: boolean, e: Event): void => {
  emits('change', value);
};

</script>
<style lang="scss">
.input.input-boolean {
  width: 32px;
  padding: 0;
  align-items: center;
  justify-content: center;
  //justify-content: flex-start;

  .arco-checkbox {
    padding-left: 0;
  }
}
</style>
