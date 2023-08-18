<script lang="ts" setup>
import {Dropdown, Doption, Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/dropdown/style/css.js';
import {IconDown} from "@arco-design/web-vue/es/icon";
import FlButton from "./FlButton.vue";

const handleSelect = (v: any) => {
  console.log(v)
};

</script>
<template>
  <Dropdown @select="handleSelect" :popup-max-height="false">
    <FlButton>更多操作 <IconDown/></FlButton>
    <template #content>
      <Doption>Option 1</Doption>
      <Doption disabled>Option 2</Doption>
      <Doption>Option 3</Doption>
      <Doption>Save now</Doption>
      <Doption>Save and Publish</Doption>
    </template>
  </Dropdown>
</template>
