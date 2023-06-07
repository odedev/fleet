<template>
  <FlContentBoolean
    v-if="dataType === DataTypeEnum.Boolean.value"
    :model-value="value"
  />
  <FlContentText
    v-else-if="dataType === DataTypeEnum.String.value || dataType === DataTypeEnum.Text.value"
    :model-value="value"
  />
  <FlContentNumber
    v-else-if="dataType === DataTypeEnum.Integer.value || dataType === DataTypeEnum.Float.value"
    :model-value="value"
  />
  <FlContentDate
    v-else-if="dataType === DataTypeEnum.Date.value"
    :model-value="value"
  />
  <FlContentEnum
    v-else-if="dataType === DataTypeEnum.Enum.value"
    :model-value="value"
    :enumeration="props.enumeration"
  />
  <FlContentModel
    v-else-if="dataType === DataTypeEnum.Model.value"
    :model-value="value"
    :model="props.model"
    :display-field="props.displayField"
  />
  <FlContentJson
    v-else-if="dataType === DataTypeEnum.Json.value"
    :model-value="value"
  />
  <FlContentFile
    v-else-if="dataType === DataTypeEnum.File.value"
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
import DataTypeEnum from "../../enumerations/data_type_enum";

const props = defineProps<{
  modelValue: any,
  dataType: number,
  enumeration?: any,
  model?: any,
  displayField?: string,
}>();

const value = computed<any>(() => {
  return props.modelValue;
});

const dataType = computed<number>(() => props.dataType);

</script>
<style lang="scss">

</style>
