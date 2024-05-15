<script setup lang="ts">
import { ref } from 'vue';
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody, FlBlock, FlBox, FlAction,
  FlButton, FlButtonAdd, FlButtonEdit, FlButtonDelete, FlButtonView, FlButtonSave, FlButtonReset,
  FlButtonBack, FlButtonConfirm, FlButtonCancel,
  FlButtonSearch, FlButtonUpload, FlButtonDropdown, FlButtonIcon,
  FlButtonGroup
} from '@fleet/component'

const options = ref([
  {
    value: 0,
    name: '生成代码'
  },
  {
    value: 1,
    name: '发布应用',
  },
  {
    value: 2,
    name: '更新服务',
    disabled: true,
  }
]);

const handleClick = () => {
  console.log('click');
};

const handle1Click = () => {
  console.log('handle1Click');
};
</script>
<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlAction>
          <FlButtonSave />
          <FlButtonBack />
        </FlAction>
      </FlViewHead>
      <FlViewBody>
        <FlBox>
          <FlButtonGroup>
            <FlButton type="primary" @click="handleClick">primary</FlButton>
            <FlButton type="secondary" @click="handle1Click">secondary</FlButton>
            <FlButton type="tertiary">tertiary</FlButton>
            <FlButton type="neutral">neutral</FlButton>
            <FlButton type="error">error</FlButton>
            <FlButton type="warn">warn</FlButton>
            <FlButton type="success">success</FlButton>
            <FlButton type="info">info</FlButton>
          </FlButtonGroup>
        </FlBox>
        <FlBox>
          <FlButtonGroup>
            <FlButton type="primary" @click="handleClick" disabled>primary</FlButton>
            <FlButton type="secondary" @click="handle1Click" disabled>secondary</FlButton>
            <FlButton type="tertiary" disabled>tertiary</FlButton>
            <FlButton type="neutral" disabled>neutral</FlButton>
            <FlButton type="error" disabled>error</FlButton>
            <FlButton type="warn" disabled>warn</FlButton>
            <FlButton type="success" disabled>success</FlButton>
            <FlButton type="info" disabled>info</FlButton>
          </FlButtonGroup>
        </FlBox>
        <FlBox>
          <FlButtonGroup>
            <FlButtonDropdown type="primary" :options="options" @click="handleClick" :disabled="true">primary</FlButtonDropdown>
            <FlButtonDropdown type="secondary" :options="options" @click="handle1Click">secondary</FlButtonDropdown>
            <FlButtonDropdown type="tertiary" :options="options">tertiary</FlButtonDropdown>
            <FlButtonDropdown type="neutral" :options="options">neutral</FlButtonDropdown>
            <FlButtonDropdown type="error" :options="options">error</FlButtonDropdown>
            <FlButtonDropdown type="warn" :options="options">warn</FlButtonDropdown>
            <FlButtonDropdown type="success" :options="options">success</FlButtonDropdown>
            <FlButtonDropdown type="info" :options="options">info</FlButtonDropdown>
          </FlButtonGroup>
        </FlBox>
        <FlBox>
          <FlButtonGroup>
            <FlButtonAdd />
            <FlButtonEdit />
            <FlButtonDelete />
            <FlButtonView />
            <FlButtonSave />
            <FlButtonBack />
            <FlButtonSearch />
            <FlButtonReset />
            <FlButtonConfirm />
            <FlButtonCancel />
            <FlButtonUpload />
            <FlButtonDropdown :options="options" />
            <FlButtonIcon />
          </FlButtonGroup>
        </FlBox>
        <FlBox>
          <FlButton>维护模块</FlButton>
          <FlButtonAdd />
          <FlButtonEdit />
          <FlButtonDelete />
          <FlButtonView />
          <FlButtonUpload :disabled="true"/>

        </FlBox>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<style>

</style>
