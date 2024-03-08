<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButtonSave />
          <FlButtonReset />
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlForm />
        </FlBox>
        <FlBlock>
          <Tabs type="line" default-active-key="1">
            <TabPane key="1" title="Tab 1">
              <FlBox>
                <FlForm />
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
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {Tabs, TabPane} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/tabs/style/css.js";

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlForm, FlFormItem,
  FlTable, FlButton, FlSearch, FlAction, FlButtonReset, FlButtonSave
} from '@fleet/component'

</script>
<style>

</style>
