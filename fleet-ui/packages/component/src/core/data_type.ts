
export function getInitValue(dataType: number): any {
  switch (dataType) {
    case 0:
      return false;
    case 1:
      return "";
    case 2:
      return "";
    case 3:
      return 0;
    case 4:
      return 0;
    case 5:
      return null;
    case 6:
      return null;
    case 7:
      return null;
    case 8:
      return null;
    case 9:
      return null;
    default:
      return null;
  }
}
