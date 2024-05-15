<script setup lang="ts">
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlFormItem, FlEditorRichText, FlEditorMarkdown, FlViewer, FlViewerMarkdown, FlViewerRichText,
  FlTable, FlButton, FlSearch, FlAction
} from "@fleet/component";

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

<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlViewer>
          <FlViewerRichText v-model="value"/>
        </FlViewer>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
