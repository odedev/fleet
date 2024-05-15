<script setup lang="ts">
import {reactive, ref} from 'vue';
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlInput, FlInputBoolean, FlInputText, FlInputDate, FlInputNumber, FlInputEnum, FlInputModel, FlInputTree, FlInputFile,
  FlInputTextarea, FlInputPassword,
  FlButton, FlSearch, FlAction
} from '@fleet/component'
import { DataTypeEnum } from '@fleet/common';
import { useModel, useEnumeration } from "@fleet/base";

import getUserProfile from "@/datas/UserProfile";

const userModel = useModel("dev.osmanthus.fleet.module.system.model.UserModel");
const userProfileModel = useModel("dev.osmanthus.fleet.module.system.model.UserProfileModel");
const userTypeEnum = useEnumeration("dev.osmanthus.fleet.module.system.enumeration.UserTypeEnum");

const booleanValue = ref(true);
const textValue = ref('文本内容显示文本内容显示文本内容显示文本内容显示');
const numValue = ref(12122122.33);
const dateValue = ref('2023-05-27 11:33:31');
const enumValue = ref(1);
const modelValue = ref({
  id: 'dsdsd',
  username: 'admin',
  code: 'admin',
  name: '超级管理员',
});
const textareaValue = ref(`
文本内容显示文本内容
显示文本内容显示文本内容显示
`);
const jsonValue = ref({
  id: 'dsdsd',
  username: 'admin',
  code: 'admin',
  name: '超级管理员',
});
const fileValue = ref({
  id: '',
  name: '资源文件手册.pdf',
  size: 12000,
  type: '',
  path: '',
  url: '',
  location: 0,
  directory: '',
  category: '',
  status: '',
  scope: '',
})

const enums = ref([
  {
    value: 0,
    name: '初始化',
  },
  {
    value: 1,
    name: '处理中',
  },
  {
    value: 2,
    name: '完成',
  }
])

// const datas = reactive(getUserProfile(156));

</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButton>保存</FlButton>
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBlock title="输入内容标题">
          <FlInput v-model="booleanValue" :data-type="DataTypeEnum.Boolean.value"/>
          <FlInput v-model="textValue" :data-type="DataTypeEnum.String.value"/>
          <FlInput v-model="numValue" :data-type="DataTypeEnum.Integer.value"/>
          <FlInput v-model="numValue" :data-type="DataTypeEnum.Float.value" />
          <FlInput v-model="dateValue" :data-type="DataTypeEnum.Date.value"/>
          <FlInput v-model="enumValue" :data-type="DataTypeEnum.Enum.value" :enumeration="userTypeEnum"/>
          <FlInput v-model="modelValue" :data-type="DataTypeEnum.Model.value" :model="userProfileModel" :model-data="datas"/>
          <FlInput v-model="jsonValue" :data-type="DataTypeEnum.Json.value"/>
          <FlInput v-model="fileValue" :data-type="DataTypeEnum.File.value"/>
          <FlInput v-model="textareaValue" :data-type="DataTypeEnum.Text.value"/>
        </FlBlock>
        <FlBlock>
          <FlInputBoolean v-model="booleanValue"/>
          <FlInputText v-model="textValue" :is-nullable="false"/>
          <FlInputTextarea v-model="textareaValue"/>
          <FlInputDate v-model="dateValue"/>
          <FlInputNumber  v-model="textValue" :is-nullable="false"/>
          <FlInputEnum v-model="enumValue" :enums="enums"/>
          <FlInputTree />
          <FlInputModel v-model="modelValue" :model="userProfileModel" :model-data="datas"/>
          <FlInputFile  v-model="fileValue"/>
          <FlInputPassword />
        </FlBlock>

      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
