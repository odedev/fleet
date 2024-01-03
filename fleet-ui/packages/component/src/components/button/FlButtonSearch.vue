<script setup lang="ts">
import {computed} from "vue";
import FlButton from "./FlButton.vue";

interface Props {
  disabled?: boolean,
}

const props = withDefaults(defineProps<Props>(), {
  disabled: false,
});

const emits = defineEmits(['click']);

const disabled = computed(() => props.disabled || false);

const handleClick = () => {
  emits('click');
};
</script>
<template>
  <FlButton type="secondary" @click="handleClick">搜索</FlButton>
</template>
<style lang="scss">

</style>
