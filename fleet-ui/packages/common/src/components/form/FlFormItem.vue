<template>
<div class="item item__compact">
  <div class="item-body">
    <div class="item-label">
      <b style="padding-right: 4px;color: red;">*</b>
      <label>名称</label>
      <Tooltip :mini="true" content="文档"><IconQuestionCircle /></Tooltip>
    </div>
    <div class="item-content">
      <slot>
        <FlInput :data-type="1"/>
      </slot>
    </div>
  </div>
  <div class="item-foot">
    <div class="item-tip-title">格式错误</div>
    <div class="item-tip-message">请输入正确的手机号</div>
  </div>
</div>
</template>

<script lang="ts" setup>
import {Breadcrumb, BreadcrumbItem, Tooltip} from "@arco-design/web-vue";
import {IconQuestionCircle} from "@arco-design/web-vue/es/icon";
import FlInput from "../input/FlInput.vue";

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.item {
  width: 440px;
  width: 416px;
  max-width: 440px;
  //max-width: 376px;
  height: 28px;
  height: 32px;
  height: 40px;
  height: 56px;
  // height: 60px;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  line-height: 22px;
  // margin-bottom: 16px;

  &.item__compact {
    height: 40px;

    .item-foot {
      display: none;
    }
  }

  .item-body {
    width: 100%;
    height: 40px;
    //height: 56px;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
  }
  .item-label {
    width: 104px;
    width: 128px;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    align-items: center;
    flex-wrap: nowrap;
    label {
      white-space: nowrap;
      @include ellipsis();
    }
    .arco-icon {
      margin-left: 6px;
    }
  }
  .item-content {
    width: 336px;
    width: 272px;
    //width: 248px;
    //padding: 0 8px;
  }

  .item-foot {
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: flex-start;

    font-size: 10px;
    line-height: 1;
    color: red;
  }
  .item-tip-title {
    width: 128px;
    font-size: 10px;
    line-height: 1;
    text-align: right;
  }
  .item-tip-message {
    width: 272px;
    padding: 0 8px;
  }

  input {
    width: 100%;
    height: 28px;
  }
}
</style>
