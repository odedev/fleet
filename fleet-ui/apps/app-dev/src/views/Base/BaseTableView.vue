<script setup lang="ts">
import { reactive } from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlContent,
  FlTable, FlButton, FlSearch,
} from '@fleet/component'
import { useModel, useModelInitValue } from "@fleet/base";

import getUserProfile from "@/datas/UserProfile";

const model = useModel("dev.osmanthus.fleet.module.system.model.UserModel");
const userProfileModel = useModel("dev.osmanthus.fleet.module.system.model.UserProfileModel");

const datas = reactive(getUserProfile(156));


const columns = [
  {
    title: 'Name',
    dataIndex: 'name',
    ellipsis: true,
    tooltip: true,
    width: 100
  },
  {
    title: 'Salary',
    dataIndex: 'salary',
  },
  {
    title: 'Address',
    dataIndex: 'address',
  },
  {
    title: 'Email',
    dataIndex: 'email',
  },
];
const data = reactive([{
  key: '1',
  name: 'Jane Doe',
  salary: 23000,
  address: '32 Park Road, London',
  email: 'jane.doe@example.com'
}, {
  key: '2',
  name: 'Alisa Ross',
  salary: 25000,
  address: '35 Park Road, London',
  email: 'alisa.ross@example.com'
}, {
  key: '3',
  name: 'Kevin Sandra',
  salary: 22000,
  address: '31 Park Road, London',
  email: 'kevin.sandra@example.com'
}, {
  key: '4',
  name: 'Ed Hellen',
  salary: 17000,
  address: '42 Park Road, London',
  email: 'ed.hellen@example.com'
}, {
  key: '5',
  name: 'William Smith',
  salary: 27000,
  address: '62 Park Road, London',
  email: 'william.smith@example.com'
}]);
</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlSearch :model="userProfileModel"></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTable
            :model-value="datas"
            :model="userProfileModel"
            :page-count="156"
            :is-editable="true"
          >
            <FlButton type="error">执行DDL</FlButton>
            <FlButton type="warn">生成代码</FlButton>
            <FlButton type="primary">维护功能</FlButton>
          </FlTable>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
