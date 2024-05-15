import mime from 'mime-types';


function lookup(filenameOrExt: string): string | false {
  return mime.lookup(filenameOrExt)
}

function contentType(filenameOrExt: string): string | false {
  return mime.contentType(filenameOrExt)
}


function extension(typeString: string): string | false {
  return mime.extension(typeString)
}


function types(typeString: string): any {
  return mime.types
}
