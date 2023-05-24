<template>
  <FlView>
<!--    <FlContent>-->

    <Tabs type="line" default-active-key="1">
      <TabPane key="1" title="Tab 1">
        <FlBox>
          <FlItem>
            <input type="text" name="" id="">
          </FlItem>
          <FlItem>
            <input type="text" name="" id="">
          </FlItem>
          <FlItem>
            <input type="text" name="" id="">
          </FlItem>
          <FlItem>
            <input type="text" name="" id="">
          </FlItem>
          <FlItem>
            <input type="text" name="" id="">
          </FlItem>
        </FlBox>
      </TabPane>
      <TabPane key="2" title="Tab 2">
        <FlBlock>
          <FlTable></FlTable>
        </FlBlock>
      </TabPane>
      <TabPane key="3">
        <template #title>Tab 3</template>
        <FlBlock>Content of Tab Panel 3</FlBlock>
      </TabPane>
    </Tabs>
<!--    </FlContent>-->

  </FlView>
</template>
<script lang="ts" setup>
import {Tabs, TabPane} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/tabs/style/css.js";

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlCell, FlItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

</script>
<style>

</style>
