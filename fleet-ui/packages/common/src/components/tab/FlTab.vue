<template>
  <nav class="tab">
    <IconMenuFold />
    <IconMenuUnfold />
    <slot></slot>
    <ol class="tab-list">
      <li class="tab-item">
        <RouterLink to="form" >表单</RouterLink>
        <i class="icon"><IconClose /></i>
      </li>
      <li class="tab-item active">
        <RouterLink to="table" >数据列表</RouterLink>
        <i class="icon"><IconClose /></i>
      </li>
      <li class="tab-item">
        <RouterLink to="panel" >多标签页</RouterLink>
        <i class="icon"><IconClose /></i>
      </li>
      <li class="tab-item">
        <RouterLink to="card" >卡片列表</RouterLink>
        <i class="icon"><IconClose /></i>
      </li>
      <li class="tab-item">
        <RouterLink to="step" >多步骤</RouterLink>
        <i class="icon"><IconClose /></i>
      </li>
      <li class="tab-item">
        <RouterLink to="desc" >描述列表</RouterLink>
        <i class="icon"><IconClose /></i>
      </li>
    </ol>
  </nav>
</template>
<script lang="ts" setup>
import {RouterLink} from "vue-router";
import {IconMenuFold, IconMenuUnfold, IconClose} from "@arco-design/web-vue/es/icon";
</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.tab {
  --tab-height: 48px;
  --tab-height: 40px;
  height: var(--tab-height);
  flex-basis: var(--tab-height);
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  padding: 0;

  .tab-list {
    height: 100%;
    display: flex;
    flex-direction: row;
    list-style: none;
  }
  .tab-item {
    height: 100%;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    padding: 0 8px;

    &.active {
      background-color: #F8F8F8;
    }

    a {
      line-height: 22px;
      padding: 0 4px;
      @include color-secondary();
      @include color-secondary-theme();
    }

    .icon {
      height: 16px;
      width: 16px;
      //padding: 4px;
      font-size: 12px;
      display: flex;
      justify-content: center;
      align-items: center;

      border-radius: 50%;
      color: #BFBFBF;

      &:hover {
        @include background-color-tertiary();
        @include background-color-tertiary-theme();
      }
    }

  }
}
</style>
