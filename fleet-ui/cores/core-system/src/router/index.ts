import type { RouteRecordRaw } from "vue-router";

import MenuMainView from "../views/Menu/MenuMainView.vue";
import MenuListView from "../views/Menu/MenuListView.vue";
import MenuDetailView from "../views/Menu/MenuDetailView.vue";
import MenuEditView from "../views/Menu/MenuEditView.vue";

import RoleMainView from "../views/Role/RoleMainView.vue";
import RoleListView from "../views/Role/RoleListView.vue";
import RoleDetailView from "../views/Role/RoleDetailView.vue";
import RoleEditView from "../views/Role/RoleEditView.vue";

import UserMainView from "../views/User/UserMainView.vue";
import UserListView from "../views/User/UserListView.vue";
import UserDetailView from "../views/User/UserDetailView.vue";
import UserEditView from "../views/User/UserEditView.vue";

const routes: RouteRecordRaw[] = [
  { path: '/core/system/Menu/Main', name: 'MenuMain', component: MenuMainView },
  { path: '/core/system/Menu/List', name: 'MenuList', component: MenuListView },
  { path: '/core/system/Menu/Detail/:id?', name: 'MenuDetail', component: MenuDetailView, props: true },
  { path: '/core/system/Menu/Edit/:id?', name: 'MenuEdit', component: MenuEditView, props: true },

  { path: '/core/system/Role/Main', name: 'RoleMain', component: RoleMainView },
  { path: '/core/system/Role/List', name: 'RoleList', component: RoleListView },
  { path: '/core/system/Role/Detail/:id?', name: 'RoleDetail', component: RoleDetailView, props: true },
  { path: '/core/system/Role/Edit/:id?', name: 'RoleEdit', component: RoleEditView, props: true },

  { path: '/core/system/User/Main', name: 'UserMain', component: UserMainView },
  { path: '/core/system/User/List', name: 'UserList', component: UserListView },
  { path: '/core/system/User/Detail/:id?', name: 'UserDetail', component: UserDetailView, props: true },
  { path: '/core/system/User/Edit/:id?', name: 'UserEdit', component: UserEditView, props: true },
];

export default routes;
