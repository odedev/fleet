<template>
  <FlContentBase class="content-boolean">
    <FlInputBoolean
      :model-value="value"
      :is-disabled="true"
    />
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";
import FlInputBoolean from "../input/FlInputBoolean.vue";
import {computed} from "vue";

const props = defineProps<{
  modelValue: boolean,
}>();

const value = computed<boolean>(() => props.modelValue);

</script>
<style lang="scss">
.content.content-boolean {
  padding: 0;
  width: 32px;
  justify-content: flex-start;
}
</style>
