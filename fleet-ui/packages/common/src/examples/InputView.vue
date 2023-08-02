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
          <FlInputBoolean v-model="booleanValue"/>
          <FlInputText v-model="textValue" :is-nullable="false"/>
          <FlInputDate />
          <FlInputNumber  v-model="textValue" :is-nullable="false"/>
          <FlInputEnum v-model="enumValue" :enums="enums"/>
          <FlInputTree />
          <FlInputModel v-model="modelValue" :model="userModel" :model-data="datas"/>
          <FlInputFile />
          <FlInputPassword />
          <FlInputTextarea />

        </FlBox>
        <FlBlock>
          <FlInputBoolean />
          <FlInputText />
          <FlInputDate />
          <FlInputNumber />
          <FlInputEnum v-model="enumValue" :enums="userTypeEnum"/>
          <FlInputTree />
          <FlInputModel  v-model="modelValue" :model="userModel" :data="datas"/>
          <FlInputFile />
          <FlInputPassword />
          <FlInputTextarea />

        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {reactive, ref} from 'vue';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlInputBoolean, FlInputText, FlInputDate, FlInputNumber, FlInputEnum, FlInputModel, FlInputTree, FlInputFile,
  FlInputTextarea, FlInputPassword,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'
import {useModel} from "@/composables/model";
import {useEnumeration} from "@/composables/enumeration";

const userModel = useModel("dev.odes.fleet.module.system.model.UserModel");
const userTypeEnum = useEnumeration("dev.odes.fleet.module.system.enumeration.UserTypeEnum");

const booleanValue = ref(true);
const textValue = ref('');
const modelValue = ref({
  name: '1212',
  code: 'dsdsd'
});
const enumValue = ref(0);
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
