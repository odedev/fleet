<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import {getByValue} from "../../core/enumeration";

interface Props {
  modelValue: number,
  enumeration: any,
  color?: string,
}

const props = defineProps<Props>();

const value = computed<any>(() => {
  return getByValue(props.enumeration, props.modelValue);
});

const color = computed<any>(() => props.color);

</script>
<template>
  <FlContentBase class="content-enum" :color="color">
    {{value?.name}}
  </FlContentBase>
</template>
<style lang="scss">
.content.content-enum {
  //justify-content: center;
}
</style>
