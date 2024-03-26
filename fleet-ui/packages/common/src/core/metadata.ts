
import {copy} from "../utils/json_utils";
import Model from "./model";
import Enumeration from "./enumeration";

class Metadata {
  #model: Map<string, any>;
  #enumeration: Map<string, any>;

  constructor() {
    this.#model = new Map<string, any>();
    this.#enumeration = new Map<string, any>();
  }

  setModel(model: any): void {
    this.#model.set(model.fullName, model);
  }

  getModelByFullName(fullName: string): any {
    const model = this.#model.get(fullName);
    if (!model) {
      return null
    }
    return copy(model);
  }

  getModel(fullName: string): any {
    return this.getModelByFullName(fullName);
  }

  setEnumeration(enumeration: any): void {
    this.#enumeration.set(enumeration.fullName, enumeration);
  }

  getEnumeration(fullName: string): any {
    return this.getEnumerationByFullName(fullName);
  }

  getEnumerationByFullName(fullName: string): any {
    const enumeration = this.#enumeration.get(fullName);
    if (!enumeration) {
      return null
    }

    let enumData = copy(enumeration);
    return Enumeration.transform(enumData);
  }

}

export default Metadata;
