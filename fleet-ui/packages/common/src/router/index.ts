import { createRouter, createWebHistory } from 'vue-router';
import progress from "../core/progress";

import HomeView from '../views/HomeView.vue'
import RedirectView from '../views/RedirectView.vue'
import NotFoundView from '../views/NotFoundView.vue'
import ComponentView from "../views/ComponentView.vue";

import ContentView from '../examples/BaseContentView.vue'
import InputView from '../examples/BaseInputView.vue'
import CellView from '../examples/BaseCellView.vue'
import ButtonView from '../examples/BaseButtonView.vue'
import TableView from '../examples/BaseTableView.vue'
import TableConciseView from '../examples/BaseTableConciseView.vue'

import FormView from '../examples/BaseFormView.vue'
import CardView from '../examples/BaseCardView.vue'
import TreeView from '../examples/BaseTreeView.vue'

import BaseCalendarView from "@/examples/BaseCalendarView.vue";

import LayoutTableView from '../examples/LayoutTableView.vue'

import LayoutFormView from '../examples/LayoutFormView.vue'
import LayoutFormTableView from '../examples/LayoutFormTableView.vue'
import LayoutFormTableListView from '../examples/LayoutFormTableListView.vue'

import LayoutTreeFormView from '../examples/LayoutTreeFormView.vue'
import PanelView from '../examples/PanelView.vue'
import StepView from '../examples/StepView.vue'
import DescView from '../examples/BaseDescView.vue'

import TreeTableView from '../examples/TreeTableView.vue'



import RichTextView from '../examples/RichTextView.vue'
import MarkdownView from '../examples/MarkdownView.vue'
import CodeView from '../examples/BaseCodeView.vue'

import ViewerMarkdownView from "../examples/ViewerMarkdownView.vue";
import ViewerRichTextView from "../examples/ViewerRichTextView.vue";
import ViewerImageView from "../examples/ViewerImageView.vue";
import ViewerVideoView from "../examples/ViewerVideoView.vue";


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },

    // 动态组件
    {
      path: '/Component',
      name: 'Component',
      component: ComponentView
    },
    // 重定向刷新
    {
      path: '/redirect/:path(.*)',
      name: 'Redirect',
      component: RedirectView,
      // children: [
      //   {
      //     path: '/redirect/:path(.*)',
      //     component: RedirectView
      //   }
      // ]
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
