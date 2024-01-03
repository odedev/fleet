interface Enumeration {
  code: string,
  name: string,
  fullName: string,
  description?: string,
  module: any,
  values: EnumerationValue[]
}

interface EnumerationValue {
  code: string,
  name: string,
  value: number,
  enumeration: Enumeration,
}
