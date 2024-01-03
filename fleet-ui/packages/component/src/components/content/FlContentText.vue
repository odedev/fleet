<script setup lang="ts">
import {computed} from "vue";
import {Tooltip} from '@arco-design/web-vue';
import '@arco-design/web-vue/es/tooltip/style/css.js';
import FlContentBase from "./FlContentBase.vue";

interface Props {
  modelValue: string,
  isShowTip?: boolean,
  color?: string,
}

const props = defineProps<Props>();

const value = computed<string>(() => props.modelValue);

const color = computed<any>(() => props.color);

</script>
<template>
  <template v-if="isShowTip">
    <Tooltip :content="value" position="tl" mini>
      <FlContentBase class="content-text" :color="color">
        {{value}}
      </FlContentBase>
    </Tooltip>
  </template>
  <template v-else>
    <FlContentBase class="content-text">
      {{value}}
    </FlContentBase>
  </template>
</template>
<style lang="scss">
.content.content-text {
}
</style>
