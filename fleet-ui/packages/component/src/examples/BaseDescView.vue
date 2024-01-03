<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlBlock>
        <FlDescription :model-value="data" :model="userProfileModel"  />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlDescription,
  FlAction, FlButton
} from '@/components'
import {useModel} from "@/composables/model";

const userModel = useModel("dev.odes.fleet.module.system.model.UserModel");
const userProfileModel = useModel("dev.odes.fleet.module.system.model.UserProfileModel");

const data = {
  id: 'i',
  name: 'Dev',
  code: 23000 + '',
  address: '32 Park Road, London',
  remark: 'jane.doe@example.com',
  isPreset: false,
  user: {
    id: '1',
    name: 'Jane Doe',
    code: 23000,
  }
};

</script>
<style>

</style>
