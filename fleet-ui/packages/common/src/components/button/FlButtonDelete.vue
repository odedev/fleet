<template>
  <FlButtonBase @click="handleClick">
    <Button type="primary" status="danger" size="medium">删除</Button>
  </FlButtonBase>
</template>
<script lang="ts" setup>
import {Button} from "@arco-design/web-vue";
import '@arco-design/web-vue/es/button/style/css.js';
import FlButton from "@/components/button/FlButton.vue";
import FlButtonBase from "@/components/button/FlButtonBase.vue";

const emit = defineEmits(['click']);

const handleClick = () => {
  console.log('view')
  emit('click');
};

</script>
<style lang="scss">
.button-add {
  height: 32px;
}
</style>
