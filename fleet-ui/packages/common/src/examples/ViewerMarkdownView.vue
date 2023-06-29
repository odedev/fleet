<template>
  <FlView>
    <FlViewMain>
      <!--      <FlViewHead>-->
      <!--        <FlAction>-->
      <!--          <FlButton>保存</FlButton>-->
      <!--          <FlButton>生成代码</FlButton>-->
      <!--        </FlAction>-->
      <!--      </FlViewHead>-->
      <FlViewBody>
        <FlBlock>
          <FlViewerMarkdown v-model="value"/>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlContent, FlContentText, FlContentNumber,
  FlFormItem, FlEditorRichText, FlEditorMarkdown, FlViewerMarkdown,
  FlTable, FlButton, FlSearch, FlAction
} from '../components'

const value = `
# fleet
跑得快的;快速的

## 参考
+ [Apache Velocity](https://velocity.apache.org/)
+ [MyBatis](https://mybatis.org/mybatis-3/index.html)
+ [MyBatis](https://github.com/mybatis/mybatis-3)
+ [vue](https://vuejs.org/)


## init
\`\`\`sql
CREATE DATABASE IF NOT EXISTS \`fleet\` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE IF NOT EXISTS \`fleet\` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
\`\`\`

\`\`\`text

dev.odes.fleet.develop.controller
dev.odes.fleet.develop.service
dev.odes.fleet.develop.repository
dev.odes.fleet.develop.mapper
dev.odes.fleet.develop.model
dev.odes.fleet.develop.entity
dev.odes.fleet.develop.enumeration

dev.odes.fleet.develop.dto

View
ViewModel
ViewMapper
ViewController
ViewRepository
ViewService
ViewTransform

ViewMapper.xml

view_create.sql

TypeEnum


abstract
AbstractController
AbstractService
AbstractRepository
AbstractEntity
\`\`\`


- [files icons](https://icons8.com/icon/set/files/color-glass)


`

</script>
<style>
.arco-card {
  margin-right: 16px;
  margin-bottom: 16px;
}
</style>
