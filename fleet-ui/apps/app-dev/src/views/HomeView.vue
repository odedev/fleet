<script setup lang="ts">
import { ref } from "vue";
import { useRouter } from "vue-router";
import { HomeView } from "@fleet/view";
import { menus as menuList } from '../data/menu';

const router = useRouter();
let rout: any = null;

const menus = ref<any[]>(menuList);

const onMenuChange = (menu: any) => {
  console.log(menu)
  router.push({path: menu.path});
}
</script>

<template>
  <HomeView :menus="menus" @menu-change="onMenuChange"></HomeView>
</template>

<style lang="scss" scoped>

</style>
