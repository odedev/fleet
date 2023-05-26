<template>
  <section class="search">
    <div class="search-parameter">
      <FlForm />
    </div>
    <div class="search-action">
      <FlButton>搜索</FlButton>
      <FlButton>重置</FlButton>
    </div>
  </section>
</template>

<script lang="ts" setup>
import FlCell from "../table/FlTableCell.vue";
import FlItem from "../form/FlFormItem.vue";
import FlForm from "../form/FlForm.vue";

import FlButton from "../button/FlButton.vue";

</script>

<style lang="scss">
.search {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
  padding: 16px;
  overflow: hidden;

  .search-parameter {
    width: 100%;
    height: 100%;
    flex-basis: 100%;
    flex-grow: 1;
    flex-shrink: 1;
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;

    overflow: auto;
    .item {
      margin-bottom: 8px;
    }
  }
  .search-action {
    height: 100%;
    width: 132px;
    flex-basis: 132px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;

    padding-top: 6px;

    button {
      margin-left: 12px;
    }
  }

}
</style>
