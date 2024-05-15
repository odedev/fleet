<script setup lang="ts">
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlStep,
  FlTable, FlButton, FlSearch, FlAction
} from '@fleet/component'

const steps = [
  {
    name: '步骤1',
    code: 'step1',
    description: '',
  },
  {
    name: '步骤2',
    code: 'step2',
    description: '',
  },
  {
    name: '步骤3',
    code: 'step3',
    description: '',
  }
]
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
        <FlStep :model-value="steps" label-placement="vertical">
          <template #step1>
            <div>step1</div>
          </template>
          <template #step2>
            <div>step2</div>
          </template>
          <template #step3>
            <div>step3</div>
          </template>
        </FlStep>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
