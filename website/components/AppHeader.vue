<template>
<header class="h-16 max-h-16 bg-white text-gray-900">
  <Container class="h-full">
    <nav class="w-full h-full flex flex-row items-center justify-between" aria-label="Global">
      <NuxtLink class="w-64 h-full text-purple-700 text-2xl" to="/">
        <h1 class="w-64 h-full flex flex-row items-center justify-center">
          Fleet
        </h1>
      </NuxtLink>
      <menu class="w-full h-full flex flex-row px-6">
        <ul class=" flex flex-row items-center">
          <li class="px-4 py-2 rounded-md hover:text-purple-500 ">
            <NuxtLink to="/">首页</NuxtLink>
          </li>
          <li class="px-4 py-2 rounded-md hover:text-purple-500">
            <NuxtLink to="/product">产品</NuxtLink>
          </li>
          <li class="px-4 py-2 rounded-md hover:text-purple-500">
            <NuxtLink to="/about">关于</NuxtLink>
          </li>
          <li class="px-4 py-2 rounded-md hover:text-purple-500">
            <a href="https://github.com/odedev/fleet" target="_blank">GitHub</a>
          </li>
        </ul>
      </menu>
      <div class="w-64 h-full">

      </div>
    </nav>
  </Container>
</header>
</template>
<style lang="scss">
.app-header {
  height: 64px;
  max-height: 64px;
}
</style>
