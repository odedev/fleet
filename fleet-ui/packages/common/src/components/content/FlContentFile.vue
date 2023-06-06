<template>
  <FlContentBase class="content-file" @click="handleClick">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: any,
  displayField?: string,
}>();

const value = computed<any>(() => {
  return props.displayField ? props.modelValue[props.displayField] : props.modelValue?.name;
});

const handleClick = () => {
  console.log(props.modelValue);
};

</script>
<style lang="scss">
.content.content-file {
  //justify-content: center;
  cursor: pointer;
}
</style>
