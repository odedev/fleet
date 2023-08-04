<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import {getDisplayFieldCode} from "../../core/model";

const props = defineProps<{
  modelValue: any,
  model?: any,
  display?: Function,
}>();

const value = computed<any>(() => {
  let displayField: string = getDisplayFieldCode(props.model);
  let value = props.modelValue?.[displayField] || props.modelValue;
  if (props.display) {
    value = props.display(props.modelValue);
  }
  console.log(value)
  return value;
});
</script>

<template>
  <FlContentBase class="content-model">
    {{value}}
  </FlContentBase>
</template>

<style lang="scss">
.content.content-model {

}
</style>
