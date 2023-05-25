<template>
  <FlInputBoolean v-if="dataType === 'boolean'"/>
  <FlInputText v-else-if="dataType === 'text'" />
  <FlInputNumber v-else-if="dataType === 'number'"/>
  <FlInputDate v-else-if="dataType === 'date'"/>
  <FlInputEnum v-else-if="dataType === 'enum'"/>
  <FlInputModel v-else-if="dataType === 'model'"/>
  <FlInputJson v-else-if="dataType === 'json'"/>
  <FlInputFile v-else-if="dataType === 'file'"/>
  <FlInputBase v-else>{{value}}</FlInputBase>
</template>

<script lang="ts" setup>
import {computed} from "vue";
import FlInputBase from "./FlInputBase.vue";
import FlInputBoolean from "./FlInputBoolean.vue";
import FlInputText from "./FlInputText.vue";
import FlInputNumber from "./FlInputNumber.vue";
import FlInputDate from "./FlInputDate.vue";
import FlInputEnum from "./FlInputEnum.vue";
import FlInputModel from "./FlInputModel.vue";
import FlInputJson from "./FlInputJson.vue";
import FlInputFile from "./FlInputFile.vue";


const props = defineProps<{
  modelValue: any,
  dataType: number,
}>();

const value = computed<string>(() => {
  return props.modelValue;
});

const dataType = computed<string>(() => {
  switch (props.dataType) {
    case 0:
      return 'boolean';
    case 1:
    case 2:
      return 'text';
    case 3:
    case 4:
      return 'number';
    case 5:
      return 'date';
    case 6:
      return 'enum';
    case 7:
      return 'model';
    case 8:
      return 'json';
    case 9:
      return 'file';
  }
  return '';
});


const emits = defineEmits(['update:modelValue']);


</script>

<style lang="scss">
@use "../../assets/mixin" as *;

</style>
