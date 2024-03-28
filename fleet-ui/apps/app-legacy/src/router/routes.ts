import type { RouteRecordRaw } from "vue-router";
import AboutView from "../views/AboutView.vue";
import DemoView from "../views/DemoView.vue";

const routes: RouteRecordRaw[] = [
  { path: '/About', name: 'About', component: AboutView },
  { path: '/Demo', name: 'Demo', component: DemoView },
];

export default routes;
