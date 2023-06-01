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
  return props.displayField ? props.modelValue[props.displayField] : props.modelValue?.name || props.modelValue;
});
</script>
<style lang="scss">
.content.content-model {

}
</style>
