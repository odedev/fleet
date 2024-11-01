# Develop



## UI

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

### 检查过期的所有依赖
在 `fleet-ui` 根目录运行

```shell
pnpm outdated -r
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

dev.osmanthus.fleet.develop.entity
dev.osmanthus.fleet.develop.model
dev.osmanthus.fleet.develop.mapper
dev.osmanthus.fleet.develop.repository
dev.osmanthus.fleet.develop.transform
dev.osmanthus.fleet.develop.service
dev.osmanthus.fleet.develop.controller
dev.osmanthus.fleet.develop.enumeration

dev.osmanthus.fleet.develop.dto
dev.osmanthus.fleet.develop.constant

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

```
Role
RoleModel
RoleMapper
RoleRepository
RoleTransform
RoleService
RoleController

RoleMapper.xml

metadata/model/Role.sql
schema/RoleCreate.sql

RoleInsert.sql
```

```txt
BLOB, TEXT, GEOMETRY or JSON column 'Texts' can't have a default value ''
```
