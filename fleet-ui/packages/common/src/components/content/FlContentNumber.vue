<template>
  <FlContentBase class="content-number">
    {{props.value}}
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";

const props = defineProps<{
  value: string,
  isShowTip: boolean,
}>();

</script>
<style lang="scss">
.content.content-number {
  justify-content: flex-end;
}
</style>
