<script lang="ts" setup>
import {computed} from "vue";
import {Tooltip} from '@arco-design/web-vue';
import '@arco-design/web-vue/es/tooltip/style/css.js';
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  modelValue: any,
  isShowTip?: boolean,
}>();

const value = computed<string>(() => props.modelValue);

</script>

<template>
  <template v-if="isShowTip">
    <Tooltip :content="value" position="tl" mini>
      <FlContentBase class="content-text">
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
