import { fileURLToPath, URL } from 'node:url'
// import { createRequire } from 'node:module';
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueJsx from '@vitejs/plugin-vue-jsx'

// const require = createRequire( import.meta.url );

// https://vitejs.dev/config/
export default defineConfig({
  server: {
    port: 23530
  },
  plugins: [
    vue(),
    vueJsx(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  }
})
