<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButtonSave />
          <FlButtonReset />
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlForm />
        </FlBox>
        <FlBlock>
          <FlPane :model-value="steps">
            <template #step1>
              <FlBox>
                <FlForm />
              </FlBox>
            </template>
            <template #step2>
              <FlBlock>
                <FlTable></FlTable>
              </FlBlock>
            </template>
            <template #step3>
              <FlBlock>Content of Tab Panel 3</FlBlock>
            </template>
          </FlPane>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import { ref } from "vue";
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlPane, FlForm, FlFormItem,
  FlTable, FlButton, FlSearch, FlAction, FlButtonReset, FlButtonSave
} from '@fleet/component'

const steps = ref([
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
]);

</script>
<style>

</style>
