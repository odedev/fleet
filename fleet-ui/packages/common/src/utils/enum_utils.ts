import {copy} from './json_utils';


export function getByValue(enumeration: any, value: number): any {
  let data = null;

  for (const key in enumeration) {
    let item = enumeration[key];
    if (item.value === value) {
      data = item;
      break;
    }
  }

  return data;
}
