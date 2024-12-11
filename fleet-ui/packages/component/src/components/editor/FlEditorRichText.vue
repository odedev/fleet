<script setup lang="ts">
import { ref, computed, watch } from "vue";
import { Ckeditor } from '@ckeditor/ckeditor5-vue';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';

// const Editor = CKEditor.component;

const config = ref({
  licenseKey: 'GPL',
});
// const config = computed( () => {
//   // const { Essentials, Paragraph, Bold, Italic } = cloud.data.value.CKEditor;
//   // const { FormatPainter } = cloud.data.value.CKEditorPremiumFeatures;
//
//   return {
//     licenseKey: 'GPL',
//     // plugins: [ Essentials, Paragraph, Bold, Italic, FormatPainter ],
//     toolbar: [ 'undo', 'redo', '|', 'bold', 'italic', '|', 'formatPainter' ]
//   };
// } );
const value = ref('<p>Content of the editor.</p>');

const handleInput = () => {
  console.log(value)
};

const handleUpdate = (val: any) => {
  console.log(val);
}

</script>

<template>
  <Ckeditor
    :model-value="value"
    :editor="ClassicEditor"
    :config="config"
    @input="handleInput"
    @update:model-value="handleUpdate"
    tag-name="textarea"
  >
  </Ckeditor>
</template>


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

</style>
