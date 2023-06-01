<template>
  <FlContentBase class="content-date">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import dayjs from "dayjs";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: Date | string,
}>();

const value = computed<string>(() => {
  return dayjs(props.modelValue).format('YYYY-MM-DD HH:mm:ss');
});

</script>
<style lang="scss">
.content.content-date {
  //justify-content: center;
}
</style>
