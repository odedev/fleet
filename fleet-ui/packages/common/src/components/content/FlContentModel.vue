<template>
  <FlContentBase class="content-model">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import {getDisplayFieldCode} from "../../utils/model_utils";

const props = defineProps<{
  modelValue: any,
  displayField?: string,
  model?: any,
}>();

const value = computed<any>(() => {
  let displayField: string = props.displayField || getDisplayFieldCode(props.model);
  return props.modelValue[displayField] || props.modelValue;
});
</script>
<style lang="scss">
.content.content-model {

}
</style>
