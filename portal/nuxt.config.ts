// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  css: [
    '@/assets/scss/main.scss',
  ],
  postcss: {
    plugins: {
      tailwindcss: {},
      autoprefixer: {},
    }
  },
  // build modules
  modules: [
    // '@vueuse/nuxt',
    // '@pinia/nuxt',
    '@element-plus/nuxt',
    '@nuxtjs/tailwindcss',
    // '@nuxtjs/color-mode'
  ],
  // imports: {
  //   dirs: ['./stores'],
  // },
  // pinia: {
  //   autoImports: ['defineStore', 'acceptHMRUpdate'],
  // },
  // elementPlus: { /** Options */ },
  // tailwindcss: {
  //   // Options
  // },
  devtools: { enabled: true },
  devServer: {
    port: 23507
  }
})
