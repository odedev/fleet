<template>
  <div class="button" @click="handleClick">
    <slot></slot>
  </div>
</template>
<script lang="ts" setup>
import {onUnmounted} from 'vue';
import {debounce, throttle} from 'lodash-es';
import {Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/button/style/css.js';

const emit = defineEmits(['click']);

const handleClick = throttle(() => {
  console.log('click')
  emit('click');
}, 500);

onUnmounted(() => {
  handleClick.flush()
  handleClick.cancel();
});

</script>
<style lang="scss">
.button {
  height: 32px;
}
</style>
