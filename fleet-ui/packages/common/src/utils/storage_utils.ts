import {isJsonString} from "@/utils/is_utils";


export function setItem(key: string, value: any) {
  let data = value
  if (value && typeof value === 'object') {
    data = JSON.stringify(value)
  }
  localStorage.setItem(key, data)
}

export function getItem(key: string) {
  let data = localStorage.getItem(key)
  if (data && isJsonString(data)) {
    data = JSON.parse(data)
  }
  return data
}

export function removeItem(key: string) {
  localStorage.removeItem(key)
}

export function clear() {
  localStorage.clear()
}
