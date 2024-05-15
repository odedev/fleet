<script setup lang="ts">
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlViewer, FlViewerVideo,
} from "@fleet/component";

let value =  `http://lf9-cdn-tos.bytecdntp.com/cdn/expire-1-M/byted-player-videos/1.0.0/xgplayer-demo-720p.mp4`
let poster =  `//lf9-cdn-tos.bytecdntp.com/cdn/expire-1-M/byted-player-videos/1.0.0/poster.jpg`

</script>

<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlViewer>
          <FlViewerVideo v-model="value" :poster="poster"/>
        </FlViewer>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>

<style>

</style>
