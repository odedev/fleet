<template>
  <FlInputBase class="input-date">
    <DatePicker show-time format="YYYY-MM-DD HH:mm:ss"  size="small"/>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {DatePicker} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/date-picker/style/index.css";
import "@arco-design/web-vue/es/time-picker/style/index.css";
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


let props = withDefaults(defineProps<{
  modelValue: string,
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

const value = computed<string>(() => props.modelValue)
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid);



</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.input-date {
  .arco-picker {
    width: 100%;
    height: 30px;
    padding-left: 0px;
    padding-right: 8px;

    input {
      @include surface-color();
    }
  }
}

</style>
