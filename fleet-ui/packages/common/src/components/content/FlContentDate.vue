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
}>();

const value = computed<string>(() => {
  let format = getByValue(DateFormatEnum, 0);
  let fmt = format.name || 'YYYY-MM-DD HH:mm:ss'
  return dayjs(props.modelValue).format(fmt);
});

</script>
<style lang="scss">
.content.content-date {
  //justify-content: center;
}
</style>
