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
          <FlForm />
          <FlTable :is-editable="true"></FlTable>
        </FlBlock>
        <FlBlock>
          <FlForm />
          <FlTable :is-editable="true"></FlTable>
        </FlBlock>
        <FlBlock>
          <FlForm />
          <FlTable :is-editable="true"></FlTable>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlForm, FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'

</script>
<style>

</style>
