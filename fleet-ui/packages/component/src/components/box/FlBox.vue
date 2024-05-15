<script lang="ts" setup>
import {computed} from "vue";

const props = defineProps<{
  title?: string,
}>();

const title = computed<string | undefined>(() => props.title);
</script>

<template>
  <section class="box">
    <h3 v-if="!!title" class="box__title">{{title}}</h3>
    <div class="box__content">
      <slot></slot>
    </div>
  </section>
</template>

<style lang="scss">
.box {
  width: 100%;
  height: max-content;
  flex-basis: max-content;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: flex-start;
  align-content: flex-start;
  padding: 16px;

  .box__title {
    width: 100%;
    padding-bottom: 8px;
    font-size: 16px;
    line-height: 1;
    font-weight: 600;
    display: none;
  }
  .box__content {
    width: 100%;
    display: flex;
    flex-direction: row;
    align-items: flex-start;
    justify-content: flex-start;
    align-content: flex-start;
    flex-wrap: wrap;
  }
}
</style>
