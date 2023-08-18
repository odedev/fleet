<script lang="ts" setup>
import {computed, ref, onMounted, onUnmounted} from "vue";
import Player from 'xgplayer';
import 'xgplayer/dist/index.min.css';
import Controls from "xgplayer/es/plugins/controls";
import Play from "xgplayer/es/plugins/play";
import Fullscreen from "xgplayer/es/plugins/fullscreen";
import MiniScreen from "xgplayer/es/plugins/miniScreen";
import ScreenShot from "xgplayer/es/plugins/screenShot";
import Volume from "xgplayer/es/plugins/volume";
import Replay from "xgplayer/es/plugins/replay";
import Time from 'xgplayer/es/plugins/time';
import FlvPlugin from 'xgplayer-flv';


// 点播兼容到 IE11+
// 直播需要浏览器支持Media Source Extensions
// PC Web端支持直接播放mp4视频，播放HLS、FLV、MPEG-DASH需要浏览器支持Media Source Extensions
// iOS Web端支持直接播放mp4和HLS，不支持播放FLV、MPEG-DASH
// Android Web端支持直接播放mp4和HLS，播放FLV、MPEG-DASH需要浏览器支持Media Source Extensions
// 不同业务需求下兼容性要求可能降低，详见具体插件页面插件


const props = defineProps<{
  modelValue: any,
  poster?: any,
}>();

const el = ref<HTMLVideoElement>();

const value = computed<string>(() => props.modelValue);
const poster = computed<string>(() => props.poster || '');

let player: Player | null;

onMounted(() => {
  console.log(poster)
  player = new Player({
    el: el.value,
    url: value.value,
    poster: poster.value,
    // height: '100%',
    // width: '100%',
    fitVideoSize: 'fixWidth',
    videoInit: true,
    // screenShot: true,
    controls: true,
    presets: ['default'],
    // plugins: [
    //   Play,
    //   Controls,
    //   Fullscreen,
    //   MiniScreen,
    //   Volume,
    //   Time,
    //   ScreenShot,
    //   Replay,
    //   // FlvPlugin,
    // ],
  })
});

onUnmounted(() => {
  player?.destroy();
  player = null;
});

</script>

<template>
  <div class="viewer__video">
    <div ref="el"></div>
  </div>
</template>

<style lang="scss">
.viewer__video {
  width: 100%;
  height: 100%;
  overflow: auto;
  padding: 16px;
  padding: 0;

  .xgplayer {
    background-color: white;
  }

}
</style>
