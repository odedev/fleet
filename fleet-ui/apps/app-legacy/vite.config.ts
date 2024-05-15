import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueJsx from '@vitejs/plugin-vue-jsx'
import legacy from '@vitejs/plugin-legacy'

// https://vitejs.dev/config/
export default defineConfig({
  // base: '', // Hash Router
  base: '/', // Web Router
  plugins: [
    vue(),
    vueJsx(),
    legacy({
      targets: ['Firefox >= 50', 'Chrome >= 50', 'Edge >= 80', 'ie >= 11'],
      additionalLegacyPolyfills: ['regenerator-runtime/runtime']
    }),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    port: 23521,
    host: '0.0.0.0',
    proxy: {
      "/api/": {
        target: "http://127.0.0.1:23510",
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api/, "/"),
      },
    }
  }
})
