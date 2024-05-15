<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import { NumberUtils } from '@fleet/common';

interface Props {
  modelValue: number,
  precision?: number,
  color?: string,
}

const props = withDefaults(defineProps<Props>(), {
    precision: 0,
});

const value = computed<string>(() => NumberUtils.fixed(props.modelValue, props.precision));

const color = computed<any>(() => props.color);

</script>
<template>
  <FlContentBase class="content-number" :color="color">
    {{value}}
  </FlContentBase>
</template>
<style lang="scss">
.content.content-number {
  //justify-content: flex-end;
}
</style>
