<template>
  <FlView>
    <FlViewAside>

    </FlViewAside>
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
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlForm, FlFormItem,
  FlTable, FlButton, FlButtonSave, FlButtonReset, FlSearch, FlAction
} from '../components/index.ts'

</script>
<style>

</style>
