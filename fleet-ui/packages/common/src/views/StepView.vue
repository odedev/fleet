<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButton>保存</FlButton>
          <FlButton>生成代码</FlButton>
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
        <Steps label-placement="vertical">
          <Step description="This is a description">Succeeded</Step>
          <Step description="This is a description">Processing</Step>
          <Step description="This is a description">Pending</Step>
        </Steps>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {Steps, Step} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/steps/style/css.js";

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlCell, FlItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components/index.ts'

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
