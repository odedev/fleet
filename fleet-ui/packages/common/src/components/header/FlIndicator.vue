<script lang="ts" setup>
import {Badge, Dropdown, Doption, Dgroup} from "@arco-design/web-vue";
import {IconNotification, IconSunFill, IconSun, IconSafe, IconSettings, IconMessage, IconRelation} from "@arco-design/web-vue/es/icon";
import '@arco-design/web-vue/es/badge/style/css.js';

const emits = defineEmits([
  'filterClick',
  'settingClick',
]);

const handleThemeChange = (theme: string) => {
  console.log(theme);
  document.documentElement.setAttribute('data-theme', theme)
};


const handleFilterClick = () => {
  emits('filterClick');
};

</script>
<template>
<div class="indicator">
  <Dropdown class="profile-dropdown" trigger="hover" @select="handleThemeChange">
    <i class="indicator__icon">
      <IconSunFill />
    </i>
    <template #content>
      <Dgroup>
        <Doption value="Purple">
          <template #icon><IconSun /></template>
          <template #default>紫色</template>
        </Doption>
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
      </Dgroup>
      <Dgroup>
        <Doption value="Dark">
          <template #icon>
            <IconSun />
          </template>
          <template #default>暗黑</template>
        </Doption>
      </Dgroup>
    </template>
  </Dropdown>

  <Badge :count="9" dot >
    <i class="indicator__icon">
      <IconNotification />
    </i>
  </Badge>
</div>
</template>


<style lang="scss">
@use "../../assets/mixin" as *;

.indicator {
  width: 56px;
  height: 100%;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  background-color: transparent;
  font-size: 22px;

  .indicator__icon {
    // margin: 0 8px;
    display: block;
    width: 22px;
    height: 22px;
    line-height: 1;
    // padding: 4px;
    cursor: pointer;

    &:hover {
      // @include background-color-tertiary();
    }
  }

  .profile-dropdown {
    // .arco-dropdown-list-wrapper {
    //   max-height: 272px;
    // }
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
}
</style>
