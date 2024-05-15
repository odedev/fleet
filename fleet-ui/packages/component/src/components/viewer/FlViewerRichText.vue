<script setup lang="ts">
import { ref, watch } from "vue";
import CKEditor from '@ckeditor/ckeditor5-vue';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';

const Editor = CKEditor.component;

const config = ref({
  toolbar: [],
});

const value = ref('<p>Content of the editor.</p>');

const handleInput = () => {
  console.log(value)
};

const handleUpdate = (val: any) => {
  console.log(val);
}

</script>

<template>
  <div class="viewer__richtext">
    <Editor
      :model-value="value"
      :editor="ClassicEditor"
      :config="config"
      :disabled="true"
      @input="handleInput"
      @update:model-value="handleUpdate"
      tag-name="textarea"
    >
    </Editor>
  </div>
</template>

<style lang="scss">
@use "../../assets/mixin" as *;

.viewer__richtext {
  .ck.ck-editor.ck-reset {
    height: 100%;
  }
  .ck.ck-editor__main {
    height: calc(100%);

    .ck-content {
      height: 100%;
      border-width: 0;
      padding: 0;
    }
    .ck-source-editing-area {
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
  .ck.ck-editor__top.ck-reset_all {
    display: none;
  }
}

</style>
