import {copy} from "../utils/json_utils";

const Application = {
  model: new Map<string, any>(),
  enumeration: new Map<string, any>(),
}

export function setModel(model: any): void {
  Application.model.set(model.fullName, model);
}

export function getModel(fullName: string): any {
  return getModelByFullName(fullName);
}

export function getModelByFullName(fullName: string): any {
  const model = Application.model.get(fullName);
  return copy(model);
}

export function setEnumeration(enumeration: any): void {
  Application.enumeration.set(enumeration.fullName, enumeration);
}

export function getEnumeration(fullName: string): any {
  return getEnumerationByFullName(fullName);
}

export function getEnumerationByFullName(fullName: string): any {
  const enumeration = Application.enumeration.get(fullName);
  return copy(enumeration);
}

export default Application;
