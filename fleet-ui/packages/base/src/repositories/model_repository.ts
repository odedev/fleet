import request from "../core/request";


class ModelRepository {
  readonly #url: string;

  constructor(module: string, model: string) {
    this.#url = `/${module}/${model}`;
  }

  async findById(id: string) {
    const url = `${this.#url}/find/id/${id}`;

    const res = await request.get(url);

    return res;
  }

  async findOne(parameter: any) {
    const url = `${this.#url}/find/one`;

    const res = await request.post(url, parameter);

    return res;
  }

  async findMany(parameter: any) {
    const url = `${this.#url}/find/many`;

    const res = await request.post(url, parameter);

    return res;
  }

  async findPage(parameter: any) {
    const url = `${this.#url}/find/page`;

    const res = await request.post(url, parameter);

    return res;
  }

  async findTree(parameter: any) {
    const url = `${this.#url}/find/tree`;

    const res = await request.post(url, parameter);

    return res;
  }

  async insertOne(model: any) {
    const url = `${this.#url}/insert/one`;

    const res = await request.post(url, model);

    return res;
  }

  async insertMany(models: any[]) {
    const url = `${this.#url}/insert/many`;

    const res = await request.post(url, models);

    return res;
  }

  async updateOne(model: any) {
    const url = `${this.#url}/update/one`;

    const res = await request.post(url, model);

    return res;
  }

  async updateMany(models: any[]) {
    const url = `${this.#url}/update/many`;

    const res = await request.post(url, models);

    return res;
  }

  async deleteOne(model: any) {
    const url = `${this.#url}/delete/one`;

    const res = await request.post(url, model);

    return res;
  }

  async deleteMany(models: any[]) {
    const url = `${this.#url}/delete/many`;

    const res = await request.post(url, models);

    return res;
  }

  async count(parameter: any) {
    const url = `${this.#url}/count`;

    const res = await request.post(url, parameter);

    return res;
  }
}


export default ModelRepository;
