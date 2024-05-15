import { createRouter, createWebHistory } from "vue-router";
import { progress } from "@fleet/base";

import HomeView from "../views/HomeView.vue";
import DashboardView from "../views/DashboardView.vue";
import NotFoundView from "../views/NotFoundView.vue";
import SigninView from "../views/SigninView.vue";
import SignoutView from "../views/SignoutView.vue";
import SignupView from "../views/SignupView.vue";

import routes from "./routes";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
      children: [
        { path: '', name: 'Dashboard', component: DashboardView },

        ...routes,

        { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFoundView },
      ]
    },

    { path: '/Signin', name: 'Signin', component: SigninView },
    { path: '/Signout', name: 'Signout', component: SignoutView },
    { path: '/Signup', name: 'Signup', component: SignupView },

    // 将匹配所有内容并将其放在 `$route.params.pathMatch` 下
    // { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFoundView },

  ]
})

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
