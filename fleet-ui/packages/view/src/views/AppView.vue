<script setup lang="ts">
import { RouterView } from 'vue-router';

</script>
<template>
  <div class="app">
    <RouterView v-slot="{ Component, route }">
      <Transition name="fade" mode="out-in" >
        <component :is="Component" :key="route.path"></component>
      </Transition>
    </RouterView>
  </div>
</template>
