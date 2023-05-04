<template>
  <FlView>
    <FlViewAside>

    </FlViewAside>
    <FlViewMain>
      <FlViewNav>

      </FlViewNav>
      <FlViewHead>
        <FlSearch></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlContent>
          <FlTable></FlTable>
        </FlContent>
<!--              <FlContent>-->
<!--                <FlTable></FlTable>-->
<!--              </FlContent>-->
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlContent, FlCell,
  FlTable, FlButton, FlSearch,
} from '../components/index.ts'

</script>
<style>

</style>
