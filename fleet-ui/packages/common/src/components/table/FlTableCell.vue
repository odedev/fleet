<template>
<div class="cell" ref="el" @click="handleClick" @dblclick="handleDblclick">
  <FlInput
    v-if="isEditable"
    :data-type="dataType"
    :model-value="value"
    @update:model-value="handleUpdate"
    @blur="onBlur"
    autofocus
  />
  <FlContent
    v-else
    :data-type="dataType"
    :model-value="value"
  />
  <slot></slot>
</div>
</template>
<script lang="ts" setup>
import {ref, computed} from "vue";
import FlContent from "../content/FlContent.vue";
import FlInput from "../input/FlInput.vue";

const el = ref<HTMLDivElement>();
const isEditable = ref<boolean>(false);

const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
  'focus',
  'blur',
  'clear',
  'pressEnter'
]);

const props = defineProps<{
  dataType: number,
  modelValue: string,
  isEditable?: boolean,
  isNullable?: boolean,
  isDisabled?: boolean,
}>();

const value = computed<string>(() => props.modelValue);
const dataType = computed<number>(() => props.dataType);
console.log(value)

const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);

const handleClick = () => {

};

const handleDblclick = () => {
  if (!props.isEditable) {
    isEditable.value = false;
    return
  }
  isEditable.value = true;
  console.log(el)
  el.value?.querySelector('input')?.focus();
}


const handleUpdate = (value: string) => {
  console.log(value);
  emits('update:modelValue', value);
};

const onBlur = () => {
  isEditable.value = false;
}

</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.cell {
  width: 336px;
  width: 272px;
  width: 100%;
  // max-width: 272px;
  height: 28px;
  height: 32px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  flex-wrap: nowrap;
  font-size: 14px;
  line-height: 22px;
  // padding: 0 8px;

  @include ellipsis();

}
</style>
