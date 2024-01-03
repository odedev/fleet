<script lang="ts" setup>
import {computed, ref, onMounted} from "vue";
import {Image} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/image/style/css.js';

const props = defineProps<{
  modelValue: string | any,
}>();

const value = computed<string>(() => props.modelValue);
</script>

<template>
  <div class="viewer__image">
    <Image :src="value"  height="100%"/>
  </div>
</template>

<style lang="scss">
.viewer__image {
  width: 100%;
  height: 100%;
  width: auto;  /* 图片宽度自适应 */
  height: auto; /* 图片高度自适应 */
  max-width: 100%; /* 最大宽度为100% */
  max-height: 100%; /* 最大高度为100% */
  overflow: auto;
  padding: 16px;
  padding: 0;


}
</style>
