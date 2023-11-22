
// export function debounce(fn: Function, n = 100) {
//   let handle: any
//   return (...args: any[]) => {
//     if (handle) clearTimeout(handle)
//     handle = setTimeout(() => {
//       fn(...args)
//     }, n)
//   }
// }


export function debounce(fn: Function, n: number = 100, immediate: boolean = true) {
  let handle: any
  return (...args: any[]) => {
    if (handle) clearTimeout(handle)
    if (immediate) {
      if (!handle) {
        fn(...args)
      }
      handle = setTimeout(() => {
        // fn(...args)
        handle = null
      }, n)
    } else {
      handle = setTimeout(() => {
        fn(...args)
      }, n)
    }
  }
}

// 等待
export function sleep(time: number) {
  return new Promise((resolve) => {
    setTimeout(resolve, time);
  })
}
