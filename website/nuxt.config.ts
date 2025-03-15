import tailwindcss from "@tailwindcss/vite";

// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  compatibilityDate: '2024-11-01',
  app: {
    // baseURL: '/',
    head: {
      title: 'Fleet',
      meta: [
        {
          charset: 'utf-8'
        },
        {
          name: 'viewport',
          content: 'width=device-width, initial-scale=1'
        },
      ],
    }
  },
  css: [
    '@/assets/css/main.css',
    '@/assets/scss/main.scss',
  ],
  // build modules
  modules: [
    '@nuxt/image',
    // '@nuxt/ui',
    // '@vueuse/nuxt',
    // '@pinia/nuxt',
    // '@element-plus/nuxt',
    // '@nuxtjs/tailwindcss',
    // '@nuxtjs/color-mode'
  ],
  // imports: {
  //   dirs: ['./stores'],
  // },
  // pinia: {
  //   autoImports: ['defineStore', 'acceptHMRUpdate'],
  // },
  // elementPlus: { /** Options */ },
  postcss: {
    plugins: {
      autoprefixer: {},
    }
  },
  vite: {
    plugins: [
      tailwindcss(),
    ],
  },
  devServer: {
    port: 23550,
    host: '0.0.0.0',
  },
  devtools: {
    enabled: true
  },
})
