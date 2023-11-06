import fs from 'node:fs';
// import fs from 'node:fs/promises';

export function readBase64(filepath) {
  filepath = filepath || '../asset/logo.png';
  fs.readFile(filepath, 'binary', (err, data) => {
    if (err) {
      console.log(err)
    } else {
        const buffer = Buffer.from(data, 'binary');
        let val = 'data: image/'+ 'png' +';base64,' + buffer.toString('base64');
        console.log(val)
    }
  })
}
