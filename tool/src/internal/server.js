import http from "node:http";
import pc from "picocolors"
import app from "./app.js";
import wss from "./ws.js";

const server = http.createServer(app);


server.on('upgrade', function upgrade(request, socket, head) {
  socket.on('error', console.error);

  wss.handleUpgrade(request, socket, head, function done(ws) {
    wss.emit('connection', ws, request);
  });

  // // This function is not defined on purpose. Implement it with your own logic.
  // authenticate(request, function next(err, client) {
  //   if (err || !client) {
  //     socket.write('HTTP/1.1 401 Unauthorized\r\n\r\n');
  //     socket.destroy();
  //     return;
  //   }

  //   socket.removeListener('error', console.error);

  //   wss.handleUpgrade(request, socket, head, function done(ws) {
  //     wss.emit('connection', ws, request, client);
  //   });
  // });
});

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
  console.log(pc.green(`listening on ${bind} `))
});

// server.listen(23506);

// export default server

function serve() {
  server.listen(23506);
}

export default serve
