<template>
<Editor :editor="ClassicEditor"></Editor>
</template>

<script setup lang="ts">
import CKEditor from '@ckeditor/ckeditor5-vue';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';

const Editor = CKEditor.component;

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
  @include border-color-primary();

  box-shadow: none;
}

</style>
