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
          <FlButton>维护模块</FlButton>
          <FlButtonAdd />
          <FlButtonEdit />
          <FlButtonDelete />
          <FlButtonView />
        </FlBox>
        <FlBlock>
          <FlButtonGroup>
            <FlButton>维护</FlButton>
            <FlButtonAdd />
            <FlButtonEdit />
            <FlButtonDelete />
            <FlButtonView />
          </FlButtonGroup>
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
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody, FlBlock, FlBox, FlAction,
  FlButton, FlButtonAdd, FlButtonEdit, FlButtonDelete, FlButtonView, FlButtonGroup
} from '../components'

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
