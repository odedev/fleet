<script setup lang="ts">
import { reactive } from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlForm, FlFormItem, FlButtonSave, FlButtonReset, FlAction
} from '@fleet/component'
import { useModel, useModelInitValue } from "@fleet/base";

const userModel = useModel("dev.osmanthus.fleet.module.system.model.UserModel");

const model = reactive({
  userModel: useModelInitValue("dev.osmanthus.fleet.module.system.model.UserModel"),
  userProfileModel: useModelInitValue("dev.osmanthus.fleet.module.system.model.UserProfileModel"),
});

model.userProfileModel.user = model.userModel;

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
          <FlForm
            :model-value="model.userModel"
            :model="userModel"
          />
        </FlBox>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
