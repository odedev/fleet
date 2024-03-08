# Develop

## MySQL init
```sql
-- 不区分大小写
CREATE DATABASE IF NOT EXISTS `fleet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 区分大小写
CREATE DATABASE IF NOT EXISTS `fleet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
```


## UI
基于 pnpm 的单仓库, `npm` 命令需用 `pnpm` 替代

### Nodejs
Nodejs 版本要求 >= v20.10.0

### 安装pnpm
```shell
corepack enable
## or
npm install -g pnpm
```

### 安装所有依赖
在 `fleet-ui` 根目录运行

```shell
pnpm install
```

### 更新所有依赖
在 `fleet-ui` 根目录运行

```shell
pnpm update -r
```

### 开发
在 `fleet-ui` 根目录运行所有应用

```shell
pnpm run dev
```

#### 运行单应用
进入到要运行的应用目录, 列如: `apps/app-dev`, 运行如下命令

```shell
pnpm run dev
```

### 构建
```shell
pnpm run build
```



```txt

dev.odes.fleet.develop.entity
dev.odes.fleet.develop.model
dev.odes.fleet.develop.mapper
dev.odes.fleet.develop.repository
dev.odes.fleet.develop.transform
dev.odes.fleet.develop.service
dev.odes.fleet.develop.controller
dev.odes.fleet.develop.enumeration

dev.odes.fleet.develop.dto
dev.odes.fleet.develop.constant

View
ViewModel
ViewMapper
ViewRepository
ViewTransform
ViewService
ViewController

ViewMapper.xml

metadata/model/View.sql
schema/ViewCreate.sql

ViewInsert.sql

TypeEnum


abstract
AbstractController
AbstractService
AbstractRepository
AbstractEntity
```
