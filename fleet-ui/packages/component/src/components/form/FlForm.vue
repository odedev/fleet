<template>
<form class="form">
  <template v-for="field in fields">
    <FlItem
      :title="field.name"
      v-model="props.modelValue[field.code]"
      :data-type="field.dataType"
      :model="field.modelType"
      :enumeration="field.enumType"
      :is-nullable="field.isNullable"
      :is-disabled="field.isDisabled"
      :tip="field.tip"
    />
  </template>
</form>
</template>

<script lang="ts" setup>
import {computed} from "vue";
import FlItem from "../item/FlItem.vue";


interface Props {
  modelValue: any,
  model: any,
}

const props = withDefaults(defineProps<Props>(), {
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
