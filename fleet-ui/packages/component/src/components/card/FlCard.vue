<script setup lang="ts">
import {Card, Link} from "@arco-design/web-vue";
import "@arco-design/web-vue/es/card/style/css.js";


</script>
<template>
<div class="card">
  <Card title="Arco Card" :hoverable="true">
    <template #extra>
      <Link>More</Link>
    </template>
    ByteDance's core product, Toutiao ("Headlines"), is a content platform in
    China and around the world. Toutiao started out as a news recommendation
    engine and gradually evolved into a platform delivering content in various
    formats.
  </Card>
</div>
</template>
<style lang="scss">
.card {
  .arco-card {
    margin-right: 16px;
    margin-bottom: 16px;
    margin-right: 0px;
    margin-bottom: 0px;
  }
}
</style>
