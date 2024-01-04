import { defineConfig } from 'vitepress'

const nav = [
  { text: '首页', link: '/', activeMatch: '^/$' },
  // { text: '手册', link: '/manual/introduction', activeMatch: '^/manual/' },
  { text: '手册', link: '/manual/', activeMatch: '^/manual/' },
  { text: '参考', link: '/reference/', activeMatch: '^/reference/' },
  { text: '模块', link: '/module/', activeMatch: '^/module/' },
];


const sidebar = {
  '/manual/': [
    {
      text: '开始',
      collapsed: false,
      items: [
        { text: '介绍', link: '/manual/introduction' },
        { text: '概览', link: '/manual/overview' },
        { text: '指南', link: '/manual/guide' },
        { text: '依赖', link: '/manual/dependency' },
      ]
    },
    {
      text: '开发',
      collapsed: false,
      items: [
        { text: '开发', link: '/manual/develop' },
        { text: '环境', link: '/manual/environment' },
      ]
    },
    {
      text: '部署',
      collapsed: false,
      items: [
        { text: '安装', link: '/manual/install' },
        { text: '部署概览', link: '/manual/deploy' },
      ]
    },
  ],
  '/reference/': [
    {
      text: 'Backend',
      collapsed: false,
      items: [
        { text: 'api', link: '/reference/index' },
      ]
    },
    {
      text: 'Frontend',
      collapsed: false,
      items: [
        { text: 'theme', link: '/reference/theme' },
      ]
    },
    {
      text: 'API',
      collapsed: false,
      items: [
        { text: 'api', link: '/reference/api' },
      ]
    },
  ],
  '/module/': [
    {
      text: '核心模块',
      collapsed: false,
      items: [
        { text: '基础功能', link: '/module/core-base' },
        { text: '元数据', link: '/module/core-metadata' },
        { text: '系统资源', link: '/module/core-asset' },
        { text: '系统管理', link: '/module/core-system' },
        { text: '组织架构', link: '/module/core-org' },

      ]
    },
  ],
}

// https://vitepress.dev/reference/site-config
export default defineConfig({
  // site-level options
  mpa: true,
  lang: 'zh-CN',
  title: 'Fleet Doc',
  description: 'Fleet Doc.',
  base: '/',
  srcDir: './src',
  scrollOffset: 'header',
  lastUpdated: true,

  // https://vitepress.dev/reference/default-theme-config
  themeConfig: {
    // theme-level options
    nav: nav,
    sidebar: sidebar,
    docsDir: 'src',
    docsBranch: 'main',
    outDir: 'dist',
  },
  head: [
    [
      'link',
      {
        rel: 'shortcut icon',
        href: 'favicon.ico',
        type: 'image/x-icon'
      }
    ]
  ],
  markdown: {
    lineNumbers: false,
    toc: {
      includeLevel: [1, 2]
    },
  },
  vite: {
//    publicDir: 'resources'
  }
})
