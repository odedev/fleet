
export function downloadForBlob(data: Blob, filename: string) {
  const url = window.URL.createObjectURL(data);
  var downloadElement = document.createElement("a");
  downloadElement.href = url;
  downloadElement.download = filename;
  document.body.appendChild(downloadElement);
  downloadElement.click();
  document.body.removeChild(downloadElement);
  window.URL.revokeObjectURL(url);
}


export function downloadForURL(url: string, filename: string) {
  const ele = document.createElement("a");
  ele.href = url;
  ele.download = filename;
  ele.setAttribute('download', filename || '')
  document.body.appendChild(ele);
  ele.click();
  document.body.removeChild(ele);
}
