<template>
  <FlView>
    <FlViewAside>

    </FlViewAside>
    <FlViewMain>
      <FlViewNav>

      </FlViewNav>
      <FlViewHead>
        <FlAction>
          <FlButton>保存</FlButton>
          <FlButton>生成代码</FlButton>
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlFormItem :data-type="1"></FlFormItem>
          <FlFormItem :data-type="1"></FlFormItem>
          <FlFormItem :data-type="1">
          </FlFormItem>
          <FlFormItem :data-type="1">
          </FlFormItem>
          <FlFormItem :data-type="1">
          </FlFormItem>
        </FlBox>
        <!--        <FlBox>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--        </FlBox>-->

        <!--        <FlContent>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--          <FlItem>-->
        <!--            <input type="text" name="" id="">-->
        <!--          </FlItem>-->
        <!--        </FlContent>-->
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
  FlBlock, FlBox, FlContent, FlTableCell, FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components/index.ts'

</script>
<style>

</style>
