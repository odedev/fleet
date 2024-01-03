<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

interface Props {
  modelValue: string,
  color?: string,
}

const props = defineProps<Props>();

const value = computed<string>(() => props.modelValue);

const color = computed<any>(() => props.color);

</script>
<template>
  <FlContentBase class="content-textarea" :color="color">
    {{value}}
  </FlContentBase>
</template>
<style lang="scss">
.content.content-textarea {
  //height: 64px;
  overflow: auto;
  align-items: flex-start;
}
</style>
