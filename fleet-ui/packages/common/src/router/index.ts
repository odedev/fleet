import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import FormView from '../views/FormView.vue'
import FormTableView from '../views/FormTableView.vue'
import TableView from '../views/TableView.vue'
import PanelView from '../views/PanelView.vue'
import CardView from '../views/CardView.vue'
import StepView from '../views/StepView.vue'
import DescView from '../views/DescView.vue'
import CellView from '../views/CellView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/form',
      name: 'form',
      component: FormView
    },
    {
      path: '/form-table',
      name: 'formTable',
      component: FormTableView
    },
    {
      path: '/table',
      name: 'table',
      component: TableView
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
    }
  ]
})

export default router
