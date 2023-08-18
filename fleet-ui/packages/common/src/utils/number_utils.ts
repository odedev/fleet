import BigNumber from "bignumber.js";

// Rounding mode
// ROUND_UP          0  Rounds away from zero
// ROUND_DOWN        1  Rounds towards zero
// ROUND_CEIL        2  Rounds towards Infinity
// ROUND_FLOOR       3  Rounds towards -Infinity
// ROUND_HALF_UP     4  Rounds towards nearest neighbour. If equidistant, rounds away from zero
// ROUND_HALF_DOWN   5  Rounds towards nearest neighbour. If equidistant, rounds towards zero
// ROUND_HALF_EVEN   6  Rounds towards nearest neighbour. If equidistant, rounds towards even neighbour
// ROUND_HALF_CEIL   7  Rounds towards nearest neighbour. If equidistant, rounds towards Infinity
// ROUND_HALF_FLOOR	 8  Rounds towards nearest neighbour. If equidistant, rounds towards -Infinity


/**
 * 加
 * @param x
 * @param y
 */
export function add(x: number, y: number): number {
  const a = new BigNumber(x);
  const b = a.plus(y);
  return b.toNumber();
}

/**
 * 减
 * @param x
 * @param y
 */
export function minus(x: number, y: number): number {
  const xx = new BigNumber(x);
  const result = xx.minus(y);
  return result.toNumber();
}

/**
 * 乘
 * @param x
 * @param y
 */
export function multiplied(x: number, y: number): number {
  const a = new BigNumber(x);
  const b = a.multipliedBy(y);
  return b.toNumber();
}

/**
 * 除
 * @param x
 * @param y
 */
export function divided(x: number, y: number): number {
  const a = new BigNumber(x);
  const b = new BigNumber(y);
  const c = a.dividedBy(b);

  return c.toNumber();
}

/**
 * 取余
 * @param x
 * @param y
 */
export function modulo(x: number, y: number): number {
  const a = new BigNumber(x);
  const b = a.modulo(y);
  return b.toNumber();
}

/**
 * 固定精度
 * @param x
 * @param precision
 * @param roundingMode
 */
export function fixed(x: number, precision: number = 2, roundingMode: number = BigNumber.ROUND_HALF_UP): string {
  const a = new BigNumber(x);
  const b = a.toFixed(precision, BigNumber.ROUND_HALF_UP);
  return b;
}

/**
 * 格式化
 * @param x
 */
export function format(x: number): string {
  const a = new BigNumber(x);
  return a.toFormat();
}


export function precision(x: number): number {
  const a = new BigNumber(x)
  return a.precision();
}
