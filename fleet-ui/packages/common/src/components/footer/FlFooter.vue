<template>
  <footer class="footer">
    <slot></slot>
    <div class="footer-info">
      首页 / demo
    </div>
    <div class="footer-tool">
      <div class="footer-tool-item">ddd</div>
      <div class="footer-tool-item">ddd</div>
    </div>
  </footer>
</template>
<script lang="ts" setup>

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
  padding: 0 8px;
  color: #263238;
  background-color: #CFD8DC;
  overflow: hidden;
  @include background-color-primary-container();
  @include background-color-primary-container-theme();

  .footer-info {
    height: 100%;
    display: flex;
    justify-content: flex-end;
  }
  .footer-tool {
    height: 100%;
    display: flex;
    justify-content: flex-end;
  }

  .footer-tool-item {
    height: 100%;
    padding: 0 16px;
    display: flex;
    align-items: center;
    cursor: pointer;

    &:hover {
      @include background-color-tertiary();
      @include background-color-tertiary-theme();
    }
  }

}
.footer i {
  height: 16px;
}

</style>
