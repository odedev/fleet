import DataTypeEnum from "../enumerations/data_type_enum";

class DataType {

  static getInitValue(dataType: number): any {
    switch (dataType) {
      case DataTypeEnum.Boolean.value:
        return false;
      case DataTypeEnum.String.value:
        return "";
      case DataTypeEnum.Text.value:
        return "";
      case DataTypeEnum.Integer.value:
        return 0;
      case DataTypeEnum.Float.value:
        return 0;
      case DataTypeEnum.Date.value:
        return null;
      case DataTypeEnum.Enum.value:
        return null;
      case DataTypeEnum.Model.value:
        return null;
      case DataTypeEnum.Json.value:
        return null;
      case DataTypeEnum.File.value:
        return null;
      default:
        return null;
    }
  }
}

export default DataType;
