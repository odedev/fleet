import httpErrors from "http-errors";

export function clientRequestHandler(req, res, next) {
  const ip = req.get('X-Forwarded-For') ?? req.ip ?? req.socket.remoteAddress;
  const method = req.method;
  const url = req.originalUrl;
  const params = req.params;

  console.log(ip, method, url, params);

  next();
};

// catch 404 and forward to error handler
export function notFoundHandler(req, res, next) {
  next(httpErrors(404));
  // res.locals.message = '404';
  // res.status(404);
  // res.render('not-found');
};

// error handler
export function errorHandler(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
};
