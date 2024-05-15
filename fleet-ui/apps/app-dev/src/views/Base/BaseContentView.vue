<script setup lang="ts">
import { ref } from 'vue'
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlContent, FlContentText, FlContentNumber, FlContentBoolean, FlContentDate, FlContentEnum, FlContentModel,
  FlContentFile, FlContentTextarea, FlContentJson,
  FlButton, FlAction
} from '@fleet/component'
import { DataTypeEnum, DateFormatEnum } from '@fleet/common';
import { useModel, useEnumeration } from '@fleet/base';

const userModel = useModel("dev.osmanthus.fleet.module.system.model.UserModel");
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
});

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
        <FlBlock title="块内容标题">
          <FlContent :model-value="booleanValue" :data-type="DataTypeEnum.Boolean.value"/>
          <FlContent :model-value="textValue" :data-type="DataTypeEnum.String.value"/>
          <FlContent :model-value="textareaValue" :data-type="DataTypeEnum.Text.value"/>
          <FlContent :model-value="numValue" :data-type="DataTypeEnum.Integer.value"/>
          <FlContent :model-value="numValue" :data-type="DataTypeEnum.Float.value" />
          <FlContent :model-value="new Date()" :data-type="DataTypeEnum.Date.value"/>
          <FlContent :model-value="enumValue" :enumeration="userTypeEnum" :data-type="DataTypeEnum.Enum.value" color="secondary"/>
          <FlContent :model-value="modelValue" :model="userModel" :data-type="DataTypeEnum.Model.value"/>
          <FlContent :model-value="fileValue" :data-type="DataTypeEnum.File.value"/>
          <FlContent :model-value="jsonValue" :data-type="DataTypeEnum.Json.value"/>
        </FlBlock>
        <FlBox>
          <FlContentBoolean :model-value="booleanValue"/>
          <FlContentText :model-value="textValue" :is-show-tip="false"/>
          <FlContentNumber :model-value="numValue" />
          <FlContentDate :model-value="dateValue"/>
          <FlContentEnum :model-value="enumValue" :enumeration="DataTypeEnum"/>
          <FlContentModel :model-value="modelValue" :model="userModel" />
          <FlContentFile :model-value="fileValue"/>
          <FlContentTextarea :model-value="textareaValue"/>
          <FlContentJson :model-value="jsonValue" />
        </FlBox>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style lang="scss">

</style>
