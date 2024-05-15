<script setup lang="ts">
import { computed } from "vue";
import {
  IconApps,
  IconArchive,
  IconCommon,
  IconLayout,
  IconRelation,
  IconUnorderedList,
  IconMenuFold,
  IconMenuUnfold,
  IconList,
  IconBug,
  IconBulb,
  IconUser,
  IconUserGroup,
  IconSettings,
  IconCode,
  IconCloud,
  IconFile,
  IconEye,
  IconStar,
  IconStorage,
} from '@arco-design/web-vue/es/icon';

interface Props {
  modelValue: string,
}

const props = defineProps<Props>();

const value = computed<string>(() => props.modelValue);

</script>

<template>
  <i class="icon">
    <IconApps v-if="value === 'IconApps'" />
    <IconArchive v-else-if="value === 'IconArchive'" />
    <IconCommon v-else-if="value === 'IconCommon'" />
    <IconLayout v-else-if="value === 'IconLayout'" />
    <IconRelation v-else-if="value === 'IconRelation'" />
    <IconUnorderedList v-else-if="value === 'IconUnorderedList'" />
    <IconMenuFold v-else-if="value === 'IconMenuFold'" />
    <IconMenuUnfold v-else-if="value === 'IconMenuUnfold'" />
    <IconList v-else-if="value === 'IconList'" />
    <IconBug v-else-if="value === 'IconBug'" />
    <IconBulb v-else-if="value === 'IconBulb'" />
    <IconUser v-else-if="value === 'IconUser'" />
    <IconUserGroup v-else-if="value === 'IconUserGroup'" />
    <IconSettings v-else-if="value === 'IconSettings'" />
    <IconCode v-else-if="value === 'IconCode'" />
    <IconCloud v-else-if="value === 'IconCloud'" />
    <IconFile v-else-if="value === 'IconFile'" />
    <IconEye v-else-if="value === 'IconEye'" />
    <IconStar v-else-if="value === 'IconStar'" />
    <IconStorage v-else-if="value === 'IconStorage'" />


    <IconApps v-else="value === 'IconApps'" />
  </i>
</template>
