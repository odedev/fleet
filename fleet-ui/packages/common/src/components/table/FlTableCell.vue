<template>
<div class="cell" ref="el" @click="onClick" @dblclick="onDblclick">
  <FlInput v-if="isEditable" @blur="onBlur" :data-type="1"/>
  <FlContent v-else :data-type="0" model-value="" />
  <slot></slot>
</div>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import FlContent from "../content/FlContent.vue";
import FlInput from "../input/FlInput.vue";

const props = defineProps<{
  isEditable?: boolean,
}>();

const isEditable = ref<boolean>(false);

const el = ref<Element>();

const onClick = () => {

};

const onDblclick = () => {
  // if (!props.isEditable) {
  //   isEditable.value = false;
  //   return
  // }
  isEditable.value = true;
  console.log(el)
  el.value.querySelector('input')?.focus();
}

const onBlur = () => {
  isEditable.value = false;
}

</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.cell {
  width: 336px;
  width: 272px;
  width: 100%;
  // max-width: 272px;
  height: 28px;
  height: 32px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  flex-wrap: nowrap;
  font-size: 14px;
  line-height: 22px;
  // padding: 0 8px;

  @include ellipsis();

}
</style>
