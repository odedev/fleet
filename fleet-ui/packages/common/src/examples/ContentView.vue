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
          <FlContentText model-value="文本内容显示文本内容显示" :is-show-tip="false"/>
          <FlContentNumber :model-value="12122122.33" />
          <FlContentBoolean  :model-value="false"/>
          <FlContentDate :model-value="'2023-05-27 11:33:31'"/>
          <FlContentEnum :model-value="2" :enums="enumList"/>
          <FlContentModel :model-value="user"/>
          <FlContentFile :model-value="resourceFile"/>
        </FlBox>
        <FlBlock>
          <FlContentText model-value="文本内容显示文本内容显示文本内容显示文本内容显示" :is-show-tip="false"/>
          <FlContentNumber :model-value="121212.1212212212212" :is-show-tip="false" />
          <FlContentBoolean :model-value="true"/>
          <FlContentDate :model-value="new Date()"/>
          <FlContentEnum  :model-value="0" :enums="enumList"/>
          <FlContentModel :model-value="user" display-field="username"/>
          <FlContentFile :model-value="resourceFile"/>
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
  FlContent, FlContentText, FlContentNumber, FlContentBoolean, FlContentDate, FlContentEnum, FlContentModel,
  FlContentFile,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'


const enumList = [
  {
    value: 0,
    name: '初始化',
  },
  {
    value: 1,
    name: '处理中',
  },
  {
    value: 2,
    name: '完成',
  }
]

const user = {
  id: 'dsdsd',
  username: 'admin',
  name: '管理员',
};

const resourceFile = {
  name: '手册.pdf',
  type: '',
  url: '',
};

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
