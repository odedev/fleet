import {io, Socket} from "socket.io-client";
// import ws from 'ws';

class WebSocket {
  readonly #url: string;
  readonly #socket: Socket;

  constructor(url: string) {
    this.#url = url;
    this.#socket = io(this.#url);

    this.#socket.on("connect", () => {
      console.log(this.#socket.id);
    });

    this.#socket.on("disconnect", () => {
      console.log(this.#socket.id);
    });

  }


}

export default WebSocket;
