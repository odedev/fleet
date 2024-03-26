interface Model {
  id?: string,
  code: string,
  name: string,
  fullName: string,
  description?: string,
  module: any,
  fields: ModelField[],
}

interface ModelField {
  id?: string,
  code: string,
  name: string,
  dataType: number,
  dataLength: number,
  enumType: any,
  modelType: Model,
  isSlaveModel: boolean,
  isNullable: boolean,
  isSearchable: boolean,
  isDefaultDisplay: boolean,
  note?: string,
  sequence: string,
  model?: Model,
  modelData?: any,
  modelParameter?: any,
  enumeration?: any | any[],
}
