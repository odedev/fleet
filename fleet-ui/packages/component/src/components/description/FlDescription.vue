<script setup lang="ts">
import {ref, computed} from "vue";
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
const fields = computed(() => props.model?.fields);
const title = computed<any>(() => props.title || props.model?.name);


const column = ref({
  xs: 1,
  // md: 2,
  // lg: 3,
  md: 1,
  lg: 1,
})
</script>
<template>
<div class="description">
  <Descriptions :column="column" :align="{label: 'left'}" table-layout="auto" :bordered="true">
    <DescriptionsItem v-for="field of fields" :label="field.name">
      <FlContent
        :model-value="value[field.code]"
        :data-type="field.dataType"
        :model="field.modelType"
        :enumeration="field.enumType"
      >
        {{ value[field.code] }}
      </FlContent>
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
