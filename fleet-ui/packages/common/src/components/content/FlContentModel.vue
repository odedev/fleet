<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import {getDisplayFieldCode} from "../../core/model";

interface Props {
  modelValue: any,
  model?: any,
  display?: Function,
  color?: string,
}

const props = defineProps<Props>();

const value = computed<any>(() => {
  let displayField: string = getDisplayFieldCode(props.model);
  let value = props.modelValue?.[displayField] || props.modelValue;
  if (props.display) {
    value = props.display(props.modelValue);
  }
  return value;
});

const color = computed<any>(() => props.color);

</script>
<template>
  <FlContentBase class="content-model" :color="color">
    {{value}}
  </FlContentBase>
</template>
<style lang="scss">
.content.content-model {

}
</style>
