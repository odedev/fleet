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
          <FlInputBoolean />
          <FlInputText />
          <FlInputDate />
          <FlInputNumber />
          <FlInputEnum />
          <FlInputTree />
          <FlInputModel />
          <FlInputFile />
          <FlInputPassword />
          <FlInputTextarea />

        </FlBox>
        <FlBlock>
          <FlInputBoolean />
          <FlInputText />
          <FlInputDate />
          <FlInputNumber />
          <FlInputEnum />
          <FlInputTree />
          <FlInputModel />
          <FlInputFile />
          <FlInputPassword />
          <FlInputTextarea />

        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlInputBoolean, FlInputText, FlInputDate, FlInputNumber, FlInputEnum, FlInputModel, FlInputTree, FlInputFile,
  FlInputTextarea, FlInputPassword,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

</script>
<style>

</style>
