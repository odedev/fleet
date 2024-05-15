// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  modules: [
    '@nuxt/ui',
    '@nuxt/image',
  ],
  // @nuxt/image Options
  // image: {
  // },
  devServer: {
    port: 23525,
    host: '0.0.0.0',
  },
  devtools: {
    enabled: true
  }
})
