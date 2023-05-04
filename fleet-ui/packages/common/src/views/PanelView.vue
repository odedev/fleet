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
        <FlContent>
          <FlTable></FlTable>
        </FlContent>
      </TabPane>
      <TabPane key="3">
        <template #title>Tab 3</template>
        <FlContent>Content of Tab Panel 3</FlContent>
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
  FlBox, FlContent, FlCell, FlItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components/index.ts'

</script>
<style>

</style>
