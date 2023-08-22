<template>
<header class="app-header h-16 max-h-16 bg-purple-500 text-white px-6 flex flex-row">
  <h1 class="w-32 h-full">
    <NuxtLink to="/">Fleet</NuxtLink>
  </h1>
  <menu class="h-full flex flex-row">
    <ul class=" flex flex-row">
      <li class="px-3">
        <NuxtLink to="/">欢迎</NuxtLink>
      </li>
      <li class="px-3">
        <NuxtLink to="/about">About</NuxtLink>
      </li>
    </ul>
  </menu>
</header>
</template>
<style lang="scss">
.app-header {
  height: 64px;
  max-height: 64px;
}
</style>
