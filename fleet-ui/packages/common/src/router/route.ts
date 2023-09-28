import ContentView from '../examples/BaseContentView.vue'
import InputView from '../examples/BaseInputView.vue'
import CellView from '../examples/BaseCellView.vue'
import ButtonView from '../examples/BaseButtonView.vue'
import TableView from '../examples/BaseTableView.vue'
import TableConciseView from '../examples/BaseTableConciseView.vue'

import FormView from '../examples/BaseFormView.vue'
import CardView from '../examples/BaseCardView.vue'
import TreeView from '../examples/BaseTreeView.vue'

import BaseCalendarView from "@/examples/BaseCalendarView.vue";

import LayoutTableView from '../examples/LayoutTableView.vue'

import LayoutFormView from '../examples/LayoutFormView.vue'
import LayoutFormTableView from '../examples/LayoutFormTableView.vue'
import LayoutFormTableListView from '../examples/LayoutFormTableListView.vue'

import LayoutTreeFormView from '../examples/LayoutTreeFormView.vue'
import PanelView from '../examples/PanelView.vue'
import StepView from '../examples/StepView.vue'
import DescView from '../examples/BaseDescView.vue'

import TreeTableView from '../examples/TreeTableView.vue'


import RichTextView from '../examples/RichTextView.vue'
import MarkdownView from '../examples/MarkdownView.vue'
import CodeView from '../examples/BaseCodeView.vue'

import ViewerMarkdownView from "../examples/ViewerMarkdownView.vue";
import ViewerRichTextView from "../examples/ViewerRichTextView.vue";
import ViewerImageView from "../examples/ViewerImageView.vue";
import ViewerVideoView from "../examples/ViewerVideoView.vue";

const routes = [
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
    path: '/Button',
    name: 'Button',
    component: ButtonView
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
    path: '/form',
    name: 'form',
    component: FormView
  },
  {
    path: '/Tree',
    name: 'Tree',
    component: TreeView
  },
  {
    path: '/RichText',
    name: 'RichText',
    component: RichTextView
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
  {
    path: '/Calendar',
    name: 'Calendar',
    component: BaseCalendarView
  },
  {
    path: '/LayoutFormView',
    name: 'LayoutFormView',
    component: LayoutFormView
  },
  {
    path: '/LayoutFormTable',
    name: 'LayoutFormTable',
    component: LayoutFormTableView
  },
  {
    path: '/LayoutFormTableList',
    name: 'LayoutFormTableList',
    component: LayoutFormTableListView
  },
  {
    path: '/LayoutTreeForm',
    name: 'LayoutTreeForm',
    component: LayoutTreeFormView
  },
  {
    path: '/LayoutTable',
    name: 'LayoutTable',
    component: LayoutTableView
  },
  {
    path: '/TreeTable',
    name: 'TreeTable',
    component: TreeTableView
  },
  {
    path: '/panel',
    name: 'panel',
    component: PanelView
  },
  {
    path: '/card',
    name: 'card',
    component: CardView
  },
  {
    path: '/step',
    name: 'step',
    component: StepView
  },
  {
    path: '/desc',
    name: 'desc',
    component: DescView
  },
  {
    path: '/cell',
    name: 'cell',
    component: CellView
  },
  {
    path: '/ViewerMarkdown',
    name: 'ViewerMarkdown',
    component: ViewerMarkdownView
  },
  {
    path: '/ViewerRichText',
    name: 'ViewerRichText',
    component: ViewerRichTextView
  },
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
]

export default routes;
