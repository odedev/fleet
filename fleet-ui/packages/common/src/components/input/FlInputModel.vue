<template>
  <FlInputBase class="input-model">
<!--    <InputSearch allow-clear allow-search readonly size="small" >-->
<!--    </InputSearch>-->
    <Input allow-clear readonly size="small" >
      <template #suffix>
        <IconFindReplace />
      </template>
    </Input>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {Input, InputSearch} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import {IconFindReplace} from "@arco-design/web-vue/es/icon";
import FlInputBase from "./FlInputBase.vue";

</script>
<style lang="scss">
.input-model {
  .arco-input-wrapper {
    padding-left: 8px;
    padding-right: 8px;
    //padding-top: 1px;
    //padding-bottom: 1px;
    //background-color: #FFFFFF;

    input.arco-input {
      height: 28px;
      line-height: 22px;
    }
  }
  .arco-input-search {
    padding-left: 8px;
    padding-right: 8px;
    padding-top: 1px;
    padding-bottom: 1px;
  }
}
</style>
