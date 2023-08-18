<template>
<div class="table-cell-button">
  <template v-if="props.isEditable">
    <Button type="text" status="success" @click="handleAddRowClick">
      <template #icon>
        <IconPlusCircleFill />
      </template>
    </Button>
    <Button type="text" status="danger" @click="handleDeleteRowClick">
      <template #icon>
        <IconMinusCircleFill />
      </template>
    </Button>
  </template>
  <template v-else>
    <Button type="text" status="success" @click="handleViewClick">查看</Button>
    <Button type="text" status="warning" @click="handleEditClick">编辑</Button>
    <Popconfirm content="Are you sure you want to delete?" @ok="handleDeleteRowOkClick" @cancel="handleDeleteRowCancelClick">
      <Button type="text" status="danger" @click="handleDeleteClick">删除</Button>
    </Popconfirm>
  </template>
</div>
</template>

<script lang="ts" setup>
import {Button, Popconfirm} from "@arco-design/web-vue";
import {IconPlusCircleFill, IconMinusCircleFill, IconCloseCircleFill} from "@arco-design/web-vue/es/icon";
import '@arco-design/web-vue/es/popconfirm/style/css.js';

const emits = defineEmits(['AddRow', 'DeleteRow', 'View', 'Edit', 'Delete']);

const props = defineProps<{
  isEditable?: boolean,
}>();


const handleAddRowClick = () => {
  console.log('AddRow')
  emits('AddRow');
};

const handleDeleteRowClick = () => {
  console.log('DeleteRow')
  emits('DeleteRow');
};

const handleViewClick = () => {
  console.log('View')
  emits('View');
};

const handleEditClick = () => {
  console.log('Edit')
  emits('Edit');
};

const handleDeleteClick = () => {
  console.log('Delete')
  emits('Delete');
};

const handleDeleteRowOkClick = () => {
  console.log('DeleteRow')
  emits('DeleteRow');
};


const handleDeleteRowCancelClick = () => {
  console.log('DeleteRow')
  emits('DeleteRow');
};

</script>
<style lang="scss">
.table-cell-button {
  width: max-content;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  padding: 0 6px;

  .arco-btn {
    padding: 0 6px;
    padding: 0;
    margin: 0 6px;
  }
  .arco-btn-text:hover {
    background-color: transparent;
  }
  .arco-btn-icon {
    font-size: 20px;
  }
  .arco-btn-size-medium.arco-btn-only-icon {
    width: 24px;
  }
}
</style>
