import { Model } from "@fleet/common";
import metadata from "../core/metadata";
import ModelRepository from "../repositories/model_repository";

export function useModel(name: string, extend: any, exclude: string[]): any {
  return metadata.getModel(name);
}

export function useModelInitValue(name: string): any {
  return Model.getModelInitValue(metadata.getModel(name));
}

export function useModelRepository(name: string): any {
  const model = metadata.getModel(name);
  const moduleCode = model?.module.code;
  const modelCode = model?.code;
  return new ModelRepository(moduleCode, modelCode);
}
