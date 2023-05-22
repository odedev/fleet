<template>
  <template v-if="isShowTip">
    <Tooltip :content="value" position="tl" mini>
      <FlContentBase>
        {{props.value}}
      </FlContentBase>
    </Tooltip>
  </template>
  <template v-else>
    <FlContentBase>
      {{props.value}}
    </FlContentBase>
  </template>
</template>
<script lang="ts" setup>
import {Tooltip} from '@arco-design/web-vue';
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  value: string,
  isShowTip: boolean,
}>();

</script>
