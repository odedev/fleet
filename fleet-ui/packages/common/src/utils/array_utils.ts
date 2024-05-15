import { copy } from './json_utils';

/**
 * 数组转树形结构
 * @param data
 * @return Array
 */
export function arrayToTree(list: any[]): any[] {
  const data: any[] = copy(list);
  const dataMap: any = new Map();
  const dataTree: any = [];

  data.forEach(item => {
    const id = item.id || item.code;
    dataMap.set(id, item);
  });

  data.forEach(item => {
    const parentId = item.parent?.id || item.parent;
    const parent = dataMap.get(parentId);
    if (parent) {
      const parentCopy = copy(parent);
      parentCopy.children = [];
      item.parent = parentCopy;

      parent.children = parent.children || [];
      parent.children.push(item);
    } else {
      dataTree.push(item);
    }
  });

  return dataTree;
}

export function arrayToMap(list: any[]): Map<any, any> {
  const data: any[] = copy(list);
  const dataMap: any = new Map();

  data.forEach(item => {
    const id = item.id || item.code;
    dataMap.set(id, item);
  });

  data.forEach(item => {
    const parentId = item.parent?.id || item.parent;
    const parent = dataMap.get(parentId);
    if (parent) {
      const parentCopy = copy(parent);
      parentCopy.children = [];
      item.parent = parentCopy;
    }
  });

  return dataMap;
}
