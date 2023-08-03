<template>
  <FlContentBase class="content-json">
<!--    <pre>-->
      {{value}}
<!--    </pre>-->
  </FlContentBase>
</template>
<script lang="ts" setup>
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: any,
}>();

const value = computed<any>(() => {
  let value = props.modelValue;
  if (typeof props.modelValue === 'string') {
    try {
      value = JSON.parse(props.modelValue);
    } catch (e) {
      value = props.modelValue;
    }
  }
  return value
});

</script>
<style lang="scss">
.content.content-json {
  //height: 64px;
  overflow: auto;
  align-items: flex-start;
}
</style>
