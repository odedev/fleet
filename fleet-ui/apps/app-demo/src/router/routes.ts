import type { RouteRecordRaw } from "vue-router";
import CodeView from '../views/CodeView.vue'
import MarkdownView from '../views/MarkdownView.vue'

const routes: RouteRecordRaw[] = [
  { path: '/Code', name: 'Code', component: CodeView },
  { path: '/Markdown', name: 'Markdown', component: MarkdownView },
]

export default routes;
