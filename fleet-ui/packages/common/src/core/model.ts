import {copy} from '../utils/json_utils';
import {getInitValue} from "./data_type";

/**
 * 获取模型显示的字段
 * @param model
 */
export function getDisplayFieldCode(model: any): string {
  let displayField = 'name';

  if (model) {
    for (const field of model.fields) {
      if (field.isDefaultDisplay) {
        displayField = field.code;
        break
      }
    }
  }

  return displayField;
}


export function getSearchableFields(model: any): any[] {
  let fields = [];

  fields = model.fields.filter((field: { isSearchable: any; }) => field.isSearchable);

  // if (model) {
  //   for (const field of model.fields) {
  //     if (field.isSearchable) {
  //       fields.push(field)
  //     }
  //   }
  // }

  return fields;
}

/**
 * 获取模型的初始化值
 * @param model
 */
export function getModelInitValue(model: any): any {
  if (!model) {
    return null;
  }

  let value: any = {};
  for (const field of model.fields) {
    const code = field.code;
    const dataType = field.dataType;

    value[code] = getInitValue(dataType);
  }
  return value;
}
