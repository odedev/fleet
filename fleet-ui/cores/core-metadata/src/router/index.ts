import type { RouteRecordRaw } from "vue-router";

import ModelMainView from "../views/Model/ModelMainView.vue";
import ModelListView from "../views/Model/ModelListView.vue";
import ModelDetailView from "../views/Model/ModelDetailView.vue";
import ModelEditView from "../views/Model/ModelEditView.vue";

import EnumerationMainView from "../views/Enumeration/EnumerationMainView.vue";
import EnumerationListView from "../views/Enumeration/EnumerationListView.vue";
import EnumerationDetailView from "../views/Enumeration/EnumerationDetailView.vue";
import EnumerationEditView from "../views/Enumeration/EnumerationEditView.vue";

const routes: RouteRecordRaw[] = [
  { path: '/core/metadata/Model/Main', name: 'ModelMain', component: ModelMainView },
  { path: '/core/metadata/Model/List', name: 'ModelList', component: ModelListView },
  { path: '/core/metadata/Model/Detail/:id?', name: 'ModelDetail', component: ModelDetailView, props: true },
  { path: '/core/metadata/Model/Edit/:id?', name: 'ModelEdit', component: ModelEditView, props: true },

  { path: '/core/metadata/Enumeration/Main', name: 'EnumerationMain', component: EnumerationMainView },
  { path: '/core/metadata/Enumeration/List', name: 'EnumerationList', component: EnumerationListView },
  { path: '/core/metadata/Enumeration/Detail/:id?', name: 'EnumerationDetail', component: EnumerationDetailView, props: true },
  { path: '/core/metadata/Enumeration/Edit/:id?', name: 'EnumerationEdit', component: EnumerationEditView, props: true },
];

export default routes;
