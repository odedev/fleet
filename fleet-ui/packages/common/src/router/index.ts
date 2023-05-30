import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

import ContentView from '../examples/ContentView.vue'
import InputView from '../examples/InputView.vue'
import ButtonView from '../examples/ButtonView.vue'
import TableView from '../examples/TableView.vue'
import FormView from '../examples/FormView.vue'

import LayoutTableView from '../examples/LayoutTableView.vue'

import FormTableView from '../examples/FormTableView.vue'
import TreeFormView from '../examples/TreeFormView.vue'
import PanelView from '../examples/PanelView.vue'
import StepView from '../examples/StepView.vue'
import DescView from '../examples/DescView.vue'

import TreeTableView from '../examples/TreeTableView.vue'
import CardView from '../examples/CardView.vue'

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
      path: '/FormTable',
      name: 'FormTable',
      component: FormTableView
    },
    {
      path: '/TreeForm',
      name: 'TreeForm',
      component: TreeFormView
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
