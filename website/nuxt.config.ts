// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  app: {
    // baseURL: '/',
    head: {
      title: 'Fleet',
    }
  },
  css: [
    '@/assets/scss/main.scss',
  ],
  postcss: {
    plugins: {
      autoprefixer: {},
      '@tailwindcss/postcss': {},
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
    port: 23550,
    host: '0.0.0.0',
  }
})
