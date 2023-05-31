<template>
  <FlButton type="neutral" @click="handleClick">重置</FlButton>
</template>
<script lang="ts" setup>
import FlButton from "./FlButton.vue";

const emit = defineEmits(['click']);

const handleClick = () => {
  console.log('click')
  emit('click');
};

</script>
<style lang="scss">
.button-add {
  height: 32px;
}
</style>
