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
        <FlBox>
          <Card :style="{ width: '360px' }" title="Arco Card" hoverable>
            <template #extra>
              <a>More</a>
            </template>
            ByteDance's core product, Toutiao ("Headlines"), is a content platform in
            China and around the world. Toutiao started out as a news recommendation
            engine and gradually evolved into a platform delivering content in various
            formats.
          </Card>
          <Card :style="{ width: '360px' }" title="Arco Card" hoverable>
            <template #extra>
              <a>More</a>
            </template>
            ByteDance's core product, Toutiao ("Headlines"), is a content platform in
            China and around the world. Toutiao started out as a news recommendation
            engine and gradually evolved into a platform delivering content in various
            formats.
          </Card>
          <Card :style="{ width: '360px' }" title="Arco Card" hoverable>
            <template #extra>
              <a>More</a>
            </template>
            ByteDance's core product, Toutiao ("Headlines"), is a content platform in
            China and around the world. Toutiao started out as a news recommendation
            engine and gradually evolved into a platform delivering content in various
            formats.
          </Card>
          <Card :style="{ width: '360px' }" title="Arco Card" hoverable>
            <template #extra>
              <a>More</a>
            </template>
            ByteDance's core product, Toutiao ("Headlines"), is a content platform in
            China and around the world. Toutiao started out as a news recommendation
            engine and gradually evolved into a platform delivering content in various
            formats.
          </Card>
        </FlBox>
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
  FlBlock, FlBox, FlContent, FlCell, FlItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
