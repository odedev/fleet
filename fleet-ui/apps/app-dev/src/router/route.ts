import ButtonView from '../examples/BaseButtonView.vue'
import ContentView from '../examples/BaseContentView.vue'
import InputView from '../examples/BaseInputView.vue'
import CellView from '../examples/BaseCellView.vue'
import ItemView from '../examples/BaseItemView.vue'

import ListView from '../examples/BaseListView.vue'
import TreeView from '../examples/BaseTreeView.vue'
import FormView from '../examples/BaseFormView.vue'
import DescView from '../examples/BaseDescView.vue'
import CardView from '../examples/BaseCardView.vue'

import TableView from '../examples/BaseTableView.vue'
import TableConciseView from '../examples/BaseTableConciseView.vue'

import MarkdownView from '../examples/BaseMarkdownView.vue'
import CodeView from '../examples/BaseCodeView.vue'
// import RichTextView from '../examples/BaseRichTextView.vue'

import CalendarView from "@/examples/BaseCalendarView.vue";

import PanelView from '../examples/BasePanelView.vue'
import StepView from '../examples/BaseStepView.vue'

import ViewerMarkdownView from "../examples/ViewerMarkdownView.vue";
// import ViewerRichTextView from "../examples/ViewerRichTextView.vue";
import ViewerImageView from "../examples/ViewerImageView.vue";
import ViewerVideoView from "../examples/ViewerVideoView.vue";
import ViewerPdfView from "../examples/ViewerPdfView.vue";


import LayoutFormView from '../examples/LayoutFormView.vue'
import LayoutFormTreeView from '../examples/LayoutFormTreeView.vue'
import LayoutFormTableView from '../examples/LayoutFormTableView.vue'
import LayoutFormPanelView from '../examples/LayoutFormPanelView.vue'
import LayoutFormStepView from '../examples/LayoutFormStepView.vue'
import LayoutFormTableListView from '../examples/LayoutFormTableListView.vue'


import LayoutTableView from '../examples/LayoutTableView.vue'
import LayoutTableTreeView from '../examples/LayoutTableTreeView.vue'

const routes = [
  {
    path: '/Button',
    name: 'Button',
    component: ButtonView
  },
  {
    path: '/Content',
    name: 'Content',
    component: ContentView
  },
  {
    path: '/Input',
    name: 'Input',
    component: InputView
  },
  {
    path: '/Cell',
    name: 'Cell',
    component: CellView
  },
  {
    path: '/Item',
    name: 'Item',
    component: ItemView
  },
  {
    path: '/Table',
    name: 'Table',
    component: TableView
  },
  {
    path: '/TableConcise',
    name: 'TableConcise',
    component: TableConciseView
  },
  {
    path: '/Form',
    name: 'Form',
    component: FormView
  },
  {
    path: '/Tree',
    name: 'Tree',
    component: TreeView
  },
  {
    path: '/Card',
    name: 'Card',
    component: CardView
  },
  {
    path: '/List',
    name: 'List',
    component: ListView
  },
  {
    path: '/Desc',
    name: 'Desc',
    component: DescView
  },
  {
    path: '/Markdown',
    name: 'Markdown',
    component: MarkdownView
  },
  {
    path: '/Code',
    name: 'Code',
    component: CodeView
  },
  // {
  //   path: '/RichText',
  //   name: 'RichText',
  //   component: RichTextView
  // },
  {
    path: '/Calendar',
    name: 'Calendar',
    component: CalendarView
  },
  {
    path: '/Panel',
    name: 'Panel',
    component: PanelView
  },
  {
    path: '/Step',
    name: 'Step',
    component: StepView
  },


  {
    path: '/ViewerMarkdown',
    name: 'ViewerMarkdown',
    component: ViewerMarkdownView
  },
  // {
  //   path: '/ViewerRichText',
  //   name: 'ViewerRichText',
  //   component: ViewerRichTextView
  // },
  {
    path: '/ViewerImage',
    name: 'ViewerImage',
    component: ViewerImageView
  },
  {
    path: '/ViewerVideo',
    name: 'ViewerVideo',
    component: ViewerVideoView
  },
  {
    path: '/ViewerPdf',
    name: 'ViewerPdf',
    component: ViewerPdfView
  },


  {
    path: '/LayoutForm',
    name: 'LayoutForm',
    component: LayoutFormView
  },
  {
    path: '/LayoutFormTree',
    name: 'LayoutFormTree',
    component: LayoutFormTreeView
  },
  {
    path: '/LayoutFormTable',
    name: 'LayoutFormTable',
    component: LayoutFormTableView
  },
  {
    path: '/LayoutFormPanel',
    name: 'LayoutFormPanel',
    component: LayoutFormPanelView
  },


  {
    path: '/LayoutTable',
    name: 'LayoutTable',
    component: LayoutTableView
  },
  {
    path: '/LayoutTableTree',
    name: 'LayoutTableTree',
    component: LayoutTableTreeView
  },


]

export default routes;
