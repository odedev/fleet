# guide

## Requirement

## Java
### JDK
版本要求 JDK 21


## UI
基于 pnpm 的单仓库, `npm` 命令需用 `pnpm` 替代

### Nodejs
Nodejs 版本要求 >= v20.10.0

### 安装 pnpm
```shell
corepack enable
## or
npm install -g pnpm
```

### 更新 pnpm
```shell
corepack prepare pnpm@9.0.6 --activate
```

## MySQL init
```sql
-- 不区分大小写
CREATE DATABASE IF NOT EXISTS `fleet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 区分大小写
CREATE DATABASE IF NOT EXISTS `fleet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
```
