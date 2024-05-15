<script setup lang="ts">
import { ref } from "vue";
import { HomeView } from "@fleet/view";
import menuList from '../data/menu';

const menus = ref<any[]>(menuList);

</script>

<template>
  <HomeView :menus="menus" ></HomeView>
</template>

<style lang="scss" scoped>

</style>
