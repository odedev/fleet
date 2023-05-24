<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlSearch></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTable></FlTable>
        </FlBlock>
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
  FlBlock, FlContent, FlCell,
  FlTable, FlButton, FlSearch,
} from '../components'

</script>
<style>

</style>
