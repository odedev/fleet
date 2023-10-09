<template>
<div class="cell" ref="el" @click="handleClick" @dblclick="handleDblclick">
  <FlInput
    v-if="isEditable"
    :data-type="dataType"
    :model-value="value"
    :is-nullable="false"
    @update:model-value="handleUpdate"
    @change="handleChange"
    @blur="handleBlur"
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

const props = withDefaults(defineProps<{
  modelValue: any,
  dataType: number,
  isEditable?: boolean,
  isNullable?: boolean,
  isDisabled?: boolean,
}>(), {
  isEditable: true,
  isNullable: true,
  isDisabled: false,
});

const value = computed<string>(() => props.modelValue);
const dataType = computed<number>(() => props.dataType);
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);

const handleClick = () => {

};

const handleDblclick = () => {
  console.log(props.isDisabled)
  if (!props.isEditable || props.isDisabled) {
    isEditable.value = false;
    return
  }
  isEditable.value = true;
  // el.value?.querySelector('input')?.focus();
}


const handleUpdate = (value: any) => {
  console.log(value);
  emits('update:modelValue', value);
};

const handleChange = (value: any) => {
  if (dataType.value === 0) {
    isEditable.value = false;
  }
};

const handleBlur = () => {
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
