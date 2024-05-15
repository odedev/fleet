<script setup lang="ts">
import { computed, ref } from "vue";
import { Model } from "@fleet/common";
import FlContentBase from "./FlContentBase.vue";
import FlModal from "../modal/FlModal.vue";
import FlBlock from "../block/FlBlock.vue";
import FlDescription from "../description/FlDescription.vue";

interface Props {
  modelValue: any,
  model?: any,
  display?: Function,
  color?: string,
}

const props = defineProps<Props>();

const visible = ref(false);

const value = computed<any>(() => {
  let displayField: string = Model.getDisplayFieldCode(props.model);
  let value = props.modelValue?.[displayField] || props.modelValue;
  if (props.display) {
    value = props.display(props.modelValue);
  }
  return value;
});

const modelName = computed(() => props.model?.name || '详情');

const color = computed<any>(() => props.color);


const handleClick = () => {
  visible.value = true;
};

</script>
<template>
  <FlContentBase class="content-model" :color="color" @click="handleClick">
    {{value}}
  </FlContentBase>
  <FlModal v-model="visible" :title="modelName" width="70%">
    <FlBlock>
      <FlDescription :model-value="props.modelValue" :model="props.model"/>
    </FlBlock>
  </FlModal>
</template>
<style lang="scss">
.content.content-model {
  cursor: pointer;
}
</style>
