import app from './internal/app.js';
import serve from "./internal/server.js";
import AppDataSource from "./internal/datasource.js";
import { notFoundHandler, errorHandler } from './internal/middleware.js';
import router from './modules/router.js';
import proxy from './modules/proxy.js';

export default function run() {
  app.use('', router);
  app.use('/proxy', proxy);

  app.use(notFoundHandler);
  app.use(errorHandler);

  // run
  AppDataSource.initialize()
    .then(() => {
      serve();
    })
    .catch(err => {
      console.warn(err)
      process.exit(2);
    });
}
