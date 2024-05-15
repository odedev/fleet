<script setup lang="ts">
import {computed, ref} from "vue";
import FlModal from "../modal/FlModal.vue";
import FlContentBase from "./FlContentBase.vue";
import FlBlock from "../block/FlBlock.vue";
import FlEditorCode from "../editor/FlEditorCode.vue";

const props = defineProps<{
  modelValue: any,
  model?: any,
  color?: string,
}>();

const visible = ref(false);

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

const modelName = computed(() => props.model?.name || '详情');

const color = computed<any>(() => props.color);

const handleClick = () => {
  visible.value = true;
};

</script>
<template>
  <FlContentBase class="content-json" :color="color" @click="handleClick">
    {{value}}
  </FlContentBase>
  <FlModal v-model="visible" :title="modelName" width="60%">
    <FlBlock>
      <FlEditorCode :model-value="value" :is-readonly="true"/>
    </FlBlock>
  </FlModal>
</template>
<style lang="scss">
.content.content-json {
  cursor: pointer;
  //overflow: auto;
  align-items: flex-start;
}
</style>
