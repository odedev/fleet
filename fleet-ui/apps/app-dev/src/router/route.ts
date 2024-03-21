import ButtonView from '../views/BaseButtonView.vue'
import ContentView from '../views/BaseContentView.vue'
import InputView from '../views/BaseInputView.vue'
import CellView from '../views/BaseCellView.vue'
import ItemView from '../views/BaseItemView.vue'

import ListView from '../views/BaseListView.vue'
import TreeView from '../views/BaseTreeView.vue'
import FormView from '../views/BaseFormView.vue'
import DescView from '../views/BaseDescView.vue'
import CardView from '../views/BaseCardView.vue'

import TableView from '../views/BaseTableView.vue'
import TableConciseView from '../views/BaseTableConciseView.vue'

import MarkdownView from '../views/BaseMarkdownView.vue'
import CodeView from '../views/BaseCodeView.vue'
// import RichTextView from '../views/BaseRichTextView.vue'

import CalendarView from "@/views/BaseCalendarView.vue";

import PanelView from '../views/BasePanelView.vue'
import StepView from '../views/BaseStepView.vue'

import ViewerMarkdownView from "../views/ViewerMarkdownView.vue";
// import ViewerRichTextView from "../views/ViewerRichTextView.vue";
import ViewerImageView from "../views/ViewerImageView.vue";
import ViewerVideoView from "../views/ViewerVideoView.vue";
import ViewerPdfView from "../views/ViewerPdfView.vue";


import LayoutFormView from '../views/LayoutFormView.vue'
import LayoutFormTreeView from '../views/LayoutFormTreeView.vue'
import LayoutFormTableView from '../views/LayoutFormTableView.vue'
import LayoutFormPanelView from '../views/LayoutFormPanelView.vue'
import LayoutFormStepView from '../views/LayoutFormStepView.vue'
import LayoutFormTableListView from '../views/LayoutFormTableListView.vue'


import LayoutTableView from '../views/LayoutTableView.vue'
import LayoutTableTreeView from '../views/LayoutTableTreeView.vue'

const routes = [
  { path: '/Button', name: 'Button', component: ButtonView },
  { path: '/Content', name: 'Content', component: ContentView },
  { path: '/Input', name: 'Input', component: InputView },
  { path: '/Cell', name: 'Cell', component: CellView },
  { path: '/Item', name: 'Item', component: ItemView },
  { path: '/Table', name: 'Table', component: TableView },
  { path: '/TableConcise', name: 'TableConcise', component: TableConciseView },
  { path: '/Form', name: 'Form', component: FormView },
  { path: '/Tree', name: 'Tree', component: TreeView },
  { path: '/Card', name: 'Card', component: CardView },
  { path: '/List', name: 'List', component: ListView },
  { path: '/Desc', name: 'Desc', component: DescView },
  { path: '/Markdown', name: 'Markdown', component: MarkdownView },
  { path: '/Code', name: 'Code', component: CodeView },
  // { path: '/RichText', name: 'RichText', component: RichTextView },
  { path: '/Calendar', name: 'Calendar', component: CalendarView },
  { path: '/Panel', name: 'Panel', component: PanelView },
  { path: '/Step', name: 'Step', component: StepView },
  { path: '/ViewerMarkdown', name: 'ViewerMarkdown', component: ViewerMarkdownView },
  // { path: '/ViewerRichText', name: 'ViewerRichText', component: ViewerRichTextView },
  { path: '/ViewerImage', name: 'ViewerImage', component: ViewerImageView },
  { path: '/ViewerVideo', name: 'ViewerVideo', component: ViewerVideoView },
  { path: '/ViewerPdf', name: 'ViewerPdf', component: ViewerPdfView },
  { path: '/LayoutForm', name: 'LayoutForm', component: LayoutFormView },
  { path: '/LayoutFormTree', name: 'LayoutFormTree', component: LayoutFormTreeView },
  { path: '/LayoutFormTable', name: 'LayoutFormTable', component: LayoutFormTableView },
  { path: '/LayoutFormPanel', name: 'LayoutFormPanel', component: LayoutFormPanelView },
  { path: '/LayoutTable', name: 'LayoutTable', component: LayoutTableView },
  { path: '/LayoutTableTree', name: 'LayoutTableTree', component: LayoutTableTreeView },
]

export default routes;
