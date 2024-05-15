<template>
  <FlInputBase class="input-model"  @click="handleClick">
<!--    <InputSearch allow-clear allow-search readonly size="small" >-->
<!--    </InputSearch>-->
    <Input
      :model-value="value"
      :placeholder="placeholder"
      :disabled="isDisabled"
      :readonly="true"
      :error="isInvalid"
      :allow-clear="isNullable"
      @focus="handleFocus"
      @blur="handleBlur"
      @clear="handleClear"
      size="small" >
      <template #suffix>
        <IconFindReplace />
      </template>
    </Input>
  </FlInputBase>

  <FlModal
    v-model="visible"
    :title="modelName"
    width="80%"
    @cancel="handleCancel"
    @confirm="handleOk"
  >
<!--    <FlView>-->
<!--      <FlViewMain>-->
<!--        <FlViewHead>-->
<!--          <FlSearch></FlSearch>-->
<!--        </FlViewHead>-->
<!--        <FlViewBody>-->
          <FlBlock>
            <FlTableConcise v-model="rows" :model="model" v-model:selection-value="selectionValue" selection-type="single"/>
          </FlBlock>
<!--        </FlViewBody>-->
<!--      </FlViewMain>-->
<!--    </FlView>-->
<!--    <FlTableConcise v-model="rows" :model="props.model" />-->
  </FlModal>
</template>
<script lang="ts" setup>
import {ref, unref, computed, reactive} from 'vue';
import {Input, InputSearch} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import {IconFindReplace} from "@arco-design/web-vue/es/icon";
import { Model } from "@fleet/common";

import FlInputBase from "./FlInputBase.vue";
import FlTableConcise from "../table/FlTableConcise.vue";
import FlView from "../view/FlView.vue";
import FlViewMain from "../view/FlViewMain.vue";
import FlViewHead from "../view/FlViewHead.vue";
import FlViewBody from "../view/FlViewBody.vue";
import FlBlock from "../block/FlBlock.vue";
import FlModal from "../modal/FlModal.vue";
import FlSearch from "../search/FlSearch.vue";

const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
  'focus',
  'blur',
  'clear',
  'pressEnter'
]);

let props = withDefaults(defineProps<{
  modelValue: any,
  model: any,
  modelData?: any[],
  modelParameter?: any,
  placeholder?: string,
  displayField?: string,
  isNullable?: boolean,
  isDisabled?: boolean,
  isReadonly?: boolean,
  isInvalid?: boolean,
  autofocus?: boolean,
}>(), {
  isNullable: true,
  isDisabled: false,
  isReadonly: false,
  isInvalid: false,
  autofocus: false,
});

const selectionValue = ref<any>([]);
const visible = ref(false);

const value = computed<any>(() => {
  return props.modelValue?.[Model.getDisplayFieldCode(props.model)];
  // props.displayField ? props.modelValue[props.displayField] : props.modelValue?.name || props.modelValue;
});
const model = computed<any>(() => props.model);
const modelData = computed<any>(() => props.modelData);
const modelParameter = computed<any>(() => props.modelParameter);

const placeholder = computed<string>(() => props.placeholder || '');
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid || (!props.isNullable && !props.modelValue));

const modelName = computed(() => props.model?.name);

const rows = props.modelData;

const handleFocus = (e: FocusEvent) => {
  emits('focus', e);
};

const handleBlur = (e: FocusEvent) => {
  // emits('blur', e);
};

const handleClick = () => {
  console.log(isDisabled, isReadonly)
  if (isDisabled.value || isReadonly.value) {
    return;
  }
  selectionValue.value = [props.modelValue]
  visible.value = true;
};

const handleClear = (e: MouseEvent) => {
  console.log('clear')
  e.preventDefault();
  e.stopPropagation();
  emits('update:modelValue', null);
};

const handleOk = () => {
  let value = selectionValue.value.length ? selectionValue.value[0] : null;
  console.log(selectionValue.value);
  emits('update:modelValue', value);
  emits('blur');
};

const handleCancel = (e: Event): any => {
  emits('blur');

};

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
