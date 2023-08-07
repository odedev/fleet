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
        <FlBox>
          <FlButtonGroup>
            <FlButton type="primary">primary</FlButton>
            <FlButton type="secondary">secondary</FlButton>
            <FlButton type="tertiary">tertiary</FlButton>
            <FlButton type="neutral">neutral</FlButton>
            <FlButton type="error">error</FlButton>
            <FlButton type="warn">warn</FlButton>
            <FlButton type="success">success</FlButton>
            <FlButton type="info">info</FlButton>
          </FlButtonGroup>
        </FlBox>
        <FlBlock>
          <FlButtonGroup>
            <FlButtonAdd />
            <FlButtonEdit />
            <FlButtonDelete />
            <FlButtonView />
            <FlButtonSave />
            <FlButtonReset />
            <FlButtonSearch />
            <FlButtonUpload />
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
  FlButton, FlButtonAdd, FlButtonEdit, FlButtonDelete, FlButtonView, FlButtonSave, FlButtonReset, FlButtonSearch, FlButtonUpload,
  FlButtonGroup
} from '../components'

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
