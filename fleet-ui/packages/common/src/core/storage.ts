import {clear, getItem, removeItem, setItem} from "../utils/storage_utils";

export class Storage {
  readonly #scope: string;

  constructor(scope: string) {
    this.#scope = scope + '__';
  }

  setItem(key: string, value: any) {
    const k = this.#scope + key;
    setItem(k, value);
  }

  getItem(key: string) {
    const k = this.#scope + key;
    return getItem(k);
  }

  removeItem(key: string) {
    const k = this.#scope + key;
    removeItem(k);
  }

  clear() {
    clear()
  }
}

export default new Storage('app');
