<template>
  <FlContentBase class="content-number">
    {{value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: number,
}>();

const value = computed<number>(() => props.modelValue);

</script>
<style lang="scss">
.content.content-number {
  //justify-content: flex-end;
}
</style>
