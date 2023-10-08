<script lang="ts" setup>
import {computed} from "vue";

interface Props {
  color?: "primary" | "secondary" | "tertiary" | "neutral" | "error" | "warn" | "success" | "info" | undefined,
}

const props = defineProps<Props>();

const emit = defineEmits(['click']);

const color = computed(() => 'color--' + (props.color ?? 'normal'))

const handleClick = () => {
  emit('click');
};

</script>
<template>
  <div class="content" :class="color" @click="handleClick">
    <div class="content-value">
      <slot></slot>
    </div>
  </div>
</template>
<style lang="scss">

.content {
  height: 28px;
  height: 32px;
  //height: 40px;
  min-height: 28px;
  width: 336px;
  width: 272px;
  width: 100%;
  min-width: 32px;
  padding: 0 8px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  flex-direction: row;
  flex-wrap: nowrap;

  .content-value {
    font-size: 14px;
    line-height: 22px;
    overflow: hidden;
    white-space: nowrap;
    text-overflow:ellipsis;
    letter-spacing: normal;
  }
}
</style>
