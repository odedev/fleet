import * as changeCase from "change-case";


// snake_case
// lower_underscore
export function lowerUnderscore(word: string): string {
  return changeCase.snakeCase(word);
}

// UpperCamelCase
// UpperCamel
export function upperCamel(word: string): string {
    return changeCase.pascalCase(word);
}

// UPPER_UNDERSCORE
export function UPPER_UNDERSCORE(word: string): string {
    return changeCase.constantCase(word);
}

// lowerCamelCase
// lowerCamel
export function lowerCamel(word: string): string {
    return changeCase.camelCase(word);
}
