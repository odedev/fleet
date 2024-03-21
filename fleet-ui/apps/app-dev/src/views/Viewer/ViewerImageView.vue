<script setup lang="ts">
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlViewer, FlViewerImage,
} from "@fleet/component";

let value =  `https://p1-arco.byteimg.com/tos-cn-i-uwbnlip3yd/a8c8cdb109cb051163646151a4a5083b.png~tplv-uwbnlip3yd-webp.webp`

</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlViewer>
          <FlViewerImage v-model="value" />
        </FlViewer>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
