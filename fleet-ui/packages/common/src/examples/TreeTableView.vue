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
        <FlBlock>
          <FlTable is-editable></FlTable>
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
  FlBlock, FlContent,
  FlTable, FlButton, FlSearch,
} from '../components'

</script>
<style>

</style>
