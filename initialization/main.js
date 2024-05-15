import chalk from 'chalk';

import file from './src/file.js';
import init from './src/init.js';

async function main() {
  const mods = {
    'fleet-core': [
      'fleet-core-metadata',
      'fleet-core-system',
      // 'fleet-core-org',
    ]
  };
  const keys = Object.keys(mods);
  for (let key of keys) {
    const submods = mods[key];
    for (let submod of submods) {
      await init.initSchema(key, submod);
    }
  }

  for (let key of keys) {
    const submods = mods[key];
    for (let submod of submods) {
      await init.initMetadata(key, submod);
    }
  }

  // init.initSchema('fleet-core', 'fleet-core-org');
  // init.initSchema('fleet-core', 'fleet-core-system');

}


main()
