<template>
<form class="form">
  <FlFormItem :data-type="1"/>
  <FlFormItem :data-type="1"/>
  <FlFormItem :data-type="6"/>
  <FlFormItem :data-type="0"/>
  <FlFormItem :data-type="1"/>
</form>
</template>

<script lang="ts" setup>
import FlFormItem from "./FlFormItem.vue";

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
