
# system
php artisan make:model Menu -mfscr
php artisan make:observer MenuObserver --model=Menu
php artisan make:resource MenuResource
php artisan make:resource MenuCollection

php artisan make:model Role -mfscr
php artisan make:observer RoleObserver --model=Role
php artisan make:resource RoleResource
php artisan make:resource RoleCollection

php artisan make:model RoleMenu -mfscr
php artisan make:observer RoleMenuObserver --model=RoleMenu
php artisan make:resource RoleMenuResource
php artisan make:resource RoleMenuCollection

# php artisan make:model User -mfscr
# php artisan make:observer UserObserver --model=User
php artisan make:seeder UserSeeder
php artisan make:observer UserObserver --model=User
php artisan make:resource UserResource
php artisan make:resource UserCollection

php artisan make:model UserProfile -mfscr
php artisan make:observer UserProfileObserver --model=UserProfile
php artisan make:resource UserProfileResource
php artisan make:resource UserProfileCollection

php artisan make:model UserRole -mfscr
php artisan make:observer UserRoleObserver --model=UserRole
php artisan make:resource UserRoleResource
php artisan make:resource UserRoleCollection

sleep 10s

# org

php artisan make:model Department -mfscr
php artisan make:observer DepartmentObserver --model=Department
php artisan make:resource DepartmentResource
php artisan make:resource DepartmentCollection

php artisan make:model Org -mfscr
php artisan make:observer OrgObserver --model=Org
php artisan make:resource OrgResource
php artisan make:resource OrgCollection

php artisan make:model OrgRole -mfscr
php artisan make:observer OrgRoleObserver --model=OrgRole
php artisan make:resource OrgRoleResource
php artisan make:resource OrgRoleCollection

php artisan make:model OrgUser -mfscr
php artisan make:observer OrgUserObserver --model=OrgUser
php artisan make:resource OrgUserResource
php artisan make:resource OrgUserCollection

php artisan make:model Situation -mfscr
php artisan make:observer SituationObserver --model=Situation
php artisan make:resource SituationResource
php artisan make:resource SituationCollection

sleep 10s

# tenant
php artisan make:model Tenant -mfscr
php artisan make:observer TenantObserver --model=Tenant
php artisan make:resource TenantResource
php artisan make:resource TenantCollection

php artisan make:model TenantRole -mfscr
php artisan make:observer TenantRoleObserver --model=TenantRole
php artisan make:resource TenantRoleResource
php artisan make:resource TenantRoleCollection

php artisan make:model TenantUser -mfscr
php artisan make:observer TenantUserObserver --model=TenantUser
php artisan make:resource TenantUserResource
php artisan make:resource TenantUserCollection

sleep 10s

# asset
php artisan make:model ResourceFile -mfscr
php artisan make:observer ResourceFileObserver --model=ResourceFile
php artisan make:resource ResourceFileResource
php artisan make:resource ResourceFileCollection

sleep 10s

# develop
php artisan make:model App -mfscr
php artisan make:observer AppObserver --model=App
php artisan make:resource AppResource
php artisan make:resource AppCollection

php artisan make:model AppModule -mfscr
php artisan make:observer AppModuleObserver --model=AppModule
php artisan make:resource AppModuleResource
php artisan make:resource AppModuleCollection

php artisan make:model Enumeration -mfscr
php artisan make:observer EnumerationObserver --model=Enumeration
php artisan make:resource EnumerationResource
php artisan make:resource EnumerationCollection

php artisan make:model EnumerationValue -mfscr
php artisan make:observer EnumerationValueObserver --model=EnumerationValue
php artisan make:resource EnumerationValueResource
php artisan make:resource EnumerationValueCollection

php artisan make:model Model -mfscr
php artisan make:observer ModelObserver --model=Model
php artisan make:resource ModelResource
php artisan make:resource ModelCollection

php artisan make:model ModelField -mfscr
php artisan make:observer ModelFieldObserver --model=ModelField
php artisan make:resource ModelFieldResource
php artisan make:resource ModelFieldCollection

php artisan make:model Module -mfscr
php artisan make:observer ModuleObserver --model=Module
php artisan make:resource ModuleResource
php artisan make:resource ModuleCollection

php artisan make:model View -mfscr
php artisan make:observer ViewObserver --model=View
php artisan make:resource ViewResource
php artisan make:resource ViewCollection

php artisan make:model ViewBlock -mfscr
php artisan make:observer ViewBlockObserver --model=ViewBlock
php artisan make:resource ViewBlockResource
php artisan make:resource ViewBlockCollection


composer run-script post-install-cmd

