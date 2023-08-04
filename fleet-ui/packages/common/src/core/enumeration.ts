import {copy} from '../utils/json_utils';


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

export function transform(enumeration: any): any {
  if (!enumeration.values) {
    return enumeration;
  }

  let enumData = {}
  enumeration.values.forEach((item: any) => {
    enumData[item.code] = {
      value: item.value,
      name: item.name,
    }
  });
  return enumData
}
