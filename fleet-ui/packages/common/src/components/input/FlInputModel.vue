<template>
  <FlInputBase class="input-model"  @click="handleClick">
<!--    <InputSearch allow-clear allow-search readonly size="small" >-->
<!--    </InputSearch>-->
    <Input
      :model-value="value"
      :disabled="isDisabled"
      :readonly="true"
      :error="isInvalid"
      :allow-clear="isNullable"
      @clear="handleClear"
      size="small" >
      <template #suffix>
        <IconFindReplace />
      </template>
    </Input>
  </FlInputBase>

  <Modal
    class="input-model__modal"
    v-model:visible="visible"
    :title="modelName"
    title-align="start"
    width="80%"
    @ok="handleOk"
    @cancel="handleCancel"
    unmountOnClose
  >
    <FlView>
      <FlViewMain>
<!--        <FlViewHead>-->
<!--          <FlSearch></FlSearch>-->
<!--        </FlViewHead>-->
        <FlViewBody>
          <FlBlock>
            <FlTableConcise v-model="rows" :model="props.model" selection-type="single"/>
          </FlBlock>
        </FlViewBody>
      </FlViewMain>
    </FlView>
<!--    <FlTableConcise v-model="rows" :model="props.model" />-->
  </Modal>
</template>
<script lang="ts" setup>
import {ref, unref, computed, reactive} from 'vue';
import {Input, InputSearch, Modal} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/input/style/index.css";
import "@arco-design/web-vue/es/modal/style/index.css";
import {IconFindReplace} from "@arco-design/web-vue/es/icon";
import FlInputBase from "./FlInputBase.vue";
import FlTableConcise from "../table/FlTableConcise.vue";
import FlView from "@/components/view/FlView.vue";
import FlViewMain from "@/components/view/FlViewMain.vue";
import FlViewHead from "@/components/view/FlViewHead.vue";
import FlViewBody from "@/components/view/FlViewBody.vue";
import FlBlock from "@/components/block/FlBlock.vue";
import FlSearch from "@/components/search/FlSearch.vue";

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
  modelParameter?: any,
  displayField?: string,
  isNullable?: boolean,
  isDisabled?: boolean,
  isReadonly?: boolean,
  isInvalid?: boolean,
  autofocus?: boolean,
  data?: any[],
  // models: any[],
  columns?: any[],
  // module?: string,

}>(), {
  isNullable: true,
  isDisabled: false,
  isReadonly: false,
  isInvalid: false,
  autofocus: false,
});

const value = computed<any>(() => {
  return props.displayField ? props.modelValue[props.displayField] : props.modelValue?.name || props.modelValue;
});

const modelName = computed(() => {
  return props.model.name;
})
const visible = ref(false);
const rows = props.data;

console.log(props.model)


const handleFocus = (e: FocusEvent) => {
  console.log('focus')
  emits('focus', e);

  // visible.value = true;
};

const handleClick = () => {
  visible.value = true;
  // Modal.open({
  //   title: 'Info Title',
  //   content: () => h('div', {class: 'info-modal-content'}, 'This is an nest info message')
  // })
};

const handleClear = (e: MouseEvent) => {
  console.log('clear')
  e.preventDefault();
  e.stopPropagation();
  emits('update:modelValue', null);
};

const handleOk = () => {
  let datas = unref(rows);
  let value = datas.length ? datas[0] : null;
  emits('update:modelValue', value);
  console.log(value)
};

const handleCancel = (e: FocusEvent) => {

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
.input-model__modal {
  .arco-modal-body {
    padding: 0;
  }
}
</style>
