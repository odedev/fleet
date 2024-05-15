<script setup lang="ts">
import {computed} from "vue";
import {Tabs, TabPane} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/tabs/style/css.js";

interface Pane {
  name?: string,
  code?: string,
  description?: string,
  component?: any,
}

interface Props {
  modelValue: Pane[],
}

const props = defineProps<Props>();

const value = computed<Pane[]>(() => props.modelValue);

const defaultActiveKey = props.modelValue?.[0].code;

</script>
<template>
  <div class="pane">
    <Tabs type="line" :default-active-key="defaultActiveKey">
      <TabPane v-for="item in value" :title="item.name" :key="item.code">
        <slot :name="item.code">
          <component :is="item.component"/>
        </slot>
      </TabPane>
    </Tabs>
  </div>
</template>
<style lang="scss">
.pane {
  width: 100%;
  height: 100%;

  .arco-tabs {
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
  }
  .arco-tabs-nav {
    flex-grow: 0;
    flex-shrink: 0;
  }
  .arco-tabs-content {
    width: 100%;
    height: 100%;
    flex-grow: 1;
    flex-shrink: 1;
    padding-top: 0;
  }
}
</style>
