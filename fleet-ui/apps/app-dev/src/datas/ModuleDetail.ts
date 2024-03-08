import {h} from "vue";
import {IconApps, IconCommon, IconLayout, IconRelation, IconUnorderedList} from "@arco-design/web-vue/es/icon";

const data: any[] = [
  {
    id: 'System',
    name: '系统管理',
    code: 'System',
    apis: [],
    models: [],
    enumerations: [],
    views: [],
  },
  {
    id: 'Org',
    name: '组织架构',
    code: 'Org',
    apis: [],
    models: [
      {
        id: 'menu',
        name: '菜单',
        code: 'Menu',
      }
    ],
    enumerations: [],
    views: [],
  },
  {
    id: 'Orgs',
    name: '组织架构',
    code: 'Orgs',
    apis: [],
    models: [
      {
        id: 'menu',
        name: '菜单',
        code: 'Menu',
      }
    ],
    enumerations: [],
    views: [],
  }
];

export function getModuleDetails(): any[] {
  data.forEach((item: any) => {
    item.draggable = false;
    item.children = [];

    const api = {
      id: item.code + 'api',
      name: '接口',
      code: 'model',
      children: item?.apis,

      icon: () => h(IconRelation),
      draggable: false,
    };

    const model = {
      id: item.code + 'model',
      name: '模型',
      code: 'model',
      children: item?.models,

      icon: () => h(IconCommon),
      draggable: false,
    };

    const enumeration = {
      id: item.code + 'enumeration',
      name: '枚举',
      code: 'model',
      children: item?.enumerations,

      icon: () => h(IconUnorderedList),
      draggable: false,
    };

    const view = {
      id: item.code + 'view',
      name: '视图',
      code: 'model',
      children: item?.views,

      icon: () => h(IconLayout),
      draggable: false,
    };


    item.children.push(api);
    item.children.push(model);
    item.children.push(enumeration);
    item.children.push(view);
  });

  return data;
}

export default data;
