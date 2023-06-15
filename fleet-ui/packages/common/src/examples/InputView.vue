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
          <FlInputText v-model="textValue" :is-invalid="true"/>
          <FlInputDate />
          <FlInputNumber />
          <FlInputEnum v-model="enumValue" :enums="enums"/>
          <FlInputTree />
          <FlInputModel v-model="modelValue"/>
          <FlInputFile />
          <FlInputPassword />
          <FlInputTextarea />

        </FlBox>
        <FlBlock>
          <FlInputBoolean />
          <FlInputText />
          <FlInputDate />
          <FlInputNumber />
          <FlInputEnum />
          <FlInputTree />
          <FlInputModel />
          <FlInputFile />
          <FlInputPassword />
          <FlInputTextarea />

        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {ref} from 'vue';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlInputBoolean, FlInputText, FlInputDate, FlInputNumber, FlInputEnum, FlInputModel, FlInputTree, FlInputFile,
  FlInputTextarea, FlInputPassword,
  FlFormItem,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

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

</script>
<style>

</style>
