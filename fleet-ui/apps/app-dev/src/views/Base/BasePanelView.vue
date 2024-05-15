<script setup lang="ts">
import { ref } from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlPane, FlAction, FlButton
} from "@fleet/component";

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

<style lang="scss">

</style>
