<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlSearch :model="userProfileModel"></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTableConcise
            :model-value="datas"
            :model="userProfileModel"
            :page-count="156"
            selection-type="multiple"
            is-show-head
          ></FlTableConcise>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {reactive} from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlTable, FlTableConcise, FlSearch, FlButton,
} from '@/components/index.ts'
import {useModel} from "@/composables/model";

import getUserProfile from "@/datas/UserProfile.ts";

const model = useModel("dev.odes.fleet.module.system.model.UserModel");
const userProfileModel = useModel("dev.odes.fleet.module.system.model.UserProfileModel");

const datas = reactive(getUserProfile(156));
</script>
<style>

</style>
