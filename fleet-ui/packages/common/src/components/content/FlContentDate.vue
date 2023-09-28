<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import DateFormatEnum from "../../enumerations/date_format_enum";
import * as dateUtils from "../../utils/date_utils";
import {getByValue} from "../../core/enumeration";

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
    let dateFormat = getByValue(DateFormatEnum, props.format)
    if (dateFormat) {
      format = dateFormat.name
    }
  }
  return dateUtils.format(props.modelValue, format);
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
