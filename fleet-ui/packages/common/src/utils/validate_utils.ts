

/**
 * 手机号验证
 * @param value
 */
export function isPhone (value: string): boolean {
  const pattern = /^1[0-9]{10}$/;
  return pattern.test(value);
}

/**
 * 邮箱验证
 * @param value
 */
export function isEmail(value: string): boolean {
  const pattern = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$/;
  return pattern.test(value);
}

/**
 * IPV4 验证
 * @param value
 */
export function isIP(value: string): boolean {
  const pattern =
    /^(?:(?:2[0-4][0-9]\.)|(?:25[0-5]\.)|(?:1[0-9][0-9]\.)|(?:[1-9][0-9]\.)|(?:[0-9]\.)){3}(?:(?:2[0-4][0-9])|(?:25[0-5])|(?:1[0-9][0-9])|(?:[1-9][0-9])|(?:[0-9]))$/;
  return pattern.test(value)
}

/**
 * 用户名验证: 4 到 16 位(字母，数字，下划线，减号)
 * @param value
 */
export function isUsername(value: string): boolean {
  const pattern = /^[a-zA-Z0-9_-]{4,16}$/;
  return pattern.test(value);
}

/**
 * 密码验证: 6-16 位 的数字，字母，下划线组成
 * @param value
 * @returns
 */
export function isPassword(value: string): boolean {
  const pattern = /[a-zA-Z0-9_]{6,16}/;
  return pattern.test(value);
}

/**
 * 密码验证: 6-16 位 的数字，字母，下划线, @ 组成, 不能只有数字或只有字母
 * @param value
 * @returns
 */
export function isPasswordStrong(value: string): boolean {
  const pattern = /^(?![0-9]+$)(?![a-zA-Z]+$)[a-zA-Z0-9_@]{6,16}/;
  return pattern.test(value);
}

/**
 * 真实姓名: 2-6位的汉字组成
 * @param value
 * @returns
 */
export function isName(value: string): boolean {
  const pattern = /^\u4e00-\u9fa5{1,5}$/;
  return pattern.test(value);
}

/**
 * 昵称: 以汉字或字母开头，有3-18位数字，字母，下划线，汉字组成
 * @param value
 * @returns
 */
export function isNickname(value: string): boolean {
  const pattern = /^\u4e00-\u9fa5a-zA-Z{2,17}/;
  return pattern.test(value);
}
