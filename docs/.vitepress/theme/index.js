import DefaultTheme from 'vitepress/theme'
import './custom.css'

/** @type {import('vitepress').Theme} */
export default {
  extends: DefaultTheme,
  enhanceApp(ctx) {
    // register your custom global components
    // ctx.app.component('MyGlobalComponent' /* ... */)
  }
}
