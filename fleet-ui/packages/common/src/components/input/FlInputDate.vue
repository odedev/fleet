<template>
  <FlInputBase class="input-date">
    <DatePicker show-time format="YYYY-MM-DD HH:mm:ss"  size="small"/>
  </FlInputBase>
</template>
<script lang="ts" setup>
import {DatePicker} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/date-picker/style/index.css";
import "@arco-design/web-vue/es/time-picker/style/index.css";
import FlInputBase from "./FlInputBase.vue";


</script>
<style lang="scss">
.input-date {
  .arco-picker {
    width: 100%;
    padding-left: 0px;
    padding-right: 8px;
  }
}

</style>
