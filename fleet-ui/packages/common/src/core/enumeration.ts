import { copy } from '../utils/json_utils';

class Enumeration {

  static getByValue(enumeration: any, value: number): any {
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

  static transform(enumeration: any): any {
    if (!enumeration.values) {
      return enumeration;
    }

    let enumData = {}
    enumeration.values.forEach((item: any) => {
      // @ts-ignore
      enumData[item.code] = {
        value: item.value,
        name: item.name,
      }
    });
    return enumData
  }
}


export default Enumeration;
