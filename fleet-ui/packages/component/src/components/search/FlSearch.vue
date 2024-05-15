<script setup lang="ts">
import { computed, ref } from "vue";
import { Model } from "@fleet/common";
import FlFormItem from "../form/FlFormItem.vue";
import FlButtonSearch from "../button/FlButtonSearch.vue";
import FlButtonReset from "../button/FlButtonReset.vue";

const props = defineProps<{
  model: any,
  modelParameter?: any,
  // data?: any[],
  // columns?: any[],
  // isShowHead?: boolean,
}>();
const value = ref<any>({});

const fields = computed(() => {
  let fields = Model.getSearchableFields(props.model);
  console.log(fields)
  return fields;
});

</script>

<template>
  <section class="search">
    <div class="search-parameter">
      <template v-for="field in fields">
        <FlFormItem
          :title="field.name"
          v-model="value[field.code]"
          :data-type="field.dataType"
          :model="field.modelType"
          :enumeration="field.enumType"
        />
      </template>
<!--
      <FlFormItem title="名称" :data-type="1"/>
      <FlFormItem title="编码" :data-type="1"/>
      <FlFormItem title="编码" :data-type="1"/> -->
    </div>
    <div class="search-action">
      <FlButtonSearch />
      <FlButtonReset />
    </div>
  </section>
</template>

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
