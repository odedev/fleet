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
<script lang="ts" setup>
import {reactive} from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlForm, FlFormItem, FlButtonSave, FlButtonReset, FlAction
} from '@/components'

import {useModel, useModelInitValue} from "@/composables/model";

const userModel = useModel("dev.odes.fleet.module.system.model.UserModel");

userModel.fields.forEach((item: any) => {
  if (item.code === 'name') {
    item.isNullable = false;
    item.tip = '请输入名称';
    item.isDisabled = true;
  } else {
    item.isNullable = true;
  }
})

const model = reactive({
  userModel: useModelInitValue("dev.odes.fleet.module.system.model.UserModel"),
  userProfileModel: useModelInitValue("dev.odes.fleet.module.system.model.UserProfileModel"),
});

console.log(model)
model.userProfileModel.user = model.userModel;

</script>
<style>

</style>
