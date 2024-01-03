<template>
  <nav class="nav">
    <div class="nav-breadcrumb">
      <IconHome />
      <Breadcrumb :style="{fontSize: `14px`}">
        <BreadcrumbItem>首页</BreadcrumbItem>
        <BreadcrumbItem>用户中心</BreadcrumbItem>
        <BreadcrumbItem>用户管理</BreadcrumbItem>
      </Breadcrumb>
    </div>
    <slot></slot>
    <div class="nav-action">
<!--      <Tooltip :mini="true" content="设置"><IconSettings /></Tooltip>-->
      <div class="nav-action__item" @click="onBackClick">
        <Tooltip :mini="true" content="返回"><IconArrowLeft /></Tooltip>
      </div>
      <div class="nav-action__item" @click="onRefreshClick">
        <Tooltip :mini="true" content="刷新"><IconRefresh /></Tooltip>
      </div>
      <div class="nav-action__item" @click="onHelpClick">
        <Tooltip :mini="true" content="文档"><IconQuestionCircle /></Tooltip>
      </div>
<!--      <Tooltip :mini="true" content="帮助"><IconQuestionCircle /></Tooltip>-->
    </div>

    <FlDrawer v-model="visible"  title="使用手册" @confirm="handleOk" @cancel="handleCancel">
      <FlViewerMarkdown v-model="value"/>
    </FlDrawer>
  </nav>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import {useRouter, useRoute} from "vue-router";
import {Breadcrumb, BreadcrumbItem, Tooltip} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/breadcrumb/style/index.css";
import "@arco-design/web-vue/es/tooltip/style/index.css"
import {IconHome, IconArrowLeft, IconQuestionCircle, IconRefresh, IconBook, IconFile, IconSettings} from "@arco-design/web-vue/es/icon";
import FlDrawer from "../drawer/FlDrawer.vue";
import FlViewerMarkdown from "../viewer/FlViewerMarkdown.vue";

const router = useRouter();
const route = useRoute();

const visible = ref(false);

const onBackClick = () => {
  router.back();
};

const onRefreshClick = () => {
  let path = route.path;
  // router.go(0);
  // router.push(path);
  // router.replace(path);
  // router.replace(`/redirect?path=${path}`);
  console.log(path);
}

const onHelpClick = () => {
  visible.value = true;
}

const handleOk = () => {
  visible.value = false;
};
const handleCancel = () => {
  visible.value = false;
}


let value = `
# fleet
跑得快的;快速的

## Markdown Basic Syntax

I just love **bold text**. Italicized text is the _cat's meow_. At the command prompt, type nano.

My favorite markdown editor is [ByteMD](https://github.com/bytedance/bytemd).

1. First item
2. Second item
3. Third item

> Dorothy followed her through many of the beautiful rooms in her castle.


## GFM Extended Syntax

Automatic URL Linking: https://github.com/bytedance/bytemd

~~The world is flat.~~ We now know that the world is round.

- [x] Write the press release
- [ ] Update the website
- [ ] Contact the media

| Syntax    | Description |
| --------- | ----------- |
| Header    | Title       |
| Paragraph | Text        |

## Footnotes

Here's a simple footnote,[^1] and here's a longer one.[^bignote]

[^1]: This is the first footnote.
[^bignote]: Here's one with multiple paragraphs and code.

    Indent paragraphs to include them in the footnote.

    Add as many paragraphs as you like.

## Gemoji

Thumbs up: :+1:, thumbs down: :-1:.

Families: :family_man_man_boy_boy:

Long flags: :wales:, :scotland:, :england:.

## Mermaid Diagrams

`;

value += "```mermaid \ngraph TD;\nA-->B;\nA-->C;\nB-->D;\nC-->D;\n```"


</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.nav {
  --nav-height: 40px;
  --nav-height: 28px;
  --nav-height: 32px;
  height: var(--nav-height);
  flex-basis: var(--nav-height);
  flex-grow: 0;
  flex-shrink: 0;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: flex-end;
  font-size: 14px;
  line-height: 1;
  padding: 0;
  //border-bottom: 1px solid #F5F5F5;
  background-color: #F8F8F8;
  @include background-color();

  .nav-breadcrumb {
    padding: 0 20px;
  }
  .nav-action {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: flex-end;
    font-size: 20px;
    padding: 0 20px;
    .arco-icon {
      margin-left: 8px;
    }
  }
  .nav-action__item {
    cursor: pointer;
  }
  .arco-breadcrumb-item {
    @include background-color();
  }
}
</style>
