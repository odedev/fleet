<template>
  <FlContentBoolean
    v-if="dataType === 'boolean'"
    :model-value="value"
  />
  <FlContentText
    v-else-if="dataType === 'text'"
    :model-value="value"
  />
  <FlContentNumber
    v-else-if="dataType === 'number'"
    :model-value="value"
  />
  <FlContentDate
    v-else-if="dataType === 'date'"
    :model-value="value"
  />
  <FlContentEnum
    v-else-if="dataType === 'enum'"
    :model-value="value"
    :enums="props.enums"
  />
  <FlContentModel
    v-else-if="dataType === 'model'"
    :model-value="value"
    :display-field="props.displayField"
  />
  <FlContentJson
    v-else-if="dataType === 'json'"
    :model-value="value"
  />
  <FlContentFile
    v-else-if="dataType === 'file'"
    :model-value="value"
  />
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
  enums?: any[],
  displayField?: string,
}>();

const value = computed<any>(() => {
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

</script>
<style lang="scss">

</style>
