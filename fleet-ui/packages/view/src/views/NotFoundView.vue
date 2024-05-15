<script lang="ts" setup>
import {useRouter} from "vue-router";
import {Result, Space} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/result/style/index.css";
import "@arco-design/web-vue/es/space/style/index.css";
import {
  FlView, FlViewMain, FlViewBody, FlBox, FlButton
} from '@fleet/component'

const router = useRouter();

const onBackClick = () => {
  router.back();
};

const onHomeClick = () => {
  router.replace("/");
};

</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlBox>
          <Result status="404" subtitle="Whoops, that page is gone.">
            <template #extra>
              <Space>
                <FlButton type="neutral" @click="onBackClick">返回</FlButton>
                <FlButton type="primary" @click="onHomeClick">首页</FlButton>
              </Space>
            </template>
          </Result>
        </FlBox>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
