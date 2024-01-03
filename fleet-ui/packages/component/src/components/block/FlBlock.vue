<script lang="ts" setup>
import {computed} from "vue";

const props = defineProps<{
  title?: string,
}>();

const title = computed<string | undefined>(() => props.title || '');

</script>
<template>
  <section class="block">
    <h3 v-if="!!title" class="block__title">{{title}}</h3>
    <div class="block__content">
      <slot></slot>
    </div>
  </section>
</template>
<style lang="scss">
.block {
  //height: max-content;
  height: 100%;
  min-height: max-content;
  //max-height: 100%;
  width: 100%;
  padding: 16px;
  display: flex;
  flex-direction: column;

  .block__title {
    font-size: 16px;
    font-weight: bold;
    height: 24px;
    line-height: 24px;
    flex-basis: 24px;
    flex-grow: 0;
    flex-shrink: 0;
  }
  .block__content {
    min-height: max-content;
    height: 100%;
    width: 100%;
    flex-basis: 100%;
    flex-grow: 1;
    flex-shrink: 1;
    display: flex;
    flex-direction: column;
    //white-space: nowrap;
    white-space: normal;
    letter-spacing: normal;
    vertical-align: baseline;
    //overflow: auto;
  }
}
</style>
