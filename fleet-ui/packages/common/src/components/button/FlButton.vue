<template>
  <div class="button" @click="onClick">
    <Button type="primary" size="small">
      <slot></slot>
    </Button>
  </div>
</template>
<script lang="ts" setup>
import {defineEmits, onUnmounted} from 'vue';
import {debounce} from 'lodash-es';
import {Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/button/style/css.js';

const emit = defineEmits(['click']);

const onClick = debounce(() => {
  console.log('click')
  emit('click');
}, 60);

onUnmounted(() => {
  onClick.cancel();
});

</script>
<style lang="scss">
.button {
  height: 28px;
}
</style>
