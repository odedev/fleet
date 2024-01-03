<template>
  <footer class="footer">
    <slot></slot>
    <div class="footer-info">
      首页 / demo
    </div>
    <div class="footer-tool">
      <div class="footer-tool-item">
        <IconRefresh />
        <span>刷新</span>
      </div>
      <div class="footer-tool-item">
        <IconHistory />
        <span>历史</span>
      </div>
      <div class="footer-tool-item">
        <IconNotification />
        <span>通知</span>
      </div>
      <div class="footer-tool-item">
        <IconMessage />
        <span>消息</span>
      </div>
      <div class="footer-tool-item" @click="handleClick">
        <IconQuestionCircle />
        <span>帮助</span>
      </div>
    </div>

    <FlDrawer>
      <div>You can customize modal body text by the current situation. This modal will be closed immediately once you
        press the OK button.
      </div>
    </FlDrawer>
  </footer>
</template>
<script lang="ts" setup>
import {ref} from "vue";

import FlDrawer from "../drawer/FlDrawer.vue";
import {IconHistory, IconNotification, IconQuestionCircle, IconRefresh, IconMessage} from "@arco-design/web-vue/es/icon";

const visible = ref(false);

const handleClick = () => {
  visible.value = true;
};



</script>
<style lang="scss">
@use "../../assets/mixin" as *;

.footer {
  --footer-height: 24px;
  /* height: 20px; */
  height: var(--footer-height);
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--footer-height);
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  font-size: 12px;
  line-height: 12px;
  // padding: 0 8px;
  color: #263238;
  background-color: #CFD8DC;
  overflow: hidden;

  user-select: none;

  @include background-color-primary-container();


  .footer-info {
    height: 100%;
    display: flex;
    justify-content: flex-end;
    align-items: center;
    padding: 0 8px;
  }
  .footer-tool {
    height: 100%;
    display: flex;
    justify-content: flex-end;
  }

  .footer-tool-item {
    height: 100%;
    padding: 0 12px;
    display: flex;
    align-items: center;
    //cursor: pointer;

    &:hover {
      @include background-color-tertiary();
    }
  }

}
.footer i {
  height: 16px;
}

</style>
