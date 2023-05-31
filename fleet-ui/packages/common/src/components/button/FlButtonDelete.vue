<template>
  <FlButton type="error" @click="handleClick">删除</FlButton>
</template>
<script lang="ts" setup>
import FlButton from "./FlButton.vue";

const emit = defineEmits(['click']);

const handleClick = () => {
  console.log('view')
  emit('click');
};

</script>
<style lang="scss">
.button-add {
  height: 32px;
}
</style>
