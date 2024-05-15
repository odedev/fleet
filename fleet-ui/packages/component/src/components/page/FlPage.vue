<script setup lang="ts">
import {RouterView} from 'vue-router';

</script>
<template>
  <div class="page">
    <RouterView v-slot="{ Component, route }">
      <template v-if="Component">
        <Transition name="fade" mode="out-in" >
          <KeepAlive>
            <component :is="Component" :key="route.path" />
          </KeepAlive>
<!--          <KeepAlive>-->
<!--            <Suspense>-->
<!--              onMounted: 其所有同步子组件都已经被挂载 (不包含异步组件或 <Suspense> 树内的组件)。-->
<!--              <component :is="Component" :key="route.path" />-->
<!--              <template #fallback>-->
<!--                正在加载...-->
<!--              </template>-->
<!--            </Suspense>-->
<!--          </KeepAlive>-->
        </Transition>
      </template>
    </RouterView>
  </div>
</template>

<style lang="scss">
@use "../../assets/mixin" as *;

.page {
  height: 100%;
  width: 100%;
  overflow: hidden;
  flex-basis: auto;
  flex-grow: 1;
  flex-shrink: 1;
  padding: 16px;
  padding: 20px;
  background-color: #F8F8F8;
  @include background-color();
  // display: flex;
  // flex-direction: row;
  // justify-content: flex-start;

  .v-enter-active,
  .v-leave-active {
    transition: opacity 0.3s ease;
  }

  .v-enter-from,
  .v-leave-to {
    opacity: 0;
  }

  .fade-enter-active,
  .fade-leave-active {
    transition: opacity 0.3s ease;
  }

  .fade-enter-from,
  .fade-leave-to {
    opacity: 0;
  }

  .slide-fade-enter-active {
    transition: all 0.3s ease-out;
  }

  .slide-fade-leave-active {
    transition: all 0.6s cubic-bezier(1, 0.5, 0.8, 1);
  }

  .slide-fade-enter-from,
  .slide-fade-leave-to {
    transform: translateX(20px);
    opacity: 0;
  }

  .bounce-enter-active {
    animation: bounce-in 0.5s;
  }
  .bounce-leave-active {
    animation: bounce-in 0.5s reverse;
  }
  @keyframes bounce-in {
    0% {
      transform: scale(0);
    }
    50% {
      transform: scale(0.4);
    }
    100% {
      transform: scale(1);
    }
  }
}
</style>
