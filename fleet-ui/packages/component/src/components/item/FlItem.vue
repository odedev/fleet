<template>
<div class="item item__compact">
  <div class="item-body">
    <div class="item-label">
      <strong class="item-label__required-symbol" v-if="!isNullable">
        <svg fill="currentColor" viewBox="0 0 1024 1024" width="1em" height="1em">
          <path d="M583.338667 17.066667c18.773333 0 34.133333 15.36 34.133333 34.133333v349.013333l313.344-101.888a34.133333 34.133333 0 0 1 43.008 22.016l42.154667 129.706667a34.133333 34.133333 0 0 1-21.845334 43.178667l-315.733333 102.4 208.896 287.744a34.133333 34.133333 0 0 1-7.509333 47.786666l-110.421334 80.213334a34.133333 34.133333 0 0 1-47.786666-7.509334L505.685333 706.218667 288.426667 1005.226667a34.133333 34.133333 0 0 1-47.786667 7.509333l-110.421333-80.213333a34.133333 34.133333 0 0 1-7.509334-47.786667l214.186667-295.253333L29.013333 489.813333a34.133333 34.133333 0 0 1-22.016-43.008l42.154667-129.877333a34.133333 34.133333 0 0 1 43.008-22.016l320.512 104.106667L412.672 51.2c0-18.773333 15.36-34.133333 34.133333-34.133333h136.533334z"></path>
        </svg>
      </strong>
      <label class="item-label__title">{{title}}</label>
      <span class="item-label__tip" v-if="!!tip">
        <Tooltip :mini="true" :content="tip"><IconQuestionCircle /></Tooltip>
      </span>
    </div>
    <div class="item-content">
      <slot>
        <FlInput
          :model-value="value"
          :data-type="dataType"
          :model="model"
          :placeholder="placeholder"
          :is-nullable="isNullable"
          :is-disabled="isDisabled"
          :is-readonly="isReadonly"
          :is-invalid="isInvalid"
          :autofocus="props.autofocus"
          @update:model-value="handleUpdate"
          @input="handleInput"
          @change="handleChange"
          @focus="handleFocus"
          @blur="handleBlur"
          @clear="handleClear"
        />
      </slot>
    </div>
  </div>
  <div class="item-foot">
    <div class="item-tip__title"></div>
    <div class="item-tip__message">不能为空</div>
  </div>
</div>
</template>

<script lang="ts" setup>
import {computed} from "vue";
import {Tooltip} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/tooltip/style/index.css";
import {IconQuestionCircle} from "@arco-design/web-vue/es/icon";
import FlInput from "../input/FlInput.vue";


const emits = defineEmits([
  'update:modelValue',
  'input',
  'change',
  'focus',
  'blur',
  'clear',
  'pressEnter'
]);

const props = withDefaults(defineProps<{
  title: string,
  modelValue: any,
  dataType: number,
  enumeration?: any | any[],
  model?: any,
  modelData?: any[],
  modelParameter?: any,
  tip?: string,
  placeholder?: string,
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

const title = computed<string>(() => props.title);
const value = computed<any>(() => props.modelValue);
const dataType = computed<number>(() => props.dataType);
const enumeration = computed<any>(() => props.enumeration);
const model = computed<any>(() => props.model);
const modelData = computed<any>(() => props.modelData);
const modelParameter = computed<any>(() => props.modelParameter);
const tip = computed<string>(() => props.tip || '');
const placeholder = computed<string>(() => props.placeholder || '');
const isNullable = computed<boolean>(() => props.isNullable);
const isDisabled = computed<boolean>(() => props.isDisabled);
const isReadonly = computed<boolean>(() => props.isReadonly);
const isInvalid = computed<boolean>(() => props.isInvalid);


const handleUpdate = (value: any) => {
  emits('update:modelValue', value);
};

const handleInput = (value: any, e: Event) => {
  emits('input', value);
};

const handleChange = (value: any, e: Event) => {
  emits('change', value);
};

const handleFocus = (e: FocusEvent) => {
  emits('focus', e);
};

const handleBlur = (e: FocusEvent) => {
  emits('blur', e);
};

const handleClear = (e: MouseEvent) => {
  emits('clear', e);
};


</script>

<style lang="scss">
@use "../../assets/mixin" as *;

.item {
  width: 440px;
  width: 416px;
  max-width: 440px;
  //max-width: 376px;
  height: 32px;
  height: 40px;
  height: 56px;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
  font-size: 14px;
  line-height: 22px;
  // margin-bottom: 16px;

  &.item__compact {
    height: 48px;

    .item-foot {
      display: none;
    }
  }

  .item-body {
    width: 100%;
    height: 40px;
    //height: 56px;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
  }
  .item-label {
    width: 104px;
    width: 128px;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    align-items: center;
    flex-wrap: nowrap;

    .item-label__required-symbol {
      @include color-error();
      font-size: 12px;
      line-height: 1;
      svg {
        display: inline-block;
        transform: scale(.5)
      }
    }
    label {
      margin-right: 6px;
      white-space: nowrap;
      @include ellipsis();
    }
    .item-label__tip {
      margin-right: 6px;
      .arco-icon {
        //color: #c9cdd4;
        @include surface-variant-color();
      }
    }

  }
  .item-content {
    width: 336px;
    width: 272px;
    width: 288px;

    //width: 248px;
    //padding: 0 8px;
  }

  .item-foot {
    height: 16px;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: flex-start;

    font-size: 10px;
    line-height: 1;
    @include color-error();
  }
  .item-tip__title {
    width: 128px;
    font-size: 10px;
    line-height: 1;
    text-align: right;
  }
  .item-tip__message {
    width: 272px;
    padding: 0 8px;
  }

}
</style>
