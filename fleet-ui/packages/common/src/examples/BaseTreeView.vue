<template>
  <FlView>
    <FlViewMain>
      <FlViewNav>

      </FlViewNav>

      <FlViewBody>
        <FlBlock>
          <FlTree v-model="treeData"/>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {ref, h, computed} from "vue";
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlContent,
  FlTable, FlButton, FlSearch, FlTree,
} from '../components'

import { IconApps, IconCommon, IconLayout, IconRelation, IconUnorderedList } from '@arco-design/web-vue/es/icon';

const treeData = ref([
  {
    title: '用户中心',
    id: '0-0',
    children: [
      {
        icon: () => h(IconApps),
        draggable: false,
        title: '应用',
        id: '0-0-11',
        children: [
          {
            title: 'Leaf',
            id: '0-0-1-1'
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-1-2'
          }
        ]
      },
      {
        icon: () => h(IconRelation),
        draggable: false,
        title: '接口',
        id: '0-0-21',
        children: [
          {
            title: 'Leaf',
            id: '0-0-21-1'
          },
          {
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-21-2'
          }
        ]
      },
      {
        icon: () => h(IconCommon),
        draggable: false,
        title: '模型',
        id: '0-0-2',
        children: [
          {
            title: 'Leaf',
            id: '0-0-2-1'
          },
          {
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-2-2'
          }
        ]
      },
      {
        icon: () => h(IconUnorderedList),
        draggable: false,
        title: '枚举',
        id: '0-0-3',
        children: [
          {
            title: 'Leaf',
            id: '0-0-3-1'
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-3-2'
          }
        ]
      },

      {
        icon: () => h(IconLayout),
        draggable: false,
        title: '视图',
        id: '0-0-4',
        children: [
          {
            title: 'Leaf',
            id: '0-0-4-1'
          },
          {
            draggable: false,
            title: 'Leaf 0-0-2-2 (Drag disabled)',
            id: '0-0-4-2'
          }
        ]
      },
    ],
  },
  {
    title: '系统管理',
    id: '0-1',
    children: [
      {
        title: 'Branch 0-1-1',
        id: '0-1-1',
        children: [
          {
            title: 'Leaf',
            id: '0-1-1-1',
          },
          {
            title: 'Leaf',
            id: '0-1-1-2',
          },
        ]
      },
      {
        title: 'Leaf',
        id: '0-1-2',
      },
    ],
  },
]);
</script>
<style>

</style>
