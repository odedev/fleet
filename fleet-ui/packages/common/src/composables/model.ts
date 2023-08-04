import {getModel} from "../core/metadata";
import {getModelInitValue} from "../core/model";

export function useModel(name: string): any {
  return getModel(name);
}

export function useModelInitValue(name: string): any {
  return getModelInitValue(getModel(name));
}
