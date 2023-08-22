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
    // '@nuxtjs/color-mode'
  ],
  devtools: { enabled: true },
  devServer: {
    port: 23507
  }
})
