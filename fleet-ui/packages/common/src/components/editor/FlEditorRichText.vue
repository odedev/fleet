<template>
<Editor :model-value="value" :editor="ClassicEditor" :config="config" @input="handleInput" tag-name="textarea"></Editor>
</template>

<script setup lang="ts">
import {ref, watch} from "vue";
import CKEditor from '@ckeditor/ckeditor5-vue';
// import ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { ClassicEditor } from '@ckeditor/ckeditor5-editor-classic';
import { EditorUI } from '@ckeditor/ckeditor5-ui';
import { Heading, HeadingButtonsUI } from '@ckeditor/ckeditor5-heading';
import { Essentials } from '@ckeditor/ckeditor5-essentials';
import { Bold, Code, Italic, Strikethrough, Subscript, Superscript, Underline } from '@ckeditor/ckeditor5-basic-styles';
import { Link, LinkImage } from '@ckeditor/ckeditor5-link';
import { Paragraph, ParagraphButtonUI } from '@ckeditor/ckeditor5-paragraph';
import { Font } from '@ckeditor/ckeditor5-font';
import { Table, TableColumnResize, TableCellProperties, TableProperties, TableToolbar, TableCaption } from '@ckeditor/ckeditor5-table';
import { CodeBlock } from '@ckeditor/ckeditor5-code-block';
import { Highlight } from '@ckeditor/ckeditor5-highlight';
import { Indent, IndentBlock } from '@ckeditor/ckeditor5-indent';
import { HorizontalLine } from '@ckeditor/ckeditor5-horizontal-line';
import { Image, ImageInsert, ImageCaption, ImageResize, ImageStyle, ImageToolbar } from '@ckeditor/ckeditor5-image';
import { Undo } from '@ckeditor/ckeditor5-undo';
import { Alignment } from '@ckeditor/ckeditor5-alignment';
import { Style } from '@ckeditor/ckeditor5-style';
import { GeneralHtmlSupport } from '@ckeditor/ckeditor5-html-support';
import { FindAndReplace } from '@ckeditor/ckeditor5-find-and-replace';
import { List, TodoList } from '@ckeditor/ckeditor5-list';
import { SourceEditing } from '@ckeditor/ckeditor5-source-editing';
import { Markdown } from '@ckeditor/ckeditor5-markdown-gfm';
import { MediaEmbed } from '@ckeditor/ckeditor5-media-embed';
import { HtmlEmbed } from '@ckeditor/ckeditor5-html-embed';
import { Clipboard } from '@ckeditor/ckeditor5-clipboard';
import { BlockQuote } from '@ckeditor/ckeditor5-block-quote';
import { PageBreak } from '@ckeditor/ckeditor5-page-break';
import { TextPartLanguage } from '@ckeditor/ckeditor5-language';
import { ShowBlocks } from '@ckeditor/ckeditor5-show-blocks';
import { RemoveFormat } from '@ckeditor/ckeditor5-remove-format';

import { StandardEditingMode } from '@ckeditor/ckeditor5-restricted-editing';

const Editor = CKEditor.component;

const config = ref({
  plugins: [
    EditorUI,
    Heading,
    HeadingButtonsUI,
    Essentials,
    Table,
    TableToolbar,
    TableColumnResize,
    TableCellProperties,
    TableProperties,
    TableCaption,
    Bold,
    Italic,
    Underline, Strikethrough, Code, Subscript, Superscript,
    Font,
    Link,
    Alignment,
    Paragraph,
    ParagraphButtonUI,
    CodeBlock,
    Highlight,
    Indent,
    IndentBlock,
    HorizontalLine,
    Image, ImageInsert, ImageToolbar, ImageCaption, ImageStyle, ImageResize, LinkImage,
    Undo,
    Style,
    GeneralHtmlSupport,
    FindAndReplace,
    List,
    TodoList,
    SourceEditing,
    Markdown,
    MediaEmbed,
    HtmlEmbed,
    Clipboard,
    BlockQuote,
    PageBreak,
    TextPartLanguage,
    ShowBlocks,
    RemoveFormat,

    StandardEditingMode,
  ],
  toolbar: {
    items: [
      'undo',
      'redo',
      '|',
      'sourceEditing',
      'findAndReplace',
      'selectAll',
      '|',
      'heading',
      // 'style',
      '|',
      'bold',
      'italic',
      'underline',
      'strikethrough',
      'code',
      'subscript',
      'superscript',
      'removeFormat',
      '|',

      'bulletedList',
      'numberedList',
      'todoList',
      '|',

      'fontSize',
      'fontFamily',
      'fontColor',
      'fontBackgroundColor',
      'highlight',
      '|',
      'alignment',
      '|',

      '-', // break point

      // 'linkImage',
      'link',
      'insertImage',
      'blockQuote',
      'insertTable',
      'mediaEmbed',
      'codeBlock',
      'htmlEmbed',
      'restrictedEditingException',
      '|',

      'outdent',
      'indent',
      '|',
      'specialCharacters',
      'horizontalLine',
      'pageBreak',
      '|',
      'textPartLanguage',
      '|',

      'imageToolbar',
      'imageStyle:block',
      'imageStyle:side',
      '|',
      'toggleImageCaption',
      'imageTextAlternative',
      '|',
    ],
    shouldNotGroupWhenFull: false
  },
  table: {
    contentToolbar: [ 'tableColumn', 'tableRow', 'mergeTableCells', 'toggleTableCaption' ]
  },
  style: {
    definitions: [
      // Styles definitions.
      // ...
    ]
  },
  codeBlock: {
    languages: [
      // Do not render the CSS class for the plain text code blocks.
      { language: 'plaintext', label: 'Plain text', class: '' },

      // Use the "php-code" class for PHP code blocks.
      { language: 'php', label: 'PHP', class: 'php-code' },

      // Use the "js" class for JavaScript code blocks.
      // Note that only the first ("js") class will determine the language of the block when loading data.
      { language: 'javascript', label: 'JavaScript', class: 'js javascript js-code' },

      // Python code blocks will have the default "language-python" CSS class.
      { language: 'python', label: 'Python' },
      { language: 'plaintext', label: 'Plain text' }, // The default language.
      { language: 'c', label: 'C' },
      { language: 'cs', label: 'C#' },
      { language: 'cpp', label: 'C++' },
      { language: 'css', label: 'CSS' },
      { language: 'diff', label: 'Diff' },
      { language: 'html', label: 'HTML' },
      { language: 'java', label: 'Java' },
      { language: 'javascript', label: 'JavaScript' },
      { language: 'php', label: 'PHP' },
      { language: 'python', label: 'Python' },
      { language: 'ruby', label: 'Ruby' },
      { language: 'typescript', label: 'TypeScript' },
      { language: 'xml', label: 'XML' }
    ]
  },

})

const value = ref('')
value.value = '<p>Content of the editor.</p>'


const handleInput = () => {
  console.log(value)
};

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.ck.ck-editor.ck-reset {
  height: 100%;

}
.ck.ck-editor__main {
  height: calc(100% - 40px);

  .ck-content {
    height: 100%;
  }
}
.ck-rounded-corners .ck.ck-editor__main>.ck-editor__editable,
.ck.ck-editor__main>.ck-editor__editable.ck-rounded-corners {
  //@include border-color-primary();

  box-shadow: none;
}

.ck.ck-editor__editable.ck-focused:not(.ck-editor__nested-editable) {
  @include border-color-primary();
}

.ck.ck-powered-by {
  display: none;
}

</style>
