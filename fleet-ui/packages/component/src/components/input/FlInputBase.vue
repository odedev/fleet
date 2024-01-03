<template>
  <div class="input" @click="handleClick">
    <slot></slot>
  </div>
</template>
<script lang="ts" setup>
const emit = defineEmits(['click']);

const handleClick = () => {
  emit('click');
};
</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.input {
  width: 336px;
  width: 272px;
  width: 100%;
  height: 28px;
  height: 32px;
  min-height: 32px;
  //height: 40px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  line-height: 22px;
  padding: 0 8px;
  padding: 0;
}
</style>
