<template>
<form class="form">
  <template v-for="field in fields">
    <FlFormItem
      :title="field.name"
      v-model="props.modelValue[field.code]"
      :data-type="field.dataType"
      :model="field.modelType"
      :enumeration="field.enumType"
    />
  </template>
  <FlFormItem title="字符串" :data-type="1" :is-disabled="true"/>
  <FlFormItem title="字符串" :data-type="6"/>
  <FlFormItem title="布尔" :data-type="0" :is-nullable="false"/>
  <FlFormItem title="字符串" :data-type="1"/>
</form>
</template>

<script lang="ts" setup>
import FlFormItem from "./FlFormItem.vue";
import {computed} from "vue";

const props = withDefaults(defineProps<{
  modelValue: any,
  model: any,
}>(), {
});

const fields = computed(() => props.model?.fields || []);

</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.form {
  width: 100%;
  max-width: 100%;
  height: max-content;
  flex-basis: max-content;
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  align-items: flex-start;
  justify-content: flex-start;
  align-content: flex-start;
  flex-wrap: wrap;
  //padding: 16px;
  // margin-bottom: 16px;

}
</style>
