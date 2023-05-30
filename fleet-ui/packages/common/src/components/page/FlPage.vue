<template>
  <div class="page">
    <RouterView v-slot="{ Component, route }">
      <template v-if="Component">
        <Transition mode="out-in" >
          <KeepAlive>
            <Suspense>
              <!-- 主要内容 -->
              <component :is="Component" :key="route.path"></component>

              <!-- 加载中状态 -->
              <template #fallback>
                正在加载...
              </template>
            </Suspense>
          </KeepAlive>
        </Transition>
      </template>
    </RouterView>
  </div>
</template>
<script setup>
import {RouterView} from 'vue-router';

</script>
<style lang="scss">
.page {
  height: 100%;
  width: 100%;
  background-color: #F8F8F8;
  overflow: hidden;
  flex-basis: auto;
  flex-grow: 1;
  flex-shrink: 1;
  padding: 16px;
  padding: 20px;

  // display: flex;
  // flex-direction: row;
  // justify-content: flex-start;

  .v-enter-active,
  .v-leave-active {
    transition: opacity 0.5s ease;
  }

  .v-enter-from,
  .v-leave-to {
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
}
</style>
