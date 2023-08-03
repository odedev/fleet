<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: number,
  precision?: number,
}>();

const value = computed<number>(() => props.modelValue);

</script>

<template>
  <FlContentBase class="content-number">
    {{value}}
  </FlContentBase>
</template>

<style lang="scss">
.content.content-number {
  //justify-content: flex-end;
}
</style>
