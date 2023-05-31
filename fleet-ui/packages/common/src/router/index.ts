import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

import ContentView from '../examples/ContentView.vue'
import InputView from '../examples/InputView.vue'
import ButtonView from '../examples/ButtonView.vue'
import TableView from '../examples/TableView.vue'
import FormView from '../examples/FormView.vue'

import LayoutTableView from '../examples/LayoutTableView.vue'

import LayoutFormView from '../examples/LayoutFormView.vue'
import LayoutFormTableView from '../examples/LayoutFormTableView.vue'
import LayoutFormTableListView from '../examples/LayoutFormTableListView.vue'

import LayoutTreeFormView from '../examples/LayoutTreeFormView.vue'
import PanelView from '../examples/PanelView.vue'
import StepView from '../examples/StepView.vue'
import DescView from '../examples/DescView.vue'

import TreeTableView from '../examples/TreeTableView.vue'
import CardView from '../examples/CardView.vue'
import TreeView from '../examples/TreeView.vue'

import CellView from '../examples/CellView.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/Content',
      name: 'Content',
      component: ContentView
    },
    {
      path: '/Input',
      name: 'Input',
      component: InputView
    },
    {
      path: '/Button',
      name: 'Button',
      component: ButtonView
    },
    {
      path: '/Table',
      name: 'Table',
      component: TableView
    },
    {
      path: '/form',
      name: 'form',
      component: FormView
    },
    {
      path: '/Tree',
      name: 'Tree',
      component: TreeView
    },
    {
      path: '/LayoutFormView',
      name: 'LayoutFormView',
      component: LayoutFormView
    },
    {
      path: '/LayoutFormTable',
      name: 'LayoutFormTable',
      component: LayoutFormTableView
    },
    {
      path: '/LayoutFormTableList',
      name: 'LayoutFormTableList',
      component: LayoutFormTableListView
    },
    {
      path: '/LayoutTreeForm',
      name: 'LayoutTreeForm',
      component: LayoutTreeFormView
    },
    {
      path: '/LayoutTable',
      name: 'LayoutTable',
      component: LayoutTableView
    },
    {
      path: '/TreeTable',
      name: 'TreeTable',
      component: TreeTableView
    },
    {
      path: '/panel',
      name: 'panel',
      component: PanelView
    },
    {
      path: '/card',
      name: 'card',
      component: CardView
    },
    {
      path: '/step',
      name: 'step',
      component: StepView
    },
    {
      path: '/desc',
      name: 'desc',
      component: DescView
    },
    {
      path: '/cell',
      name: 'cell',
      component: CellView
    },

  ]
})

export default router
