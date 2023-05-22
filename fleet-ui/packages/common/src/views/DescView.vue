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
        <FlBlock style="width: 200px;">
          <FlContentText value="dsddsdsadsdsdsadsdsdsadssads" :is-show-tip="true"/>
          <FlContentNumber value="121212.1212212212212" :is-show-tip="false" />
        </FlBlock>
        <FlBlock>
        <Descriptions :data="data" title="User Info" layout="inline-horizontal" bordered/>
        <Descriptions :data="data" title="User Info" :column="{xs:1, md:3, lg:4}" bordered>
          <Descriptions-item v-for="item of data" :label="item.label">
            <a-tag>{{ item.value }}</a-tag>
          </Descriptions-item>
        </Descriptions>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {Descriptions, DescriptionsItem} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/descriptions/style/css.js";

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlCell, FlItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components/index.ts'

const data = [{
  label: 'Name',
  value: 'Socrates',
}, {
  label: 'Mobile',
  value: '123-1234-1234',
}, {
  label: 'Residence',
  value: 'Beijing'
}, {
  label: 'Hometown',
  value: 'Beijing',
}, {
  label: 'Address',
  value: 'Yingdu Building, Zhichun Road, Beijing'
}];

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
