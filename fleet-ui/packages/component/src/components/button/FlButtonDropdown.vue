<script setup lang="ts">
import {computed} from "vue";
import {Dropdown, Doption} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/dropdown/style/css.js';
import {IconDown} from "@arco-design/web-vue/es/icon";
import FlButton from "./FlButton.vue";

interface Option {
  name: string,
  value: string | number,
  disabled?: boolean,
}

interface Props {
  options: Option[],
  type?: "primary" | "secondary" | "tertiary" | "neutral" | "error" | "warn" | "success" | "info" | undefined,
  disabled?: boolean,
}

const props = defineProps<Props>();

const emits = defineEmits(['click']);

const type = computed(() => props.type);
const options = computed(() => props.options);
const disabled = computed(() => props.disabled);

const handleSelect = (v: any) => {
  emits('click', v);
};
</script>
<template>
  <Dropdown @select="handleSelect" :popup-max-height="false" >
    <FlButton :type="type" :disabled="disabled">
      <slot>更多操作</slot> <IconDown/>
    </FlButton>
    <template #content>
      <Doption v-for="item in options" :value="item.value" :disabled="item.disabled">{{item.name}}</Doption>
    </template>
  </Dropdown>
</template>
