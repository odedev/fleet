interface ResourceFile {
  id: string,
  name: string,
  size: number,
  type: string,
  path: string,
  url: string,
  location: number,
  directory: string,
  category?: string,
  status?: string,
  scope?: string,
}
