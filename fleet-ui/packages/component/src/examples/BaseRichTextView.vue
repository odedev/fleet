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
          <FlEditorRichText></FlEditorRichText>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {Descriptions, DescriptionsItem, Tag} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/descriptions/style/css.js";
import "@arco-design/web-vue/es/tag/style/css.js";

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlFormItem, FlEditorRichText,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

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
