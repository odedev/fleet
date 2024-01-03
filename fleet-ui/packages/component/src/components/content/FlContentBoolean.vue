<script setup lang="ts">
import {computed} from "vue";
import FlContentBase from "./FlContentBase.vue";
import FlInputBoolean from "../input/FlInputBoolean.vue";

interface Props {
  modelValue: boolean,
}

const props = defineProps<Props>();

const value = computed<boolean>(() => props.modelValue);

</script>
<template>
  <FlContentBase class="content-boolean">
    <FlInputBoolean
      :model-value="value"
      :is-readonly="true"
    />
  </FlContentBase>
</template>
<style lang="scss">
@use "../../assets/mixin" as *;

.content.content-boolean {
  padding: 0;
  width: 32px;
  justify-content: flex-start;

  .arco-checkbox.arco-checkbox-disabled {
    cursor: default;
    .arco-checkbox-icon-hover {
      cursor: default;
    }
  }

  //.arco-checkbox-disabled.arco-checkbox-checked .arco-checkbox-icon,
  //.arco-checkbox-disabled.arco-checkbox-checked:hover .arco-checkbox-icon {
  //  @include background-color-tertiary();
  //}
}
</style>
