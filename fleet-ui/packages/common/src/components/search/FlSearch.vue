<template>
  <section class="search">
    <div class="search-parameter">
      <FlFormItem :data-type="1"/>
      <FlFormItem :data-type="1"/>
<!--      <FlFormItem />-->
    </div>
    <div class="search-action">
      <FlButtonSearch />
      <FlButtonReset />
    </div>
  </section>
</template>

<script lang="ts" setup>
import FlFormItem from "../form/FlFormItem.vue";
import FlForm from "../form/FlForm.vue";

import FlButton from "../button/FlButton.vue";
import FlButtonSearch from "../button/FlButtonSearch.vue";
import FlButtonReset from "../button/FlButtonReset.vue";

</script>

<style lang="scss">
.search {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
  padding: 16px;
  padding-bottom: 8px;
  overflow: hidden;

  .search-parameter {
    width: 100%;
    width: max-content;
    max-width: calc(100% - 132px);
    height: 100%;
    flex-basis: 100%;
    flex-basis: auto;
    //flex-grow: 1;
    flex-shrink: 1;
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;

    overflow: auto;
    .item {
      //margin-bottom: 8px;
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

    padding-top: 4px;
    padding-top: 6px;

    button {
      margin-left: 8px;
    }
  }

}
</style>
