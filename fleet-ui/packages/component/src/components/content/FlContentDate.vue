<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import { DateUtils, DateFormatEnum, enumeration } from "@fleet/common";

interface Props {
  modelValue: Date | string,
  format?: number,
  color?: string,
}

const props = withDefaults(defineProps<Props>(), {
  format: DateFormatEnum.YYYY_MM_DD_HH_mm_ss.value,
});

const value = computed<string>(() => {
  let format = DateFormatEnum.YYYY_MM_DD_HH_mm_ss.name || 'YYYY-MM-DD HH:mm:ss'
  if (props.format) {
    let dateFormat = enumeration.getByValue(DateFormatEnum, props.format)
    if (dateFormat) {
      format = dateFormat.name
    }
  }
  return DateUtils.format(props.modelValue, format);
});

const color = computed<any>(() => props.color);

</script>
<template>
  <FlContentBase class="content-date" :color="color">
    {{value}}
  </FlContentBase>
</template>

<style lang="scss">
.content.content-date {
  //justify-content: center;
}
</style>
