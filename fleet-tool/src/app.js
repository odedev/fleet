import app from './core/app.js';
import serve from "./core/server.js";
import AppDataSource from "./core/datasource.js";
import {notFoundHandler, errorHandler} from './core/request.js';
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
