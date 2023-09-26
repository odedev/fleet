<script lang="ts" setup>
import {onUnmounted} from 'vue';
import {debounce} from '../../utils/func_utils';

const emits = defineEmits(['click']);

const handleClick = debounce(() => {
  emits('click');
}, 300);

onUnmounted(() => {
  // handleClick.flush()
  // handleClick.cancel();
});

</script>
<template>
  <div class="button" @click="handleClick">
    <slot></slot>
  </div>
</template>
<style lang="scss">
.button {
  height: 32px;
  height: 28px;
}
</style>
