<template>
  <FlContentBase class="content-date">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import dayjs from "dayjs";
import FlContentBase from "./FlContentBase.vue";
import DateFormatEnum from "../../enumerations/date_format_enum";
import {getByValue} from "../../utils/enum_utils";

const props = defineProps<{
  modelValue: Date | string,
  format?: number,
}>();

const value = computed<string>(() => {
  let format = DateFormatEnum.YYYY_MM_DD_HH_mm_ss.name || 'YYYY-MM-DD HH:mm:ss'
  if (props.format) {
    let dateFormat = getByValue(DateFormatEnum, props.format)
    if (dateFormat) {
      format = dateFormat.name
    }
  }
  return dayjs(props.modelValue).format(format);
});

</script>
<style lang="scss">
.content.content-date {
  //justify-content: center;
}
</style>
