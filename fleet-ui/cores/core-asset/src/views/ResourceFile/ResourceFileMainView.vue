<script setup lang="ts">
import { ref, reactive } from "vue";
import { useModel, useModelInitValue } from "@fleet/base";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlTable, FlButton, FlSearch, FlAction
} from "@fleet/component"

const resourceFileModel = useModel("dev.osmanthus.fleet.module.system.model.ResourceFileModel");

const value = ref('MenuMainView.vue');

const modelValue = reactive({
  resourceFileModelValue: [
    {
      code: '1212',
      name: 'dddddd',
    }
  ]
});

const data = reactive([{
  key: '1',
  name: 'Jane Doe',
  salary: 23000,
  address: '32 Park Road, London',
  code: 'jane.doe@example.com'
}, {
  key: '2',
  name: 'Alisa Ross',
  salary: 25000,
  address: '35 Park Road, London',
  code: 'alisa.ross@example.com'
}, {
  key: '3',
  name: 'Kevin Sandra',
  salary: 22000,
  address: '31 Park Road, London',
  code: 'kevin.sandra@example.com'
}, {
  key: '4',
  name: 'Ed Hellen',
  salary: 17000,
  address: '42 Park Road, London',
  code: 'ed.hellen@example.com'
}, {
  key: '5',
  name: 'William Smith',
  salary: 27000,
  address: '62 Park Road, London',
  code: 'william.smith@example.com'
}]);

</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlSearch
          :model="resourceFileModel"
        >
        </FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTable
            :model-value="data"
            :model="resourceFileModel"
            :page-count="5"
          >
          </FlTable>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style lang="scss">

</style>
