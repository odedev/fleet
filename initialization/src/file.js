import path from 'node:path';
import fs from 'node:fs/promises';
import fse from 'fs-extra/esm';
import chalk from 'chalk';
import { glob, globSync, globStream, globStreamSync, Glob } from 'glob'
import config from './config.js';


async function rmdir(dirPath) {
  await fs.rm(dirPath, { recursive: true, force: true });
}

async function mkdir(path) {
  await fs.mkdir(path, { recursive: true, force: true });
}

async function cp (source, destination) {
  try {
    await fs.cp(source, destination, { recursive: true, force: true })
  } catch (err) {
    console.log(chalk.red(err));
  }
}

async function readFile (sourceFilePath) {
  try {
    const filePath = path.resolve(sourceFilePath);
    const contents = await fs.readFile(filePath, { encoding: 'utf8' });
    console.log(contents);

    return contents;
  } catch (err) {
    console.error(err.message);
  }
}

function getDestDir(type, submod = '') {
  const dest = path.join('.', config.dir, type, submod);
  return dest;
}


async function copyDirs (dirs, type, submod = '') {
  const dest = getDestDir(type, submod);
  for (let dir of dirs) {
    await cp(dir, dest);
  }
}


async function copyFiles (source, type, submod = '') {
  const dest = getDestDir(type, submod);
  await cp(source, dest);

  // const schemaFiles = await glob(
  //   [
  //     // '../fleet-tool/**/sql',
  //     // '../fleet-module/**/schema',
  //     '../fleet-core/**/sql',
  //   ]
  //   // { ignore: '*alert.sql' }
  // );
  // console.log(chalk.yellow(schemaFiles));

  // schemaFiles.forEach(item => {
  //   console.log(chalk.blue(item));
  // })
  // try {
  //   await fse.copy('../fleet-core/**/src/main/resources/sql/schema', './sql')
  //   console.log('success!')
  // } catch (err) {
  //   console.error(err)
  // }
}


async function getSourceFiles (mod, submod = '', ...dirs) {
  const pattern = path.join('..', mod, submod, '**', ...dirs);
  const files = await glob(pattern);
  console.log(chalk.yellow(pattern));
  console.log(files);
  return files;
}


async function getDestFiles (type, submod = '', ...file) {
  const pattern = path.join('.', config.dir, type, submod, '**', ...file);

  const files = await glob(pattern);
  console.log(chalk.blue(pattern));
  console.log(files);
  return files;
}


export default {
  rmdir,
  mkdir,
  cp,
  copyFiles,
  copyDirs,
  readFile,
  getDestDir,
  getSourceFiles,
  getDestFiles,
}
