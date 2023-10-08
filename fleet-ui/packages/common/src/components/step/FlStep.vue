<script setup lang="ts">
import {ref, computed} from "vue";
import {Steps, Step} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/steps/style/css.js";

interface Step {
  name?: string,
  code?: string,
  description?: string,
  component?: any,
}
interface Props {
  modelValue: Step[],
}

const props = defineProps<Props>();

const value = computed<Step[]>(() => props.modelValue);

const current = ref(1);

const handleCurrentChange = (value: number) => {
  current.value = value;
};

</script>

<template>
<div class="step">
  <div class="step-head">
    <Steps :current="current" @change="handleCurrentChange" :changeable="true" label-placement="vertical">
      <Step v-for="item in value" :description="item.description">{{item.name}}</Step>
    </Steps>
  </div>
  <div class="step-body">
    <template v-for="(item, index) in value">
      <div class="step-body__content" v-show="index + 1 === current">
        <slot :name="item.code">
          <component :is="item.component"/>
        </slot>
      </div>
    </template>
  </div>
</div>
</template>

<style lang="scss">
.step {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;

  .step-head {
    flex-grow: 0;
    flex-shrink: 0;
  }
  .step-body {
    width: 100%;
    height: 100%;
    flex-grow: 1;
    flex-shrink: 1;
  }
  .step-body__content {
    width: 100%;
    height: 100%;
  }
}
</style>
