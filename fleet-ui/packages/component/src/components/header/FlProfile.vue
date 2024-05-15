<script setup lang="ts">
import {computed} from "vue";
import {Avatar, Dropdown, Doption, Dgroup, Badge} from "@arco-design/web-vue";
import {
  IconUser,
  IconUserGroup,
  IconPoweroff,
  IconSafe,
  IconSunFill,
  IconSun,
  IconMoon,
  IconSettings,
  IconNotification,
  IconRelation
} from "@arco-design/web-vue/es/icon";
import '@arco-design/web-vue/es/avatar/style/css.js'
import '@arco-design/web-vue/es/badge/style/css.js';
import '@arco-design/web-vue/es/dropdown/style/css.js';

interface Props {
  name?: string,
  notification?: number,
}

const props = defineProps<Props>();

const name = computed(() => props.name || '')
const notification = computed(() => props.notification || 10)

const handleThemeChange = (theme: string): void => {
  console.log(theme);
  document.documentElement.setAttribute('data-theme', theme)
};

const handleUserClick = (theme: string): void => {
  console.log(theme);
};

</script>

<template>
<div class="profile">
  <div class="profile__text">{{name}}</div>
  <div class="profile__theme">
    <Dropdown class="profile__dropdown" trigger="hover" @select="handleThemeChange">
      <i class="profile__icon">
        <IconSunFill />
      </i>
      <template #content>
        <Dgroup>
          <Doption value="Red">
            <template #icon><IconSun /></template>
            <template #default>红色</template>
          </Doption>
          <Doption value="Orange">
            <template #icon><IconSun /></template>
            <template #default>橙色</template>
          </Doption>
          <Doption value="Yellow">
            <template #icon><IconSun /></template>
            <template #default>黄色</template>
          </Doption>
          <Doption value="Green">
            <template #icon><IconSun /></template>
            <template #default>绿色</template>
          </Doption>
          <Doption value="Blue">
            <template #icon><IconSun /></template>
            <template #default>蓝色</template>
          </Doption>
          <Doption value="Pink">
            <template #icon><IconSun /></template>
            <template #default>粉色</template>
          </Doption>
        </Dgroup>
        <Dgroup>
          <Doption value="Dark">
            <template #icon><IconMoon /></template>
            <template #default>暗黑</template>
          </Doption>
        </Dgroup>
      </template>
    </Dropdown>
  </div>
  <Badge class="profile__notification" :count="notification" dot >
    <i class="profile__icon">
      <IconNotification />
    </i>
  </Badge>
  <div class="profile__user">
    <Dropdown class="profile__dropdown" trigger="hover" @select="handleUserClick">
      <Avatar :style="{ backgroundColor: '#00d0b6' }">Admin</Avatar>
      <template #content>
        <Dgroup>
          <Doption value="role">
            <template #icon><IconRelation /></template>
            <template #default>角色权限</template>
          </Doption>
          <Doption value="org">
            <template #icon><IconUserGroup /></template>
            <template #default>组织架构</template>
          </Doption>
        </Dgroup>
        <Dgroup>
          <Doption value="info">
            <template #icon><IconUser /></template>
            <template #default>个人资料</template>
          </Doption>
          <Doption value="password">
            <template #icon><IconSafe /></template>
            <template #default>修改密码</template>
          </Doption>
        </Dgroup>
        <Dgroup>
          <!--        <Doption>-->
          <!--          <template #icon>-->
          <!--            <IconSettings />-->
          <!--          </template>-->
          <!--          <template #default>系统设置</template>-->
          <!--        </Doption>-->
          <Doption value="logout">
            <template #icon><IconPoweroff /></template>
            <template #default>退出登录</template>
          </Doption>
        </Dgroup>
      </template>
    </Dropdown>
  </div>
</div>
</template>


<style lang="scss">
.profile {
  width: 552px;
  height: 100%;
  flex-basis: 552px;
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


  .profile__text {
    margin-right: 20px;
  }

  .profile__theme {
    margin-right: 20px;
  }
  .profile__notification {
    margin-right: 20px;
  }
  .profile__icon {
    display: block;
    width: 22px;
    height: 22px;
    font-size: 22px;
    line-height: 1;
    // padding: 4px;
    cursor: pointer;
  }


}
.profile__dropdown {
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
