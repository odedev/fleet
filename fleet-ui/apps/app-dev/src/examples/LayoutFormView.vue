<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButtonSave />
<!--          <FlButtonReset />-->
          <FlButtonBack />
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
        <FlForm></FlForm>
        </FlBox>
<!--        <FlBox>-->
<!--          <FlFormItem>-->
<!--          </FlFormItem>-->
<!--          <FlFormItem>-->
<!--          </FlFormItem>-->
<!--          <FlFormItem>-->
<!--            <FlInputPassword />-->
<!--          </FlFormItem>-->
<!--          <FlFormItem>-->
<!--            <FlInputPassword />-->
<!--          </FlFormItem>-->
<!--          <FlFormItem>-->
<!--            <FlInputPassword />-->
<!--          </FlFormItem>-->
<!--        </FlBox>-->

      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlSpace, FlForm, FlFormItem, FlInputBoolean, FlInputPassword,
  FlTable, FlButtonSave, FlButtonReset, FlButtonBack, FlSearch, FlAction
} from "@fleet/component";

</script>
<style>

</style>
