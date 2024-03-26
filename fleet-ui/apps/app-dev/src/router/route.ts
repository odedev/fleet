import type { RouteRecordRaw } from "vue-router";

import BaseButtonView from '../views/Base/BaseButtonView.vue'
import BaseContentView from '../views/Base/BaseContentView.vue'
import BaseInputView from '../views/Base/BaseInputView.vue'
import BaseCellView from '../views/Base/BaseCellView.vue'
import BaseItemView from '../views/Base/BaseItemView.vue'
import BaseListView from '../views/Base/BaseListView.vue'
import BaseTreeView from '../views/Base/BaseTreeView.vue'
import BaseFormView from '../views/Base/BaseFormView.vue'
import BaseDescView from '../views/Base/BaseDescView.vue'
import BaseCardView from '../views/Base/BaseCardView.vue'
import BaseTableView from '../views/Base/BaseTableView.vue'
import BaseTableConciseView from '../views/Base/BaseTableConciseView.vue'
import BaseMarkdownView from '../views/Base/BaseMarkdownView.vue'
import BaseCodeView from '../views/Base/BaseCodeView.vue'
import BaseRichTextView from '../views/Base/BaseRichTextView.vue'
import BaseCalendarView from "@/views/Base/BaseCalendarView.vue";
import BasePanelView from '../views/Base/BasePanelView.vue'
import BaseStepView from '../views/Base/BaseStepView.vue'

import LayoutFormView from '../views/Layout/LayoutFormView.vue'
import LayoutFormTreeView from '../views/Layout/LayoutFormTreeView.vue'
import LayoutFormTableView from '../views/Layout/LayoutFormTableView.vue'
import LayoutFormPanelView from '../views/Layout/LayoutFormPanelView.vue'
import LayoutFormStepView from '../views/Layout/LayoutFormStepView.vue'
import LayoutFormTableListView from '../views/Layout/LayoutFormTableListView.vue'
import LayoutTableView from '../views/Layout/LayoutTableView.vue'
import LayoutTableTreeView from '../views/Layout/LayoutTableTreeView.vue'

import ViewerMarkdownView from "../views/Viewer/ViewerMarkdownView.vue";
import ViewerRichTextView from "../views/Viewer/ViewerRichTextView.vue";
import ViewerImageView from "../views/Viewer/ViewerImageView.vue";
import ViewerVideoView from "../views/Viewer/ViewerVideoView.vue";
import ViewerPdfView from "../views/Viewer/ViewerPdfView.vue";

const routes: RouteRecordRaw[] = [
  { path: '/Base/BaseButton', name: 'BaseButton', component: BaseButtonView },
  { path: '/Base/BaseContent', name: 'BaseContent', component: BaseContentView },
  { path: '/Base/BaseInput', name: 'BaseInput', component: BaseInputView },
  { path: '/Base/BaseCell', name: 'BaseCell', component: BaseCellView },
  { path: '/Base/BaseItem', name: 'BaseItem', component: BaseItemView },
  { path: '/Base/BaseList', name: 'BaseList', component: BaseListView },
  { path: '/Base/BaseTree', name: 'BaseTree', component: BaseTreeView },
  { path: '/Base/BaseForm', name: 'BaseForm', component: BaseFormView },
  { path: '/Base/BaseDesc', name: 'BaseDesc', component: BaseDescView },
  { path: '/Base/BaseCard', name: 'BaseCard', component: BaseCardView },
  { path: '/Base/BaseTable', name: 'BaseTable', component: BaseTableView },
  { path: '/Base/BaseTableConcise', name: 'BaseTableConcise', component: BaseTableConciseView },
  { path: '/Base/BaseMarkdown', name: 'BaseMarkdown', component: BaseMarkdownView },
  { path: '/Base/BaseCode', name: 'BaseCode', component: BaseCodeView },
  { path: '/Base/BaseRichText', name: 'BaseRichText', component: BaseRichTextView },
  { path: '/Base/BaseCalendar', name: 'BaseCalendar', component: BaseCalendarView },
  { path: '/Base/BasePanel', name: 'BasePanel', component: BasePanelView },
  { path: '/Base/BaseStep', name: 'BaseStep', component: BaseStepView },

  { path: '/Layout/LayoutForm', name: 'LayoutForm', component: LayoutFormView },
  { path: '/Layout/LayoutFormTree', name: 'LayoutFormTree', component: LayoutFormTreeView },
  { path: '/Layout/LayoutFormTable', name: 'LayoutFormTable', component: LayoutFormTableView },
  { path: '/Layout/LayoutFormPanel', name: 'LayoutFormPanel', component: LayoutFormPanelView },
  { path: '/Layout/LayoutTable', name: 'LayoutTable', component: LayoutTableView },
  { path: '/Layout/LayoutTableTree', name: 'LayoutTableTree', component: LayoutTableTreeView },

  { path: '/Viewer/ViewerMarkdown', name: 'ViewerMarkdown', component: ViewerMarkdownView },
  { path: '/Viewer/ViewerRichText', name: 'ViewerRichText', component: ViewerRichTextView },
  { path: '/Viewer/ViewerImage', name: 'ViewerImage', component: ViewerImageView },
  { path: '/Viewer/ViewerVideo', name: 'ViewerVideo', component: ViewerVideoView },
  { path: '/Viewer/ViewerPdf', name: 'ViewerPdf', component: ViewerPdfView },
]

export default routes;
