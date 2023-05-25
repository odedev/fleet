<template>
  <FlContentBase class="content-boolean">
    <FlInputBoolean />
  </FlContentBase>
</template>
<script lang="ts" setup>
import FlContentBase from "./FlContentBase.vue";
import FlInputBoolean from "../input/FlInputBoolean.vue";

</script>
<style lang="scss">
.content.content-boolean {
  width: 32px;
  justify-content: center;
}
</style>
