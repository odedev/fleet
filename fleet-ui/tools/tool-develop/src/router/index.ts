import type { RouteRecordRaw } from "vue-router";

import ModuleMainView from "../views/Module/ModuleMainView.vue";
import ModuleListView from "../views/Module/ModuleListView.vue";
import ModuleDetailView from "../views/Module/ModuleDetailView.vue";
import ModuleEditView from "../views/Module/ModuleEditView.vue";

import AppMainView from "../views/App/AppMainView.vue";
import AppListView from "../views/App/AppListView.vue";
import AppDetailView from "../views/App/AppDetailView.vue";
import AppEditView from "../views/App/AppEditView.vue";

const routes: RouteRecordRaw[] = [
  { path: '/tool/develop/Module/Main', name: 'ModuleMain', component: ModuleMainView },
  { path: '/tool/develop/Module/List', name: 'ModuleList', component: ModuleListView },
  { path: '/tool/develop/Module/Detail/:id?', name: 'ModuleDetail', component: ModuleDetailView, props: true },
  { path: '/tool/develop/Module/Edit/:id?', name: 'ModuleEdit', component: ModuleEditView, props: true },

  { path: '/tool/develop/App/Main', name: 'AppMain', component: AppMainView },
  { path: '/tool/develop/App/List', name: 'AppList', component: AppListView },
  { path: '/tool/develop/App/Detail/:id?', name: 'AppDetail', component: AppDetailView, props: true },
  { path: '/tool/develop/App/Edit/:id?', name: 'AppEdit', component: AppEditView, props: true },
];

export default routes;
