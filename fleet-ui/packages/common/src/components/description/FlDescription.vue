<script setup lang="ts">
import {computed} from "vue";
import {Descriptions, DescriptionsItem, Tag} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/descriptions/style/css.js";
import FlContent from "../content/FlContent.vue";

interface Props {
  modelValue: any,
  model?: any,
  title?: string,
}

const props = defineProps<Props>();

const value = computed<any>(() => props.modelValue);
const model = computed<any>(() => props.model);
const title = computed<any>(() => props.title);

</script>

<template>
<div class="description">
  <Descriptions :data="value" :title="title" :column="{xs:1, md:2, lg:3}" bordered>
    <DescriptionsItem v-for="item of value" :label="item.label">
      <FlContent :model-value="item.value" :data-type="1">{{ item.value }}</FlContent>
    </DescriptionsItem>
  </Descriptions>
</div>
</template>

<style lang="scss">
.description {
  .arco-descriptions-title {
    margin-bottom: 0;
  }

  .arco-descriptions-size-medium.arco-descriptions-border .arco-descriptions-item-label-block {
    padding: 4px 18px;
  }
  .arco-descriptions-size-medium.arco-descriptions-border .arco-descriptions-item-value-block {
    padding: 0;
  }
}
</style>
