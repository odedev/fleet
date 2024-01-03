<script lang="ts" setup>
import {ref, computed, onMounted, onUnmounted} from "vue";

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
} from "@codemirror/view";
import {EditorState, Compartment} from "@codemirror/state";
import {defaultHighlightStyle, syntaxHighlighting, indentOnInput, bracketMatching, foldGutter, foldKeymap} from "@codemirror/language"
import {defaultKeymap, history, historyKeymap} from "@codemirror/commands"
import {searchKeymap, highlightSelectionMatches} from "@codemirror/search"
import {autocompletion, completionKeymap, closeBrackets, closeBracketsKeymap} from "@codemirror/autocomplete"
import {lintKeymap} from "@codemirror/lint"
import {json} from "@codemirror/lang-json"
import {sql} from "@codemirror/lang-sql";
import {javascript} from "@codemirror/lang-javascript"
import {html} from "@codemirror/lang-html";
import {markdown} from "@codemirror/lang-markdown";


interface Props {
  modelValue: any,
  language?: 'json' | 'markdown' | 'javascript' | 'html' | undefined,
  isReadonly?: boolean,
  isDisabled?: boolean,
}

const props = withDefaults(defineProps<Props>(), {
  isDisabled: false,
  isReadonly: false,
});

const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
]);

let editorView: EditorView;

const codeBox = ref<HTMLDivElement>();

const value = computed(() => {
  try {
    return JSON.stringify(props.modelValue, null, '\t');
  } catch (e) {
    return props.modelValue;
  }
});
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);

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
const readOnly = new Compartment();
const languageConf = new Compartment();

const autoLanguage = EditorState.transactionExtender.of(tr => {
  let lang = json();
  if (props.language === 'markdown') {
    lang = markdown();
  } else if (props.language === 'javascript') {
    lang = javascript();
  } else if (props.language === 'html') {
    lang = html();
  }
  return {
    effects: languageConf.reconfigure(lang)
  }
});


let startState = EditorState.create({
  doc: value.value,
  extensions: [
    // keymap.of(defaultKeymap),
    basicSetup,
    language.of(json()),
    // autoLanguage,
    tabSize.of(EditorState.tabSize.of(2)),
    readOnly.of(EditorState.readOnly.of(isReadonly.value)),
    EditorView.updateListener.of(viewUpdate => {
      const val = viewUpdate.state.doc.toString();
      let value: any = val;
      try {
        value = JSON.parse(val);
      } catch (e) {
        return
      }
      emits('update:modelValue', value);
    }),
  ]
});


onMounted(() => {
  editorView = new EditorView({
    state: startState,
    parent: codeBox.value
  });
});

onUnmounted(() => {
  editorView?.destroy();
});

</script>
<template>
  <div ref="codeBox" class="code"></div>
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
