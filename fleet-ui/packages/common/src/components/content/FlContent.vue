<template>
  <FlContentBoolean v-if="dataType === 'boolean'"/>
  <FlContentText v-else-if="dataType === 'text'" />
  <FlContentNumber v-else-if="dataType === 'number'"/>
  <FlContentDate v-else-if="dataType === 'date'"/>
  <FlContentEnum v-else-if="dataType === 'enum'"/>
  <FlContentModel v-else-if="dataType === 'model'"/>
  <FlContentJson v-else-if="dataType === 'json'"/>
  <FlContentFile v-else-if="dataType === 'file'"/>
  <FlContentBase v-else>{{value}}</FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import FlContentText from "./FlContentText.vue";
import FlContentBoolean from "./FlContentBoolean.vue";
import FlContentNumber from "./FlContentNumber.vue";
import FlContentEnum from "./FlContentEnum.vue";
import FlContentDate from "./FlContentDate.vue";
import FlContentModel from "./FlContentModel.vue";
import FlContentJson from "./FlContentJson.vue";
import FlContentFile from "./FlContentFile.vue";

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

</style>
