<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: any,
}>();

const value = computed<string>(() => props.modelValue);

</script>

<template>
  <FlContentBase class="content-textarea">
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
