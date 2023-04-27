<template>
  <FlHeader>

  </FlHeader>
  <FlBody>
    <FlMenu>
    </FlMenu>
    <FlMain>
      <FlNav>

      </FlNav>
      <FlPage>
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
              <FlContent>
                <FlTable></FlTable>
              </FlContent>
            </FlViewBody>
          </FlViewMain>
        </FlView>
      </FlPage>
    </FlMain>
  </FlBody>
  <FlFooter>

  </FlFooter>
</template>
<script setup lang="ts">
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlContent,
  FlTable, FlButton, FlSearch,
} from './components/index.ts'
</script>
<style lang="scss" scoped>

</style>
