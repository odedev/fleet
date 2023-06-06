<template>
  <FlContentBase class="content-model">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: any,
  displayField?: string,
  model?: any,
}>();

const value = computed<any>(() => {
  let displayField: string = props.displayField || 'name';
  if (props.model) {
    for (const field of props.model.fields) {
      if (field.isDefaultDisplay) {
        displayField = field.code;
        break
      }
    }
  }
  return props.modelValue[displayField] || props.modelValue;
});
</script>
<style lang="scss">
.content.content-model {

}
</style>
