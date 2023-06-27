import {getModel} from "../core/application";
import {getModelInitValue} from "../utils/model_utils";

export function useModel(name: string): any {
  return getModel(name);
}

export function useModelInitValue(name: string): any {
  return getModelInitValue(getModel(name));
}
