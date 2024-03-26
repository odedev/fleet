import './assets/main.scss'

import { createApp } from 'vue'

import App from './App.vue'
import pinia from './stores'
import router from './router'

const app = createApp(App)

app.use(pinia)
app.use(router)


app.config.errorHandler = (err, instance, info) => {
  // 向追踪服务报告错误
  console.error(err, instance, info);
}

app.config.warnHandler = (msg, instance, trace) => {
  // `trace` is the component hierarchy trace
  console.warn(msg, instance, trace);

}

app.mount('#app')
