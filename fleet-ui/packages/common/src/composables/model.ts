import {getModel} from "../core/metadata";
import {getModelInitValue} from "../core/model";
import ModelRepository from "../repositories/model_repository";

export function useModel(name: string): any {
  return getModel(name);
}

export function useModelInitValue(name: string): any {
  return getModelInitValue(getModel(name));
}

export function useModelRepository(name: string): any {
  const model = getModel(name);
  const moduleCode = model?.module.code;
  const modelCode = model?.code;
  return new ModelRepository(moduleCode, modelCode);
}
