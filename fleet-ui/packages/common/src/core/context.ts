
class Context {
  #user: Map<string, any>;

  constructor() {
    this.#user = new Map<string, any>();
  }
}

export default Context;
