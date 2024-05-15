<script setup lang="ts">
import {reactive} from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlTable, FlTableConcise, FlSearch, FlButton,
} from '@fleet/component'
import { useModel, useModelInitValue } from "@fleet/base";

import getUserProfile from "@/datas/UserProfile";

const model = useModel("dev.osmanthus.fleet.module.system.model.UserModel");
const userProfileModel = useModel("dev.osmanthus.fleet.module.system.model.UserProfileModel");

const datas = reactive(getUserProfile(156));
</script>

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

<style>

</style>
