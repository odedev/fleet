<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButton>保存</FlButton>
          <FlButton>生成代码</FlButton>
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlContentText model-value="文本内容显示文本内容显示" :is-show-tip="false"/>
          <FlContentNumber :model-value="12122122.33" />
          <FlContentBoolean  :model-value="false"/>
          <FlContentDate :model-value="'2023-05-27 11:33:31'"/>
          <FlContentEnum :model-value="2" :enumeration="DataTypeEnum"/>
          <FlContentEnum :model-value="2" :enumeration="DataTypeWidthEnum"/>
          <FlContentModel :model-value="user" display-field="username"/>
          <FlContentFile :model-value="resourceFile"/>
        </FlBox>
        <FlBlock>
          <FlContent :model-value="true" :data-type="0"/>
          <FlContent model-value="文本内容显示文本内容显示文本内容显示文本内容显示" :data-type="1"/>
          <FlContent model-value="文本内容显示文本内容显示文本内容显示文本内容显示" :data-type="2"/>
          <FlContent :model-value="121212.1212212212212" :data-type="3" />
          <FlContent :model-value="121212.1212212212212" :data-type="4" />

          <FlContent :model-value="new Date()" :data-type="5"/>
          <FlContent :model-value="0" :enumeration="DateFormatEnum" :data-type="6"/>
          <FlContent :model-value="7" :enumeration="DataTypeEnum" :data-type="6"/>

          <FlContent :model-value="user" :model="userModel" :data-type="7"/>
          <FlContent :model-value="user" display-field="username" :data-type="8"/>
          <FlContent :model-value="resourceFile" :data-type="9"/>

        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlContent, FlContentText, FlContentNumber, FlContentBoolean, FlContentDate, FlContentEnum, FlContentModel,
  FlContentFile,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'
import DataTypeEnum from "@/enumerations/data_type_enum";
import DateFormatEnum from "@/enumerations/date_format_enum";
import DataTypeWidthEnum from "@/enumerations/data_type_width_enum";
import {useModel} from "@/composables/model";

const userModel = useModel("dev.odes.fleet.module.system.model.UserModel");
userModel.name='dsdsds';
console.log(userModel)

const userModel1 = useModel("dev.odes.fleet.module.system.model.UserModel");
console.log(userModel1)

const enumList = [
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
]

const user = {
  id: 'dsdsd',
  username: 'admin',
  code: 'admin1',
  name: '超级管理员',
};

const resourceFile = {
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
};

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
