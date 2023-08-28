

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

export function readAsBinaryString(file: Blob): Promise<any> {
  return new Promise((resolve, reject) => {
    const fileReader = new FileReader();
    fileReader.onload = function (data) {
      const result = data.target?.result;
      resolve(result);
    }
    fileReader.onerror = function (err) {
      reject(err);
    }
    fileReader.readAsBinaryString(file)
  })
}

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
