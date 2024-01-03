<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlPane :model-value="steps">
          <template #step1>
            <div>step1</div>
          </template>
          <template #step2>
            <div>step2</div>
          </template>
          <template #step3>
            <div>step3</div>
          </template>
        </FlPane>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlPane, FlForm,
  FlAction, FlButton
} from '../components'


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
<style>

</style>
