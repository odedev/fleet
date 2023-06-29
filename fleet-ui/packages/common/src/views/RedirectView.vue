<template>
  <FlView>

  </FlView>
</template>
<script lang="ts" setup>
import { onMounted } from "vue";
import {useRouter, useRoute} from "vue-router";
import {FlView} from '../components/index.ts'

const router = useRouter();
const route = useRoute();


onMounted(() => {
  router.replace(route.query.path);
});

</script>
<style>

</style>
