<script setup lang="ts">
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlCard, FlCardGroup,
  FlAction, FlButton
} from '@fleet/component'

</script>

<template>
  <FlView>
    <FlViewMain>
<!--      <FlViewHead>-->
<!--        <FlAction>-->
<!--          <FlButton>保存</FlButton>-->
<!--          <FlButton>生成代码</FlButton>-->
<!--        </FlAction>-->
<!--      </FlViewHead>-->
      <FlViewBody>
        <FlBox>
          <FlCardGroup>
            <FlCard />
            <FlCard />
            <FlCard />
            <FlCard />
            <FlCard />
          </FlCardGroup>
        </FlBox>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
