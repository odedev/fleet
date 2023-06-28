import * as changeCase from "change-case";

// snake_case
// lower_underscore
export function lowerUnderscore(word) {
  return changeCase.snakeCase(word);
}

// UpperCamelCase
// UpperCamel
export function upperCamel(word) {
    return changeCase.pascalCase(word);
}

// UPPER_UNDERSCORE
export function UPPER_UNDERSCORE(word) {
    return changeCase.constantCase(word);
}

// lowerCamelCase
// lowerCamel
export function lowerCamel(word) {
    return changeCase.camelCase(word);
}
