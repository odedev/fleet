<script setup lang="ts">
import { ref } from 'vue';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlFormItem, FlEditorMarkdown, FlEditorCode,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'

const value = ref('');
</script>

<template>
  <FlView>
    <FlViewMain>
      <!--      <FlViewHead>-->
      <!--        <FlAction>-->
      <!--          <FlButton>保存</FlButton>-->
      <!--          <FlButton>生成代码</FlButton>-->
      <!--        </FlAction>-->
      <!--      </FlViewHead>-->
      <FlViewBody>
        <FlBlock>
          <FlEditorCode v-model="value"></FlEditorCode>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style lang="scss">

</style>
