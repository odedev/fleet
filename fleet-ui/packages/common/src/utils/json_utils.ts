/**
 * 复制
 * @param json
 * @return json
 */
export function copy(json: any): any {
  if (json === null) {
    return null;
  }
  let data: any = null;
  data = JSON.parse(JSON.stringify(json));
  return data;
}

