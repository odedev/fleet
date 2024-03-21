import { createRouter, createWebHistory } from "vue-router";
// import progress from "../core/progress";

import HomeView from "../views/HomeView.vue";
import DashboardView from "../views/DashboardView.vue";
import NotFoundView from "../views/NotFoundView.vue";
import SigninView from "../views/SigninView.vue";
import SignoutView from "../views/SignoutView.vue";
import SignupView from "../views/SignupView.vue";

import routes from "./routes.ts";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
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

    { path: '/Signin', name: 'Signin', component: SigninView },
    { path: '/Signout', name: 'Signout', component: SignoutView },
    { path: '/Signup', name: 'Signup', component: SignupView },

    // 将匹配所有内容并将其放在 `$route.params.pathMatch` 下
    // { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFoundView },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    }
  ]
})

export default router
