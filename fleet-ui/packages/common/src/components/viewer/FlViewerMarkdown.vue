<template>
  <Viewer class="markdown" :value="value" :plugins="plugins" :remark-rehype="config" />
</template>

<script lang="ts" setup>
import {computed, ref} from "vue";
import { Viewer } from '@bytemd/vue-next';
import gfm from '@bytemd/plugin-gfm';
import highlight from "@bytemd/plugin-highlight";
import mermaid from '@bytemd/plugin-mermaid'
import mediumZoom from "@bytemd/plugin-medium-zoom";
import 'bytemd/dist/index.css';
// import 'highlight.js/styles/default.css';
import 'highlight.js/styles/atom-one-light.css';
import 'github-markdown-css';


const props = defineProps<{
  modelValue: any,
}>();

const value = computed<string>(() => props.modelValue);

const plugins = [
  gfm(),
  highlight(),
  mermaid(),
  mediumZoom(),
];

const config = {
  // lineNumbers: true
}



</script>

<style lang="scss">
.markdown {
  height: 100%;

  .bytemd {
    height: 100%;

    .bytemd-toolbar-right .bytemd-toolbar-icon[bytemd-tippy-path="5"] {
      display: none;
    }
  }
}
</style>
