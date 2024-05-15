<template>
  <div class="table-filter">
    <i class="table-filter__icon" @click="handleClick">
      <Tooltip :mini="true" content="过滤"><IconFilter /></Tooltip>
    </i>
  </div>
  <Modal
    class="input-model__modal"
    v-model:visible="visible"
    :title="modelName"
    title-align="start"
    width="512px"
    @ok="handleOk"
    @cancel="handleCancel"
    unmountOnClose
  >

    <FlBlock>
      FlConditionItem
    </FlBlock>
  </Modal>
</template>

<script lang="ts" setup>
import {computed, ref} from "vue";
import {Input, InputSearch, Modal} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/modal/style/index.css";
import {IconFilter, IconSettings, IconUpload, IconDownload} from "@arco-design/web-vue/es/icon";
import FlBlock from "../block/FlBlock.vue";

// import {model as Model } from "@fleet/common";


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
}>(), {
});

const visible = ref(false);

const value = computed<any>(() => {
  return props.modelValue;
});

const model = computed<any>(() => props.model);
const modelParameter = computed<any>(() => props.modelParameter);

const modelName = computed(() => props.model?.name);

const handleClick = () => {
  visible.value = true;
};

const handleOk = () => {
  emits('update:modelValue', value);
};

const handleCancel = (e: FocusEvent) => {

};

</script>

<style lang="scss">
@use "../../assets/mixin" as *;


</style>
