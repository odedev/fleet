import { createRouter, createWebHistory } from 'vue-router';
import progress from "../core/progress";

import HomeView from '../views/HomeView.vue'
import RedirectView from '../views/RedirectView.vue'
import NotFoundView from '../views/NotFoundView.vue'
import ComponentView from "../views/ComponentView.vue";

import ContentView from '../examples/ContentView.vue'
import InputView from '../examples/InputView.vue'
import ButtonView from '../examples/ButtonView.vue'
import TableView from '../examples/TableView.vue'
import TableConciseView from '../examples/TableConciseView.vue'

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
import RichTextView from '../examples/RichTextView.vue'
import MarkdownView from '../examples/MarkdownView.vue'
import CodeView from '../examples/CodeView.vue'

import ViewerMarkdownView from "../examples/ViewerMarkdownView.vue";


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
      path: '/TableConcise',
      name: 'TableConcise',
      component: TableConciseView
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
      path: '/RichText',
      name: 'RichText',
      component: RichTextView
    },
    {
      path: '/Markdown',
      name: 'Markdown',
      component: MarkdownView
    },
    {
      path: '/Code',
      name: 'Code',
      component: CodeView
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
    {
      path: '/ViewerMarkdown',
      name: 'ViewerMarkdown',
      component: ViewerMarkdownView
    },

    // 动态组件
    {
      path: '/Component',
      name: 'Component',
      component: ComponentView
    },
    // 重定向刷新
    {
      path: '/redirect',
      name: 'Redirect',
      component: RedirectView,
      // redirect: to => {
      //   // the function receives the target route as the argument
      //   // we return a redirect path/location here.
      //   return { path: to.query.path, query: {} }
      // },
    },
    // 将匹配所有内容并将其放在 `$route.params.pathMatch` 下
    {
      path: '/:pathMatch(.*)*',
      name: 'NotFound',
      component: NotFoundView
    },
  ]
});

router.beforeEach((to, from) => {
  progress.start();
  // ...
  // 返回 false 以取消导航
  return true;
});

router.afterEach((to, from) => {
  progress.done();
});

export default router
