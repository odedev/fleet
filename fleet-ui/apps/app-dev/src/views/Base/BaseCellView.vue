<script setup lang="ts">
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlCell, FlContentText, FlContentNumber,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'

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
        <FlBox>
          <FlCell model-value="dsddsdsadsdsdsadsdsdsadssads" :data-type="1"/>
          <FlCell model-value="文本内容显示" :data-type="1"/>
          <FlCell model-value="文本内容显示" :data-type="1" />

        </FlBox>
        <FlBlock style="width: 200px;">
          <FlCell model-value="dsddsdsadsdsdsadsdsdsadssads" :data-type="1"/>
          <FlCell model-value="121212.1212212212212" :data-type="1" />
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
