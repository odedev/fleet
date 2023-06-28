<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlBox>
          <Result status="404" subtitle="Whoops, that page is gone.">
            <template #extra>
              <Space>
                <FlButton type="primary">Back</FlButton>
              </Space>
            </template>
          </Result>
        </FlBox>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlTableCell, FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components/index.ts'

</script>
<style>

</style>
