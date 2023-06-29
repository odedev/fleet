<template>
  <nav class="nav">
    <div class="nav-breadcrumb">
      <IconHome />
      <Breadcrumb :style="{fontSize: `14px`}">
        <BreadcrumbItem>首页</BreadcrumbItem>
        <BreadcrumbItem>用户中心</BreadcrumbItem>
        <BreadcrumbItem>用户管理</BreadcrumbItem>
      </Breadcrumb>
    </div>
    <slot></slot>
    <div class="nav-action">
<!--      <Tooltip :mini="true" content="设置"><IconSettings /></Tooltip>-->
      <div class="nav-action__item" @click="onBackClick">
        <Tooltip :mini="true" content="返回"><IconArrowLeft /></Tooltip>
      </div>
      <div class="nav-action__item" @click="onRefreshClick">
        <Tooltip :mini="true" content="刷新"><IconRefresh /></Tooltip>
      </div>
      <div class="nav-action__item" @click="onHelpClick">
        <Tooltip :mini="true" content="文档"><IconBook /></Tooltip>
      </div>
<!--      <Tooltip :mini="true" content="帮助"><IconQuestionCircle /></Tooltip>-->
    </div>

    <Drawer :width="552" :visible="visible" @ok="handleOk" @cancel="handleCancel" unmountOnClose :footer="false">
      <template #title>
        使用手册
      </template>
      <div>You can customize modal body text by the current situation. This modal will be closed immediately once you
        press the OK button.
      </div>
    </Drawer>
  </nav>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import {useRouter, useRoute} from "vue-router";
import {Breadcrumb, BreadcrumbItem, Drawer, Tooltip} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/breadcrumb/style/index.css";
import "@arco-design/web-vue/es/tooltip/style/index.css"
import '@arco-design/web-vue/es/drawer/style/css.js';
import {IconHome, IconArrowLeft, IconQuestionCircle, IconRefresh, IconBook, IconFile, IconSettings} from "@arco-design/web-vue/es/icon";

const router = useRouter();
const route = useRoute();

const visible = ref(false);

const onBackClick = () => {
  router.back();
};

const onRefreshClick = () => {
  let path = route.path;
  router.push(path);
  // router.replace(path);
  // router.replace(`/redirect?path=${path}`);
  console.log(path);
}

const onHelpClick = () => {
  visible.value = true;
}

const handleOk = () => {
  visible.value = false;
};
const handleCancel = () => {
  visible.value = false;
}

</script>
<style lang="scss">
.nav {
  --nav-height: 40px;
  --nav-height: 28px;
  --nav-height: 32px;
  height: var(--nav-height);
  flex-basis: var(--nav-height);
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: flex-end;
  font-size: 14px;
  line-height: 1;
  padding: 0;
  //border-bottom: 1px solid #F5F5F5;
  background-color: #F8F8F8;

  .nav-breadcrumb {
    padding: 0 20px;
  }
  .nav-action {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: flex-end;
    font-size: 20px;
    padding: 0 20px;
    .arco-icon {
      margin-left: 8px;
    }
  }
  .nav-action__item {
    cursor: pointer;
  }
}
</style>
