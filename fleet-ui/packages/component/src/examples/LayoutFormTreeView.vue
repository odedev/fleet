<template>
  <FlView>
    <FlViewAside v-model="data" :is-draggable="true"></FlViewAside>
    <FlViewMain>
      <FlViewNav>

      </FlViewNav>
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
          <FlTable></FlTable>
        </FlBlock>

      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlForm, FlFormItem,
  FlTable, FlButton, FlButtonSave, FlButtonReset, FlSearch, FlAction
} from '@/components/index.ts'
import {getModuleDetails} from "@/datas/ModuleDetail.ts";

const data = getModuleDetails();

</script>
<style>

</style>
