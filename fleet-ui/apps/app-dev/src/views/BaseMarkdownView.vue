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
          <FlEditorMarkdown></FlEditorMarkdown>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlFormItem, FlEditorMarkdown,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'

const data = [{
  label: 'Name',
  value: 'Socrates',
}, {
  label: 'Mobile',
  value: '123-1234-1234',
}, {
  label: 'Residence',
  value: 'Beijing'
}, {
  label: 'Hometown',
  value: 'Beijing',
}, {
  label: 'Address',
  value: 'Yingdu Building, Zhichun Road, Beijing'
}];

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
