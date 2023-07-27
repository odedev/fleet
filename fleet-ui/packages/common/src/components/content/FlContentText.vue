<template>
  <template v-if="isShowTip">
    <Tooltip :content="value" position="tl" mini>
      <FlContentBase>
        {{value}}
      </FlContentBase>
    </Tooltip>
  </template>
  <template v-else>
    <FlContentBase>
      {{value}}
    </FlContentBase>
  </template>
</template>
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
