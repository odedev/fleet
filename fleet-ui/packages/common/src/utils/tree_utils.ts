


export function getTreeCascade(data: any, nameField: string = 'name') {
  let cascade = '';
  const delimiter: string = ' > '
  const labels = [];
  let item = data;
  while (item) {
    labels.unshift(item[nameField]);
    item = item.parent;
  }
  cascade = labels.join(delimiter);
  return cascade;
}
