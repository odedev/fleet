<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlSearch></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTableConcise :model-value="datas" :model="userProfileModel" is-show-head></FlTableConcise>
        </FlBlock>
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
  FlTable, FlTableConcise, FlButton, FlSearch,
} from '../components'
import {getModel, getModelByFullName} from "@/core/application";

const model = getModelByFullName("dev.odes.fleet.module.system.model.UserModel");
const userProfileModel = getModelByFullName("dev.odes.fleet.module.system.model.UserProfileModel");


const datas = reactive([{
  id: '1',
  name: 'Jane Doe',
  code: 23000,
  address: '32 Park Road, London',
  remark: 'jane.doe@example.com',
  isPreset: false,
  user: {
    id: '1',
    name: 'Jane Doe',
    code: 23000,
  }
}, {
  id: '2',
  name: 'Alisa Ross',
  code: 25000,
  address: '35 Park Road, London',
  remark: 'alisa.ross@example.com',
  isPreset: false,
  user: {
    id: '1',
    name: 'Jane Doe',
    code: 23000,
  }
}, {
  id: '3',
  name: 'Kevin Sandra',
  code: 22000,
  address: '31 Park Road, London',
  remark: 'kevin.sandra@example.com',
  isPreset: true,
  user: {
    id: '1',
    name: 'Jane Doe',
    code: 123000,
  }
}, {
  id: '4',
  name: 'Ed Hellen',
  code: 17000,
  address: '42 Park Road, London',
  remark: 'ed.hellen@example.com',
  isPreset: false,
  user: {
    id: '1',
    name: 'Jane Doe',
    code: 123000,
  }
}, {
  id: '5',
  name: 'William Smith',
  code: 27000,
  address: '62 Park Road, London',
  remark: 'william.smith@example.com',
  isPreset: true,
  user: {
    id: '1',
    name: 'Jane Doe',
    code: 23000,
  }
}]);
</script>
<style>

</style>
