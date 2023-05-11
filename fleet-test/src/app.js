import path from "node:path";
import {fileURLToPath} from "node:url";

import Koa from "koa";
import { koaBody } from "koa-body";
import views from "koa-views";
import serve from "koa-static";
import cors from "@koa/cors";
import responseTime from "koa-response-time";
import router from "./router/index.js";

// 执行命令的目录
const __rootDirname = path.resolve();
// 当前文件的目录
const __dirname = path.dirname(fileURLToPath(import.meta.url));

const app = new Koa();

app.use(koaBody());
app.use(serve(__rootDirname + "/public", {}));
app.use(views(path.join(__dirname, '/views'), { extension: 'hbs', map: { hbs: 'handlebars' } }));
app.use(cors());
app.use(responseTime({ hrtime: true }));

app
  .use(router.routes())
  .use(router.allowedMethods());

console.log(__dirname)
export default app;
