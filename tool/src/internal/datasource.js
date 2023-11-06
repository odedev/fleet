import path from 'node:path';
import { DataSource } from 'typeorm';
import 'reflect-metadata';

// 执行命令的目录
const __rootDirname = path.resolve();

const entities = path.join(__rootDirname, "src", "**", "entity", "*{.js,.ts}");

export const AppDataSource = new DataSource({
  type: "sqlite",
  database: "tool.db",
  synchronize: true,
  logging: true,
  entities: [entities],
  migrations: [],
  subscribers: [],
})

export default AppDataSource;


// export const SqliteDataSource = new DataSource({
//   type: "sqlite",
//   database: "database.sqlite",
//   synchronize: true,
//   logging: false,
//   entities: [],
//   migrations: [],
//   subscribers: [],
// });


// const MysqlDataSource = new DataSource({
//   type: "mysql",
//   host: "localhost",
//   port: 3306,
//   username: "root",
//   password: "admin",
//   database: "db1",
//   entities: [path.join(__rootDirname, "entity", "*{.js,.ts}")],
//   synchronize: true,
// })
