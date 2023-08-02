
import {copy} from "../utils/json_utils";
import {transform} from "@/utils/enum_utils";

const Metadata = {
  model: new Map<string, any>(),
  enumeration: new Map<string, any>(),
}

export function setModel(model: any): void {
  Metadata.model.set(model.fullName, model);
}

export function getModel(fullName: string): any {
  return getModelByFullName(fullName);
}

export function getModelByFullName(fullName: string): any {
  const model = Metadata.model.get(fullName);
  if (!model) {
    return null
  }
  return copy(model);
}

export function setEnumeration(enumeration: any): void {
  Metadata.enumeration.set(enumeration.fullName, enumeration);
}

export function getEnumeration(fullName: string): any {
  return getEnumerationByFullName(fullName);
}

export function getEnumerationByFullName(fullName: string): any {
  const enumeration = Metadata.enumeration.get(fullName);
  if (!enumeration) {
    return null
  }

  let enumData = copy(enumeration);
  return transform(enumData);
}
