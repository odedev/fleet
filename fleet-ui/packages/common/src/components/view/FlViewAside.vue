<template>
  <aside class="view-aside">
    <div class="view-aside-title" v-if="title">
      <h3>{{title}}</h3>
    </div>
    <slot></slot>
    <div class="view-aside-content">
      <FlTree :model-value="value" :is-draggable="isDraggable"></FlTree>
    </div>
  </aside>
</template>
<script lang="ts" setup>
import {ref, computed} from "vue";
import FlTree from '../tree/FlTree.vue'

interface Props {
  modelValue: any | any[],
  title?: string,
  disabled?: boolean,
  checkable?: boolean,
  isDraggable?: boolean,
  selectionType?: 'none' | 'single' | 'multiple',
}


const props = withDefaults(defineProps<Props>(), {
  disabled: false,
});

const emits = defineEmits(['click']);

const value = computed(() => props.modelValue);
const title = computed(() => props.title || '');
const isDraggable = computed(() => props.isDraggable || false);

</script>
<style lang="scss">
.view-aside {
  height: 100%;
  width: 272px;
  flex-basis: 272px;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: column;
  padding: 0;
  border-right: 1px solid #f5f5f5;
  overflow: hidden;

  .view-aside-title {
    padding: 8px;
    padding-bottom: 0px;
    font-size: 18px;
    line-height: 1;
    flex-grow: 0;
    flex-shrink: 0;
    h3 {
      font-size: inherit;
    }
  }
  .view-aside-content {
    padding: 8px;
    height: 100%;
    flex-grow: 1;
    flex-shrink: 1;
    overflow: hidden;
  }
}
</style>
