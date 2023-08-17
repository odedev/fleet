<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlViewer>
          <FlViewerVideo v-model="value" />
        </FlViewer>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox,
  FlViewer, FlViewerMarkdown, FlViewerRichText, FlViewerImage, FlViewerVideo,
} from '../components'

let value =  `http://lf9-cdn-tos.bytecdntp.com/cdn/expire-1-M/byted-player-videos/1.0.0/xgplayer-demo-720p.mp4`

</script>
<style>

</style>
