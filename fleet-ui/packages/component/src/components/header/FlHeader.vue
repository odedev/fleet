<template>
  <header id="header" class="header">
    <FlLogo></FlLogo>
    <slot></slot>
    <FlProfile :name="name"></FlProfile>
  </header>
</template>

<script lang="ts" setup>
import {computed} from "vue";
import FlLogo from './FlLogo.vue'
import FlProfile from './FlProfile.vue'


interface Props {
  name?: string,
}

const props = defineProps<Props>();
const name = computed(() => props.name || '')

</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.header {
  --header-height: 64px;
  --header-height: 56px;
  width: 100%;
  height: var(--header-height);
  padding: 0;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--header-height);
  font-size: 16px;
  line-height: 1.5;
  color: #ffffff;
  background-color: #13c2c2;
  background-color: #69b1ff;
  background-color: #009688;
  background-color: #607D8B;
  background-color: #546E7A;
  @include background-color-primary();

  .header__action {
    width: 552px;
    height: 100%;
    flex-basis: 552px;
    flex-grow: 0;
    flex-shrink: 0;

    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    align-items: center;
  }
}

</style>
