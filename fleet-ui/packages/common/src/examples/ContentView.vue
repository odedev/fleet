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
        <FlBox>
          <FlContentText value="文本内容显示文本内容显示" :is-show-tip="false"/>
          <FlContentNumber value="121212.1212212212212" :is-show-tip="false" />
          <FlInputBoolean />
          <FlContentDate />
          <FlContentEnum />
          <FlContentModel />
          <FlContentFile />
        </FlBox>
        <FlBlock>
          <FlContentText value="文本内容显示文本内容显示文本内容显示文本内容显示" :is-show-tip="false"/>
          <FlContentNumber value="121212.1212212212212" :is-show-tip="false" />
          <FlInputBoolean />
          <FlContentDate />
          <FlContentEnum />
          <FlContentModel />
          <FlContentFile />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {Card} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/card/style/css.js";

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlContent, FlContentText, FlContentNumber, FlInputBoolean, FlContentDate, FlContentEnum, FlContentModel,
  FlContentFile,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
