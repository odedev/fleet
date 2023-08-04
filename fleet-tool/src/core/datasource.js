import path from 'node:path';
import "reflect-metadata"
import { DataSource } from "typeorm"

// 执行命令的目录
const __rootDirname = path.resolve();


export const SqliteDataSource = new DataSource({
  type: "sqlite",
  database: "database.sqlite",
  synchronize: true,
  logging: false,
  entities: [User],
  migrations: [],
  subscribers: [],
});


const MysqlDataSource = new DataSource({
  type: "mysql",
  host: "localhost",
  port: 3306,
  username: "root",
  password: "admin",
  database: "db1",
  entities: [path.join(__rootDirname, "entity", "*{.js,.ts}")],
  synchronize: true,
})

export const AppDataSource = new DataSource({
  type: "sqlite",
  database: "database.sqlite",
  synchronize: true,
  logging: false,
  entities: [User],
  migrations: [],
  subscribers: [],
})


export default SqliteDataSource;
