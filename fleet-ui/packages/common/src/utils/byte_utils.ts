import bytes from 'bytes';


// b for bytes
// kb for kilobytes
// mb for megabytes
// gb for gigabytes
// tb for terabytes
// pb for petabytes


export function format(value: number): string | null {
  return bytes.format(value);
}

export function parse(value: number | string): number | null {
  return bytes.parse(value);
}
