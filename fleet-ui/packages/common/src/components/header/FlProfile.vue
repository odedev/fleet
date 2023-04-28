<template>
<div class="profile">
  <div class="title">管理员</div>
  <Dropdown class="profile-dropdown" trigger="hover">
    <Avatar :style="{ backgroundColor: '#00d0b6' }">Admin</Avatar>
    <template #content>
      <Dgroup>
        <Doption>
          <template #icon>
            <IconRelation />
          </template>
          <template #default>用户角色</template>
        </Doption>
        <Doption>
          <template #icon>
            <IconUserGroup />
          </template>
          <template #default>组织架构</template>
        </Doption>
      </Dgroup>
      <Dgroup>
        <Doption>
          <template #icon>
            <IconUser />
          </template>
          <template #default>个人资料</template>
        </Doption>
        <Doption>
          <template #icon>
            <IconSafe />
          </template>
          <template #default>修改密码</template>
        </Doption>
      </Dgroup>
      <Dgroup>
        <Doption>
          <template #icon>
            <IconSettings />
          </template>
          <template #default>系统设置</template>
        </Doption>
        <Doption>
          <template #icon>
            <IconPoweroff />
          </template>
          <template #default>退出登录</template>
        </Doption>
      </Dgroup>
    </template>
  </Dropdown>
</div>
</template>

<script lang="ts" setup>
import {Avatar, Dropdown, Doption, Dgroup} from "@arco-design/web-vue";
import {IconUser, IconUserGroup, IconPoweroff, IconSafe, IconSettings, IconLock, IconRelation} from "@arco-design/web-vue/es/icon";
import '@arco-design/web-vue/es/avatar/style/css.js'

</script>

<style lang="scss">
.profile {
  width: 272px;
  height: 100%;
  flex-basis: 272px;
  flex-grow: 0;
  flex-shrink: 0;

  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  align-items: center;

  font-size: 14px;
  padding: 0 20px;

  .arco-avatar {
    cursor: pointer;
  }


  .title {
    margin-right: 12px;
  }
}

.profile-dropdown {
  .arco-dropdown-list-wrapper {
    max-height: 272px;
  }
  .arco-dropdown-group-title {
    margin-top: 4px;
    margin-bottom: 4px;
    border-bottom: 1px solid #F6EDFF;
    &:first-child {
      margin-top: 0;
      margin-bottom: 0;
      border-bottom: none;
    }
  }
}
</style>
