
export function ok(data) {
  return {
    code: 200,
    title: '',
    message: '',
    data: data,
  };
}

export function error(err) {
  return {
    code: 500,
    title: '',
    message: '',
    error: err,
  };
}
