# Develop

## MySQL init
```sql
-- 不区分大小写
CREATE DATABASE IF NOT EXISTS `fleet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 区分大小写
CREATE DATABASE IF NOT EXISTS `fleet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
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
