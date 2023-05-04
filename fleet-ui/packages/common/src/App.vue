<template>
  <FlHeader>

  </FlHeader>
  <FlBody>
    <FlMenu>
    </FlMenu>
    <FlMain>

      <FlTab>

      </FlTab>
      <FlNav>

      </FlNav>
      <FlPage>
        <RouterView />
      </FlPage>
    </FlMain>
  </FlBody>
<!--  <FlFooter>-->

<!--  </FlFooter>-->
</template>
<script setup lang="ts">
import {RouterView} from 'vue-router';

import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlContent, FlCell,
  FlTable, FlButton, FlSearch,
} from './components/index.ts'
</script>
<style lang="scss" scoped>

</style>
