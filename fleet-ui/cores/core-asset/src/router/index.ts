import type { RouteRecordRaw } from "vue-router";

import ResourceFileMainView from "../views/ResourceFile/ResourceFileMainView.vue";
import ResourceFileListView from "../views/ResourceFile/ResourceFileListView.vue";
import ResourceFileDetailView from "../views/ResourceFile/ResourceFileDetailView.vue";
import ResourceFileEditView from "../views/ResourceFile/ResourceFileEditView.vue";

const routes: RouteRecordRaw[] = [
  { path: '/core/asset/ResourceFile/Main', name: 'ResourceFileMain', component: ResourceFileMainView },
  { path: '/core/asset/ResourceFile/List', name: 'ResourceFileList', component: ResourceFileListView },
  { path: '/core/asset/ResourceFile/Detail/:id?', name: 'ResourceFileDetail', component: ResourceFileDetailView, props: true },
  { path: '/core/asset/ResourceFile/Edit/:id?', name: 'ResourceFileEdit', component: ResourceFileEditView, props: true },
];

export default routes;
