<script setup lang="ts">
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlFormItem, FlEditorRichText,
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
          <FlEditorRichText />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
