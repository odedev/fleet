<template>
  <FlButton type="primary" @click="handleClick">确认</FlButton>
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
