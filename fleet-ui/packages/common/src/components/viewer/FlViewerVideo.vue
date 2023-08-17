<script lang="ts" setup>
import {computed, ref, onMounted} from "vue";
import videojs from 'video.js';
import 'video.js/dist/video-js.css';
// import type Player from "video.js/dist/types/player";

import PresetPlayer, {SimplePlayer} from 'xgplayer/es'
import Play from "xgplayer/es/plugins/play";
import Controls from "xgplayer/es/plugins/controls";
import Player from 'xgplayer'
import 'xgplayer/es/index.css'

const props = defineProps<{
  modelValue: any,
}>();

const el = ref<HTMLVideoElement>();

const value = computed<string>(() => props.modelValue);

let player;
const options = {
  autoplay: false,
  controls: true,
};

onMounted(() => {
  // player = videojs(el.value || '', options, () => {
  //   player.log('onPlayerReady', this);
  // });
  player = new Player({
    el: el.value,
    url: value.value,
    // fitVideoSize: 'fixWidth',
    // width: 800,
    // height: 1200,
    videoInit: true,
    controls: true,
    plugins: [
      Controls,
      Play,
    ]
  })
})

</script>

<template>
  <div class="viewer__video">
    <div ref="el"></div>
<!--    <video></video>-->
  </div>
</template>

<style lang="scss">
.viewer__video {
  width: 100%;
  height: 100%;
  overflow: auto;
  padding: 16px;
  padding: 0;

}
</style>
