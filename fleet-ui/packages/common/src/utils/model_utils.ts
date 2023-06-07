import {copy} from './json_utils';


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
