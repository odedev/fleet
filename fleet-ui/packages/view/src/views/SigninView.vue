<script setup lang="ts">
import { useRouter } from "vue-router";
import {
  FlView, FlViewMain, FlViewBody, FlBox, FlButton
} from '@fleet/component'

const router = useRouter();

const onBackClick = () => {
  router.back();
};

const onHomeClick = () => {
  router.replace("/");
};

</script>

<template>
  登记
</template>
