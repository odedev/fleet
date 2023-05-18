import http from "node:http";
import app from "./src/app.js";

const server = http.createServer(app.callback());

server.listen(3000);

server.on('error', error => {
  if (error.syscall !== 'listen') {
    throw error;
  }

  const bind = 'Port';

  // handle specific listen errors with friendly messages
  switch (error.code) {
    case 'EACCES':
      console.error(bind + ' requires elevated privileges');
      process.exit(1);
      break;
    case 'EADDRINUSE':
      console.error(bind + ' is already in use');
      process.exit(1);
      break;
    default:
      throw error;
  }
});

server.on('listening', () => {
  const addr = server.address();
  const bind = typeof addr === 'string' ? 'pipe ' + addr : 'port ' + addr.port;
  debug('Listening on ' + bind);
});
