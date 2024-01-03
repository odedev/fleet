<script lang="ts" setup>
import {computed, ref} from "vue";

import { Viewer } from '@bytemd/vue-next';
import gfm from '@bytemd/plugin-gfm';
import highlight from "@bytemd/plugin-highlight";
import mermaid from '@bytemd/plugin-mermaid'
import mediumZoom from "@bytemd/plugin-medium-zoom";
import gemoji from '@bytemd/plugin-gemoji'
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
  gemoji(),
];

const config = {
  // lineNumbers: true
}

</script>

<template>
  <div class="viewer__markdown">
    <Viewer :value="value" :plugins="plugins" :remark-rehype="config" />
  </div>
</template>

<style lang="scss">
.viewer__markdown {
  width: 100%;
  height: 100%;
  overflow: auto;
  padding: 16px;
  padding: 0;

}
</style>
