<template>
  <FlContentBase class="content-enum">
    {{value?.name}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import {getByValue} from "../../utils/enum_utils";

const props = defineProps<{
  modelValue: number,
  enumeration: any,
}>();

const value = computed<any>(() => {
  console.log(getByValue(props.enumeration, props.modelValue))
  return getByValue(props.enumeration, props.modelValue);
});

</script>
<style lang="scss">
.content.content-enum {
  //justify-content: center;
}
</style>
