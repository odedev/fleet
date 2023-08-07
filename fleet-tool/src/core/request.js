import httpErrors from "http-errors";

// catch 404 and forward to error handler
export function notFoundHandler(req, res, next) {
  next(httpErrors(404));
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
