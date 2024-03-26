import dayjs from "dayjs";

export function format(date: Date | string, format: string = 'YYYY-MM-DD HH:mm:ss'): string {
  return dayjs(date).format(format);
}
