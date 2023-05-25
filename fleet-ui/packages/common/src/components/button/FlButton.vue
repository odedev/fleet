<template>
  <div class="button" @click="onClick">
    <Button type="primary" size="medium">
      <slot></slot>
    </Button>
  </div>
</template>
<script lang="ts" setup>
import {onUnmounted} from 'vue';
import {debounce, throttle} from 'lodash-es';
import {Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/button/style/css.js';

const emit = defineEmits(['click']);

const onClick = throttle(() => {
  console.log('click')
  emit('click');
}, 500);

onUnmounted(() => {
  onClick.flush()
  onClick.cancel();
});

</script>
<style lang="scss">
.button {
  height: 32px;
}
</style>
