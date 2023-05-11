import http from "node:http";
import app from "./src/app.js";


http.createServer(app.callback()).listen(3000);
