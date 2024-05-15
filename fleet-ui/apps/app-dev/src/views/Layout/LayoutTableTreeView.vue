<template>
  <FlView>
    <FlViewAside>

    </FlViewAside>
    <FlViewMain>
      <FlViewNav>

      </FlViewNav>
      <FlViewHead>
        <FlSearch></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTable
            :model-value="datas"
            :model="userProfileModel"
            :page-count="156"
            :is-editable="true"
          ></FlTable>
        </FlBlock>
<!--              <FlContent>-->
<!--                <FlTable></FlTable>-->
<!--              </FlContent>-->
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {reactive} from "vue";
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlContent,
  FlTable, FlButton, FlSearch,
} from "@fleet/component"

// import {useModel} from "@/composables/model";
//
// import getUserProfile from "@/datas/UserProfile";
//
// const model = useModel("dev.osmanthus.fleet.module.system.model.UserModel");
// const userProfileModel = useModel("dev.osmanthus.fleet.module.system.model.UserProfileModel");
//
// const datas = reactive(getUserProfile(156));

</script>
<style>

</style>
