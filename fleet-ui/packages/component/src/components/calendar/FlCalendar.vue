<script lang="ts" setup>
import { ref, computed } from "vue";
import { Calendar } from '@arco-design/web-vue';
import '@arco-design/web-vue/es/calendar/style/css.js';
import { IsUtils } from "@fleet/common";

const emits = defineEmits([
  'update:modelValue',
  'change',
]);

const props = defineProps<{
  modelValue: Date | string,
}>();

const value = computed<Date>(() => {
  if (IsUtils.isDate(props.modelValue)) {
    return props.modelValue as Date;
  } else {
    return new Date(props.modelValue);
  }
});

const handleUpdate = (value: Date) => {
  emits('update:modelValue', value);
};

const handleChange = (value: Date) => {
  emits('change', value);
};


</script>
<template>
<div class="calendar">
  <Calendar :model-value="value" @update:model-value="handleUpdate" @change="handleChange"/>
</div>
</template>
<style lang="scss">
.calendar {
  width: 100%;
}
</style>
