import CryptoJS from "crypto-js";


// 密钥 (需要前端和后端保持一致)十六位作为密钥
const KEY = "secret key 123"
// 密钥偏移量 (需要前端和后端保持一致)十六位作为密钥偏移量
const IV = "secret key 123"

// 加密
function encryptAES(clear: any, secret: any) {
  let key = secret ? secret.substring(0, 16) : KEY;
  let iv = secret ? secret.substring(16) : IV;

  key = CryptoJS.enc.Utf8.parse(key)
  iv = CryptoJS.enc.Utf8.parse(iv)

  let text = CryptoJS.enc.Utf8.parse(clear);
  let encrypted = CryptoJS.AES.encrypt(text, key, {
    iv: iv,
    mode: CryptoJS.mode.CBC,
    padding: CryptoJS.pad.Pkcs7
  })
  return encrypted.toString()
}

// 解密
function decryptAES(text: any, secret: any) {
  let key = secret ? secret.substring(0, 16) : KEY;
  let iv = secret ? secret.substring(16) : IV;

  key = CryptoJS.enc.Utf8.parse(key)
  iv = CryptoJS.enc.Utf8.parse(iv)

  let decrypted = CryptoJS.AES.decrypt(text, key, {
    iv: iv,
    mode: CryptoJS.mode.CBC,
    padding: CryptoJS.pad.Pkcs7
  })
  return decrypted.toString(CryptoJS.enc.Utf8)
}
