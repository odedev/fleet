<template>
  <FlView>
    <FlViewMain>
      <FlViewHead>
        <FlSearch></FlSearch>
      </FlViewHead>
      <FlViewBody>
        <FlBlock>
          <FlTableConcise :model-value="datas" :model="model" is-show-head></FlTableConcise>
        </FlBlock>
      </FlViewBody>
    </FlViewMain>
  </FlView>
</template>
<script lang="ts" setup>
import {reactive} from "vue";
import {
  FlHeader, FlBody, FlFooter, FlMenu, FlMain, FlNav, FlTab, FlPage,
  FlView, FlViewAside, FlViewMain, FlViewNav, FlViewHead, FlViewBody,
  FlBlock, FlContent,
  FlTable, FlTableConcise, FlButton, FlSearch,
} from '../components'

const model = {
  "id": "1665926265829355520",
  "code": "menu",
  "name": "菜单",
  "description": null,
  "fullName": "dev.odes.fleet.module.system.model.MenuModel",
  "module": {
    "id": "1665926009322500100",
    "code": "system",
    "name": "系统管理",
    "description": "",
    "storageType": 0
  },
  "fields": [
    {
      "id": "1665926651155869697",
      "code": "name",
      "name": "名称",
      "dataType": 1,
      "dataLength": 255,
      "enumType": null,
      "modelType": null,
      "isSlaveModel": null,
      "isNullable": null,
      "isSearchable": null,
      "isDefaultDisplay": null,
      "note": null,
      "sequence": "20",
      "model": {
        "id": "1665926265829355520",
        "code": "menu",
        "name": "菜单",
        "description": null,
        "fullName": "dev.odes.fleet.module.system.model.MenuModel",
        "module": {
          "id": "1665926009322500100",
          "code": null,
          "name": null,
          "description": null,
          "storageType": null
        },
        "fields": null
      }
    },
    {
      "id": "1665926651155869696",
      "code": "code",
      "name": "编码",
      "dataType": 1,
      "dataLength": 255,
      "enumType": null,
      "modelType": null,
      "isSlaveModel": null,
      "isNullable": null,
      "isSearchable": null,
      "isDefaultDisplay": null,
      "note": null,
      "sequence": "10",
      "model": {
        "id": "1665926265829355520",
        "code": "menu",
        "name": "菜单",
        "description": null,
        "fullName": "dev.odes.fleet.module.system.model.MenuModel",
        "module": {
          "id": "1665926009322500100",
          "code": null,
          "name": null,
          "description": null,
          "storageType": null
        },
        "fields": null
      }
    },
    {
      "id": "1665926651155869697",
      "code": "isPreset",
      "name": "预置",
      "dataType": 0,
      "dataLength": 255,
      "enumType": null,
      "modelType": null,
      "isSlaveModel": null,
      "isNullable": null,
      "isSearchable": null,
      "isDefaultDisplay": null,
      "note": null,
      "sequence": "20",
      "model": {
        "id": "1665926265829355520",
        "code": "menu",
        "name": "菜单",
        "description": null,
        "fullName": "dev.odes.fleet.module.system.model.MenuModel",
        "module": {
          "id": "1665926009322500100",
          "code": null,
          "name": null,
          "description": null,
          "storageType": null
        },
        "fields": null
      }
    },
    {
      "id": "1665926651155869697",
      "code": "remark",
      "name": "备注",
      "dataType": 1,
      "dataLength": 255,
      "enumType": null,
      "modelType": null,
      "isSlaveModel": null,
      "isNullable": null,
      "isSearchable": null,
      "isDefaultDisplay": null,
      "note": null,
      "sequence": "20",
      "model": {
        "id": "1665926265829355520",
        "code": "menu",
        "name": "菜单",
        "description": null,
        "fullName": "dev.odes.fleet.module.system.model.MenuModel",
        "module": {
          "id": "1665926009322500100",
          "code": null,
          "name": null,
          "description": null,
          "storageType": null
        },
        "fields": null
      }
    },
  ]
}

const datas = reactive([{
  id: '1',
  name: 'Jane Doe',
  code: 23000,
  address: '32 Park Road, London',
  remark: 'jane.doe@example.com',
  isPreset: false,
}, {
  id: '2',
  name: 'Alisa Ross',
  code: 25000,
  address: '35 Park Road, London',
  remark: 'alisa.ross@example.com',
  isPreset: false,

}, {
  id: '3',
  name: 'Kevin Sandra',
  code: 22000,
  address: '31 Park Road, London',
  remark: 'kevin.sandra@example.com',
  isPreset: true,

}, {
  id: '4',
  name: 'Ed Hellen',
  code: 17000,
  address: '42 Park Road, London',
  remark: 'ed.hellen@example.com',
  isPreset: false,

}, {
  id: '5',
  name: 'William Smith',
  code: 27000,
  address: '62 Park Road, London',
  remark: 'william.smith@example.com',
  isPreset: true,

}]);
</script>
<style>

</style>
