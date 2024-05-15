import mitt from 'mitt';
import type { Emitter } from 'mitt';

type Events = {
  foo: string;
  bar?: number;
};

// const emitter = mitt<Events>();
const emitter: Emitter<Events> = mitt<Events>();

export default emitter;
