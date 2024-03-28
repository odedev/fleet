<script setup lang="ts">
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlItem,
  FlAction, FlButtonSave, FlButtonBack
} from '@fleet/component'

</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButtonSave />
          <FlButtonBack />
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlItem title="标题" model-value="dsddsdsadsdsdsadsdsdsadssads" :data-type="1"/>
          <FlItem title="标题" model-value="文本内容显示" :data-type="1"/>
          <FlItem title="标题" model-value="文本内容显示" :data-type="1"/>
        </FlBox>
        <FlBlock style="width: 200px;">
          <FlItem title="标题" model-value="dsddsdsadsdsdsadsdsdsadssads" :data-type="1"/>
          <FlItem title="标题" model-value="121212.1212212212212" :data-type="1" />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
