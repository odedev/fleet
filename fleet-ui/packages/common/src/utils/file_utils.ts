
/**
 * 读取文件
 * @param file 文件
 * @returns URL 格式的字符串（base64 编码）以表示所读取文件的内容。
 */
export function readAsDataURL(file: Blob): Promise<any> {
  return new Promise((resolve, reject) => {
    const fileReader = new FileReader();
    fileReader.onload = function (data) {
      const result = data.target?.result;
      resolve(result);
    }
    fileReader.onerror = function (err) {
      reject(err);
    }
    fileReader.readAsDataURL(file)
  })
}

/**
 *
 * @param file
 * @returns 一个 ArrayBuffer 对象 以表示所读取文件的数据
 */
export function readAsArrayBuffer(file: Blob): Promise<any> {
  return new Promise((resolve, reject) => {
    const fileReader = new FileReader();
    fileReader.onload = function (data) {
      const result = data.target?.result;
      resolve(result);
    }
    fileReader.onerror = function (err) {
      reject(err);
    }
    fileReader.readAsArrayBuffer(file)
  })
}

/**
 *
 * @param file
 * @returns 根据特殊的编码格式转化为内容 (字符串形式)
 */
export function readAsText(file: Blob): Promise<any> {
  return new Promise((resolve, reject) => {
    const fileReader = new FileReader();

    fileReader.addEventListener("load", event => {
      const result = event.target?.result;
      resolve(result);
    });
    fileReader.addEventListener("loadend", event => {

    });
    fileReader.addEventListener("error", event => {
      reject(event);
    });

    fileReader.readAsText(file, 'utf-8')
  })
}

/**
 * 读取文件的 base64 格式
 * @param file
 * @returns
 */
export async function readAsBase64(file: Blob): Promise<any> {
  return await readAsDataURL(file);
}


/**
 * 读取文件的 URL
 * @param file
 * @returns 创建一个 DOMString，其中包含一个表示参数中给出的对象的 URL
 */
export async function readAsURL(file: Blob): Promise<string> {
  return URL.createObjectURL(file);
}
