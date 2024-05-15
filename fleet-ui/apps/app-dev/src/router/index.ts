import { createRouter, createWebHistory, createWebHashHistory } from 'vue-router';
import { progress }  from "@fleet/base";

import HomeView from '../views/HomeView.vue'
import DashboardView from "../views/DashboardView.vue";
import NotFoundView from "../views/NotFoundView.vue";

import routes from './route';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  // history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
      children: [
        {
          path: '',
          name: 'Dashboard',
          component: DashboardView
        },

        ...routes,

        { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFoundView },
      ]
    },

    // // 动态组件
    // {
    //     path: '/Component',
    //     name: 'Component',
    //     component: ComponentView
    // },
    // // 重定向刷新
    // {
    //     path: '/redirect/:path(.*)',
    //     name: 'Redirect',
    //     component: RedirectView,
    //     // children: [
    //     //   {
    //     //     path: '/redirect/:path(.*)',
    //     //     component: RedirectView
    //     //   }
    //     // ]
    //     // redirect: to => {
    //     //   // the function receives the target route as the argument
    //     //   // we return a redirect path/location here.
    //     //   return { path: to.query.path, query: {} }
    //     // },
    // },
    // 将匹配所有内容并将其放在 `$route.params.pathMatch` 下
    // { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFoundView },
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
  return true;
});

export default router
