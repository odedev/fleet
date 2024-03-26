
/**
 * 数据脱敏
 * @param text
 */
export function mask(text: string): string {
  const data: string = '';

  return data;
}

export function trim(text: string): string {
  let data: string = text;
  if (text) {
    data = text.trim();
  }
  return data;
}

export function trimStart(text: string): string {
  let data: string = text;
  if (text) {
    data = text.trimStart();
  }
  return data;
}

export function trimEnd(text: string): string {
  let data: string = text;
  if (text) {
    data = text.trimEnd();
  }
  return data;
}
