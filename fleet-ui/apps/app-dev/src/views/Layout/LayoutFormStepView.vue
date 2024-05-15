<template>
  <FlView>
    <!--    <FlContent>-->

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
    <!--    </FlContent>-->

  </FlView>
</template>
<script lang="ts" setup>

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlForm, FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'

</script>
<style>

</style>
