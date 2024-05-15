<script setup lang="ts">
import { ref } from 'vue';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlCalendar,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'


const value = ref(new Date());

</script>

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
          <FlCalendar v-model="value"/>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
