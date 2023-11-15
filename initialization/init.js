import chalk from 'chalk';
import file from './file.js';


async function initSchema(mod, submod) {
  console.log(chalk.yellow('initSchema Start!'));

  const dirs = await file.getSourceFiles(mod, submod, 'sql', 'schema');

  await file.copyDirs(dirs, 'schema', submod);

  const destFiles = await file.getDestFiles('schema', submod, '*.sql');

  for (let item of destFiles) {
    const content = await file.readFile(item);

  }

  console.log(chalk.green('initSchema Done'));
}

async function initMetadata(mod, submod) {
  const dirs = await file.getSourceFiles(mod, submod, 'sql', 'metadata');

  await file.copyDirs(dirs, 'metadata', submod);

  const destFiles = await file.getDestFiles('metadata', submod, '*.sql');

  for (let item of destFiles) {
    const content = await file.readFile(item);

  }


  console.log(chalk.red('initMetadata Done'));
}

export default {
  initSchema,
  initMetadata,
}
