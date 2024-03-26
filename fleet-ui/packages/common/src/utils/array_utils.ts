import { copy } from './json_utils';

/**
 * 数组转树形结构
 * @param list
 * @return Array
 */
export function arrayToTree(list: any[]): any[] {
  const dataMap: any = new Map();
  const dataTree: any = [];

  list.forEach(item => {
    const id = item.id || item.code;
    dataMap.set(id, item);
  });

  list.forEach(item => {
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
  const dataMap: any = new Map();

  list.forEach(item => {
    const id = item.id || item.code;
    dataMap.set(id, item);
  });

  return dataMap;
}
