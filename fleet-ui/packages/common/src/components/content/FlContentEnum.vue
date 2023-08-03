<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import {getByValue} from "../../utils/enum_utils";

const props = defineProps<{
  modelValue: number,
  enumeration: any,
}>();

const value = computed<any>(() => {
  return getByValue(props.enumeration, props.modelValue);
});

</script>

<template>
  <FlContentBase class="content-enum">
    {{value?.name}}
  </FlContentBase>
</template>

<style lang="scss">
.content.content-enum {
  //justify-content: center;
}
</style>
