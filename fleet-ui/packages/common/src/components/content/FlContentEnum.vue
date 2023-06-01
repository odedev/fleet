<template>
  <FlContentBase class="content-enum">
    {{value?.name}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: number,
  enums: any[],
}>();

const value = computed<number>(() => {
  for (let item of props.enums) {
    if (item.value === props.modelValue) {
      return item;
    }
  }
  return '';
});

</script>
<style lang="scss">
.content.content-enum {
  //justify-content: center;
}
</style>
