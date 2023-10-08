<template>
  <FlView>
    <FlViewMain>
      <FlViewBody>
        <FlBlock>
        <FlDescription :model-value="data" title="用户信息" />
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlBox, FlDescription,
  FlAction, FlButton
} from '@/components'

const data = [{
  label: 'Name',
  value: 'Socrates',
}, {
  label: 'Mobile',
  value: '123-1234-1234',
}, {
  label: 'Residence',
  value: 'Beijing'
}, {
  label: 'Hometown',
  value: 'Beijing',
}, {
  label: 'Address',
  value: 'Yingdu Building, Zhichun Road, Beijing'
}];

</script>
<style>

</style>
