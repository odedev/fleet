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
        <FlForm></FlForm>
        </FlBox>
        <FlBox>
          <FlContent v-model="model" :data-type="8"/>
        </FlBox>

      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {reactive} from "vue";
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent,
  FlForm, FlFormItem, FlInputBoolean, FlInputPassword,
  FlTable, FlButtonSave, FlButtonReset, FlSearch, FlAction
} from '../components'

import {useModel, useModelInitValue} from "@/composables/model";

const model = reactive({
  userModel: useModelInitValue("dev.odes.fleet.module.system.model.UserModel"),
  userProfileModel: useModelInitValue("dev.odes.fleet.module.system.model.UserProfileModel"),
});

console.log(model)
model.userProfileModel.user = model.userModel;

</script>
<style>

</style>
