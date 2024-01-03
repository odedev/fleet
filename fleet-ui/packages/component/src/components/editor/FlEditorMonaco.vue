<script lang="ts" setup>
import {ref, onMounted} from "vue";

import {
  EditorView,
  keymap,
  highlightSpecialChars,
  drawSelection,
  highlightActiveLine,
  dropCursor,
  rectangularSelection,
  crosshairCursor,
  lineNumbers,
  highlightActiveLineGutter
} from "@codemirror/view"
import {EditorState, Compartment} from "@codemirror/state"
import {defaultHighlightStyle, syntaxHighlighting, indentOnInput, bracketMatching, foldGutter, foldKeymap} from "@codemirror/language"
import {defaultKeymap, history, historyKeymap} from "@codemirror/commands"
import {searchKeymap, highlightSelectionMatches} from "@codemirror/search"
import {autocompletion, completionKeymap, closeBrackets, closeBracketsKeymap} from "@codemirror/autocomplete"
import {lintKeymap} from "@codemirror/lint"
import {javascript} from "@codemirror/lang-javascript"
import {json} from "@codemirror/lang-json"
import {html} from "@codemirror/lang-html";
import {markdown} from "@codemirror/lang-markdown";


let value = ref('')
const el = ref<HTMLDivElement>()

const basicSetup = [
  lineNumbers(),
  highlightActiveLineGutter(),
  highlightSpecialChars(),
  history(),
  foldGutter(),
  drawSelection(),
  dropCursor(),
  EditorState.allowMultipleSelections.of(true),
  indentOnInput(),
  syntaxHighlighting(defaultHighlightStyle, {fallback: true}),
  bracketMatching(),
  closeBrackets(),
  autocompletion(),
  rectangularSelection(),
  crosshairCursor(),
  highlightActiveLine(),
  highlightSelectionMatches(),
  keymap.of([
    ...closeBracketsKeymap,
    ...defaultKeymap,
    ...searchKeymap,
    ...historyKeymap,
    ...foldKeymap,
    ...completionKeymap,
    ...lintKeymap
  ])
];

const tabSize = new Compartment();
const language = new Compartment();

let startState = EditorState.create({
  doc: "{}",
  extensions: [
    // keymap.of(defaultKeymap),
    basicSetup,
    language.of(javascript()),
    tabSize.of(EditorState.tabSize.of(4))
  ]
})


onMounted(() => {
  let view = new EditorView({
    state: startState,
    parent: el.value
  })
})

</script>
<template>
  <div ref="el" class="code"></div>
</template>

<style lang="scss">
@use "../../assets/mixin" as *;

.code {
  height: 100%;
  width: 100%;

  .cm-editor {
    height: 100%;
    border: 1px solid #e2e2e2;
    @include border-color();

    &.cm-focused {
      outline: none;
      @include border-color-primary();
    }
  }
}
</style>
