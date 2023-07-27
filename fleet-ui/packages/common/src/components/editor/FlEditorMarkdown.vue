<template>
  <Editor class="markdown" :value="value" :plugins="plugins" :editor-config="config" :upload-images="handleUpload" @change="handleChange" />
</template>

<script lang="ts" setup>
import {ref} from "vue";
import { Editor, Viewer } from '@bytemd/vue-next';
import gfm from '@bytemd/plugin-gfm';
import highlight from "@bytemd/plugin-highlight";
import mermaid from '@bytemd/plugin-mermaid'
import mediumZoom from "@bytemd/plugin-medium-zoom";

import 'bytemd/dist/index.css';
// import 'highlight.js/styles/default.css';
import 'highlight.js/styles/atom-one-light.css';
import 'github-markdown-css'

let value = ref('')
const plugins = [
  gfm(),
  highlight(),
  mermaid(),
  mediumZoom(),
];

const config = {
  lineNumbers: true
}

function handleChange(val) {
  console.log(val)
  value.value = val
}

async function handleUpload(files) {
  console.log(files)
  return files.map((file) => {
    // TODO:
    return {
      url: 'https://picsum.photos/300',
    }
  })
  return [
    {
      title: files.map((i) => i.name),
      url: 'http'
    }
  ]
  // return Promise.all(
  //   files.map((file) => {
  //     // TODO:
  //     return {
  //       url: 'https://picsum.photos/300',
  //     }
  //   })
  // )
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
    .CodeMirror-gutters {
      //border-right: none;
    }
  }
}
</style>
