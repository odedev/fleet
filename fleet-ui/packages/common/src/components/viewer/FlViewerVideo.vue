<script lang="ts" setup>
import {computed, ref, onMounted} from "vue";
import videojs from 'video.js';
import 'video.js/dist/video-js.css';
import type Player from "video.js/dist/types/player";

const props = defineProps<{
  modelValue: any,
}>();

const el = ref<Element>();

const value = computed<string>(() => props.modelValue);

let player: Player;
const options = {
  autoplay: false,
  controls: true,
};

onMounted(() => {
  player = videojs(el?.value || '', options, () => {
    player.log('onPlayerReady', this);
  });
})

</script>

<template>
  <div class="viewer__video">
    <video ref="el" class="video-js"></video>
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
