<script setup lang="ts">
import { ref, computed, toValue } from 'vue';
import { RouterView, RouterLink, useRouter } from 'vue-router';
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
} from '@fleet/component';

// import menus from "../data/menu";

const router = useRouter();

const emit = defineEmits(['update:modelValue', 'menuChange']);

const tabs = ref<any[]>([]);
const currentMenu = ref<any>(null);

const menus = ref([
  {
    id: 'About',
    name: 'About',
    path: '/About'
  },
  {
    id: 'Demo',
    name: 'Demo',
    path: '/Demo'
  }
]);

const onMenuChange = (menu: any) => {
  let item = tabs.value.find(tab => tab.id === menu.id);
  if (item) {
    currentMenu.value = item;
  } else {
    tabs.value.push(menu);
    currentMenu.value = menu;
  }
  router.push(menu.path);
};

const onTabChange = (menu: any) => {
  let item = tabs.value.find(tab => tab.id === menu.id);
  if (item) {
    currentMenu.value = item;
  }
};

</script>

<template>
  <div class="wrapper">
    <FlHeader name="应用功能有限公司"></FlHeader>
    <FlBody>
      <FlMenu v-model="currentMenu" :menus="menus" @update:model-value="onMenuChange"></FlMenu>
      <FlMain>
        <FlTab v-model="currentMenu" v-model:tabs="tabs" @update:model-value="onTabChange"></FlTab>
        <FlNav>
          <RouterLink to="/Demo" >Demo</RouterLink>
        </FlNav>
        <div class="page">
          <RouterView v-slot="{ Component, route }">
            <template v-if="Component">
              <Transition name="fade" mode="out-in" >
                <KeepAlive>
                    <component :is="Component" :key="route.path"></component>
                </KeepAlive>
      <!--          <KeepAlive>-->
      <!--            <Suspense>-->
      <!--              onMounted: 其所有同步子组件都已经被挂载 (不包含异步组件或 <Suspense> 树内的组件)。-->
      <!--              <component :is="Component" :key="route.path"></component>-->
      <!--              <template #fallback>-->
      <!--                正在加载...-->
      <!--              </template>-->
      <!--            </Suspense>-->
      <!--          </KeepAlive>-->
              </Transition>
            </template>
          </RouterView>
        </div>
      </FlMain>
    </FlBody>
    <!-- <FlFooter /> -->
  </div>
</template>

<style lang="scss" scoped>
.wrapper {
  width: 100%;
  height: 100%;
  flex-grow: 1;
  flex-shrink: 1;
  flex-basis: auto;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
</style>
