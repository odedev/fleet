<script setup lang="ts">
import {ref, h, computed} from "vue";
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlTable, FlButton, FlSearch, FlTree,
} from '@fleet/component'

import { IconApps, IconCommon, IconLayout, IconRelation, IconUnorderedList } from '@arco-design/web-vue/es/icon';

const treeData = ref([
  {
    name: '用户中心',
    id: '0-0',
    children: [
      {
        icon: () => h(IconApps),
        draggable: false,
        name: '应用',
        id: '0-0-11',
        children: [
          {
            name: 'Leaf',
            id: '0-0-1-1'
          },
          {
            draggable: false,
            name: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-1-2'
          }
        ]
      },
      {
        icon: () => h(IconRelation),
        draggable: false,
        name: '接口',
        id: '0-0-21',
        children: [
          {
            name: 'Leaf',
            id: '0-0-21-1'
          },
          {
            name: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-21-2'
          }
        ]
      },
      {
        icon: () => h(IconCommon),
        draggable: false,
        name: '模型',
        id: '0-0-2',
        children: [
          {
            name: 'Leaf',
            id: '0-0-2-1'
          },
          {
            name: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-2-2'
          }
        ]
      },
      {
        icon: () => h(IconUnorderedList),
        draggable: false,
        name: '枚举',
        id: '0-0-3',
        children: [
          {
            name: 'Leaf',
            id: '0-0-3-1'
          },
          {
            draggable: false,
            name: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-3-2'
          }
        ]
      },

      {
        icon: () => h(IconLayout),
        draggable: false,
        name: '视图',
        id: '0-0-4',
        children: [
          {
            name: 'Leaf',
            id: '0-0-4-1'
          },
          {
            draggable: false,
            name: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-4-2'
          }
        ]
      },
    ],
  },
  {
    name: '系统管理',
    id: '0-1',
    children: [
      {
        name: 'Branch 0-1-1',
        id: '0-1-1',
        children: [
          {
            name: 'Leaf',
            id: '0-1-1-1',
          },
          {
            name: 'Leaf',
            id: '0-1-1-2',
          },
        ]
      },
      {
        name: 'Leaf',
        id: '0-1-2',
      },
    ],
  },
]);
</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewNav>

      </FlViewNav>
      <FlViewBody>
        <FlBlock>
          <FlTree v-model="treeData" :is-draggable="true" />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
