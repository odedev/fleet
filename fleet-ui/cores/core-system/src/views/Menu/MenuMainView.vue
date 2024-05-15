<script setup lang="ts">
import { ref } from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlEditorMarkdown, FlButton, FlSearch, FlAction
} from "@fleet/component"

const modelValue = ref('MenuMainView.vue');
</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlBlock>
          <FlEditorMarkdown v-model="modelValue" />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style lang="scss">

</style>
