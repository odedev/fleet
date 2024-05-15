<script setup lang="ts">
import { ref, reactive } from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlPane, FlTable,
  FlForm, FlFormItem, FlButtonSave, FlButtonReset, FlAction
} from '@fleet/component'
import { useModel, useModelInitValue } from "@fleet/base";

const userModel = useModel("dev.osmanthus.fleet.module.system.model.UserModel");

const model = reactive({
  userModel: useModelInitValue("dev.osmanthus.fleet.module.system.model.UserModel"),
  userProfileModel: useModelInitValue("dev.osmanthus.fleet.module.system.model.UserProfileModel"),
});

model.userProfileModel.user = model.userModel;

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
      <FlViewHead>
        <FlAction>
          <FlButtonSave />
          <FlButtonReset />
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlForm v-model="model.userModel" :model="userModel"/>
        </FlBox>
        <FlBlock>
          <FlPane :model-value="steps">
            <template #step1>
              <FlBox>
                <FlForm v-model="model.userModel" :model="userModel"/>
              </FlBox>
            </template>
            <template #step2>
              <FlBlock>
                <FlTable v-model="model.userModel" :model="userModel"></FlTable>
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

<style>

</style>
