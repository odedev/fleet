<script setup lang="ts">
import {computed} from "vue";
import {Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/button/style/css.js';
import FlButtonBase from "./FlButtonBase.vue";

interface Props {
  type?: "primary" | "secondary" | "tertiary" | "neutral" | "error" | "warn" | "success" | "info" | undefined,
  disabled?: boolean,
}

const props = withDefaults(defineProps<Props>(), {
  disabled: false,
});

const emits = defineEmits(['click']);

const type = computed(() => props.type ? 'button__' + props.type : 'button__primary');
const disabled = computed(() => props.disabled || false);

const handleClick = () => {
  emits('click');
};

</script>
<template>
  <FlButtonBase @click="handleClick" :class="type">
    <Button type="primary" size="small" :disabled="disabled">
      <slot></slot>
    </Button>
  </FlButtonBase>
</template>
<style lang="scss">
@use "../../assets/mixin" as *;

.button {
  &.button__primary .arco-btn {
    @include background-color-primary();
    &:hover {
      @include background-color-primary();
    }
    &.arco-btn-disabled {
      @include background-color-primary();
    }
  }

  &.button__secondary .arco-btn {
    @include background-color-secondary();
    &:hover {
      @include background-color-secondary();
    }
    &.arco-btn-disabled {
      @include background-color-secondary();
    }
  }

  &.button__tertiary .arco-btn {
    @include background-color-tertiary();
    &:hover {
      @include background-color-tertiary();
    }
    &.arco-btn-disabled {
      @include background-color-tertiary();
    }
  }

  &.button__neutral .arco-btn {
    @include background-color-neutral();
    &:hover {
      @include background-color-neutral();
    }
    &.arco-btn-disabled {
      @include background-color-neutral();
    }
  }
  &.button__error .arco-btn {
    @include background-color-error();
    &:hover {
      @include background-color-error();
    }
    &.arco-btn-disabled {
      @include background-color-error();
    }
  }
  &.button__warn .arco-btn {
    @include background-color-warn();
    &:hover {
      @include background-color-warn();
    }
    &.arco-btn-disabled {
      @include background-color-warn();
    }
  }
  &.button__success .arco-btn {
    @include background-color-success();
    &:hover {
      @include background-color-success();
    }
    &.arco-btn-disabled {
      @include background-color-success();
    }
  }
  &.button__info .arco-btn {
    @include background-color-info();
    &:hover {
      @include background-color-info();
    }
    &.arco-btn-disabled {
      @include background-color-info();
    }
  }
}

</style>
