const nav = [
  {
    text: '手册',
    link: '/manual/introduction',
    activeMatch: '^/manual/'
  },
  {
    text: 'API',
    link: '/api/',
    activeMatch: '^/api/'
  },
  {
    text: '模块',
    link: '/module/',
    activeMatch: '^/module/'
  },
]


const sidebar = {
  '/manual/': [
    {
      text: '开始',
      collapsed: false,
      items: [
        { text: '介绍', link: '/manual/introduction' },
        { text: '概览', link: '/manual/overview' },
        { text: '指南', link: '/manual/guide' },
      ]
    },
    {
      text: '开发工具',
      collapsed: false,
      items: [
        { text: 'DEV', link: '/manual/dev' },
      ]
    },
    {
      text: '部署',
      collapsed: false,
      items: [
        { text: '端口', link: '/manual/port' },
        { text: '安装', link: '/manual/install' },
      ]
    },
  ],
  '/api/': [
    {
      text: 'API',
      collapsed: false,
      items: [
        { text: 'api', link: '/api/index' },
      ]
    },
  ],
  '/module/': [
    {
      text: '核心模块',
      collapsed: false,
      items: [
        { text: '用户管理', link: '/module/user' },
        { text: '系统管理', link: '/module/system' },
      ]
    },
  ],
}

export default {
  // site-level options
  title: 'Fleet Doc',
  description: 'Fleet Doc.',
  lang: 'zh-CN',
  srcDir: './src',
  scrollOffset: 'header',
  themeConfig: {
    // theme-level options
    nav,
    sidebar,
    docsDir: 'src',
    outDir: 'dist',
  }
}
