import { copy } from '../utils/json_utils';
import DataType from "./data_type";

class Model {

  /**
   * 获取模型显示的字段
   * @param model
   */
  static getDisplayFieldCode(model: any): string {
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

  static getSearchableFields(model: any): any[] {
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
  static getModelInitValue(model: any): any {
    if (!model) {
      return null;
    }

    let value: any = {};
    for (const field of model.fields) {
      const code = field.code;
      const dataType = field.dataType;

      value[code] = DataType.getInitValue(dataType);
    }
    return value;
  }
}

export default Model;
