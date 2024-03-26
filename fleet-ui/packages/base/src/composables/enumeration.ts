import metadata from "../core/metadata";

export function useEnumeration(name: string): any {
  return metadata.getEnumeration(name);
};
