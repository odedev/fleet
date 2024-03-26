<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import FlContentText from "./FlContentText.vue";
import FlContentBoolean from "./FlContentBoolean.vue";
import FlContentNumber from "./FlContentNumber.vue";
import FlContentEnum from "./FlContentEnum.vue";
import FlContentDate from "./FlContentDate.vue";
import FlContentModel from "./FlContentModel.vue";
import FlContentTextarea from "./FlContentTextarea.vue";
import FlContentJson from "./FlContentJson.vue";
import FlContentFile from "./FlContentFile.vue";
import { DataTypeEnum } from "@fleet/common";


interface Props {
  modelValue: any,
  dataType: number,
  enumeration?: any,
  model?: any,
  display?: Function,
  color?: "primary" | "secondary" | "tertiary" | "neutral" | "error" | "warn" | "success" | "info" | undefined,
}

const props = defineProps<Props>();

const value = computed<any>(() => {
  return props.modelValue;
});

const dataType = computed<number>(() => props.dataType);
const color = computed<string>(() => props.color as string);

</script>

<template>
  <FlContentBoolean
    v-if="dataType === DataTypeEnum.Boolean.value"
    :model-value="value"
  />
  <FlContentText
    v-else-if="dataType === DataTypeEnum.String.value"
    :model-value="value"
    :color="color"
  />
  <FlContentTextarea
    v-else-if="dataType === DataTypeEnum.Text.value"
    :model-value="value"
    :color="color"
  />
  <FlContentNumber
    v-else-if="dataType === DataTypeEnum.Integer.value"
    :model-value="value"
    :precision="0"
    :color="color"
  />
  <FlContentNumber
    v-else-if="dataType === DataTypeEnum.Float.value"
    :model-value="value"
    :precision="2"
    :color="color"
  />
  <FlContentDate
    v-else-if="dataType === DataTypeEnum.Date.value"
    :model-value="value"
    :color="color"
  />
  <FlContentEnum
    v-else-if="dataType === DataTypeEnum.Enum.value"
    :model-value="value"
    :enumeration="props.enumeration"
    :color="color"
  />
  <FlContentModel
    v-else-if="dataType === DataTypeEnum.Model.value"
    :model-value="value"
    :model="props.model"
    :display="props.display"
    :color="color"
  />
  <FlContentJson
    v-else-if="dataType === DataTypeEnum.Json.value"
    :model-value="value"
    :color="color"
  />
  <FlContentFile
    v-else-if="dataType === DataTypeEnum.File.value"
    :model-value="value"
    :color="color"
  />
  <FlContentBase v-else>{{value}}</FlContentBase>
</template>
