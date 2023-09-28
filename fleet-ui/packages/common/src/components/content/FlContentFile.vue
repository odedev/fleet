<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

interface Props {
  modelValue: any,
  color?: string,
}

const props = defineProps<Props>();

const value = computed<any>(() => props.modelValue?.name);

const handleClick = () => {
  console.log(props.modelValue);
};

const color = computed<any>(() => props.color);

</script>
<template>
  <FlContentBase class="content-file" :color="color" @click="handleClick">
    {{value}}
  </FlContentBase>
</template>
<style lang="scss">
.content.content-file {
  //justify-content: center;
  cursor: pointer;
}
</style>
