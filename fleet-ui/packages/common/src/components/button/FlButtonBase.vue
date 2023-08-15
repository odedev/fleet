<template>
  <div class="button" @click="handleClick">
    <slot></slot>
  </div>
</template>
<script lang="ts" setup>
import {onUnmounted} from 'vue';
import {debounce} from '../../utils/func_utils';

const emit = defineEmits(['click']);

const handleClick = debounce(() => {
  emit('click');
}, 300);

onUnmounted(() => {
  // handleClick.flush()
  // handleClick.cancel();
});

</script>
<style lang="scss">
.button {
  height: 32px;
  height: 28px;
}
</style>
