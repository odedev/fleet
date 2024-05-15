<script setup>
import {parse, compileScript, compileTemplate, compileStyle, rewriteDefault} from 'vue/compiler-sfc';

const message = 'component'

function getBlobURL(jsCode) {
  const blob = new Blob([jsCode], {type: 'text/javascript'});
  const blobURL = URL.createObjectURL(blob);
  return blobURL;
}

let sfc = `
<template>
  <div class="message">{{ message }}</div>
</template>

<script >
export default {
  name: "Main",
  data() {
    return {
      message: 'sfc-message',
    };
  },
};

`
sfc += '<\/script >'

const id = 'dsdsdsd';
// const hasScoped = descriptor.styles.some(e => e.scoped);
const hasScoped = false;
const scopeId = hasScoped ? `data-v-${id}` : undefined;
// const templateOptions = {
//   id,
//   source: descriptor.template.content,
//   filename: descriptor.filename,
//   scoped: hasScoped,
//   slotted: descriptor.slotted,
//   compilerOptions: {
//     scopeId: hasScoped ? scopeId : undefined,
//     mode: 'module',
//   },
// };
// const script = compileScript(descriptor, {id, templateOptions, sourceMap:true});





// const moduleCode = `
//   import script from '${getBlobURL(script.content)}';
//   import {render} from '${getBlobURL(template.code)}';
//   script.render = render;
//   script.__file = 'demo.vue'
//   script.__scopeId = 'dsd'
//   export default script;
//   `;
//
// console.log(moduleCode);
doCompile('a.vue', sfc)

function doCompile(filename, code) {
  let compiled = {
    js: '',
    css: '',
    ssr: '',
  };

  const {descriptor, errors} = parse(sfc, {
    filename: filename,
    sourceMap: true,
  });

  if (errors.length) {
    console.warn(errors)
    return errors
  }

  const hasScoped = descriptor.styles.some((s) => s.scoped)
  let clientCode = ''
  let clientScript = ''
  let bindings = ''

  try {
    ;[clientScript, bindings] = doCompileScript(descriptor)
  } catch (e) {
    return [e.stack.split('\n').slice(0, 12).join('\n')]
  }

  compiled.js = clientScript

  compiled.ssr = doCompileTemplate(descriptor, bindings);

  compiled.css = doCompileStyle(descriptor);

  console.log(compiled)
}


function doCompileScript(descriptor) {
  const COMP_IDENTIFIER = `__sfc__`;
  let code = '';
  let expressionPlugins = false;

  const compiledScript = compileScript(descriptor, {
    id: id,
    inlineTemplate: true,
    ssr: false,
    ssrCssVars: descriptor.cssVars,
    templateOptions: {
      allowJs: true,
      checkJs: true,
      jsx: 'Preserve',
      target: 'ESNext',
      module: 'ESNext',
      moduleResolution: 'Bundler',
      allowImportingTsExtensions: true,
      // expressionPlugins: false,
    }
  });

  if (compiledScript.bindings) {
    code += `\n/* Analyzed bindings: ${JSON.stringify(
      compiledScript.bindings,
      null,
      2
    )} */`;
  }
  code +=
    `\n` +
    rewriteDefault(
      compiledScript.content,
      COMP_IDENTIFIER,
    );
  return [code, compiledScript.bindings]

}

function doCompileTemplate(descriptor, bindingMetadata) {
  const COMP_IDENTIFIER = `__sfc__`;

  let ssr = false;
  let { code, errors } = compileTemplate({
    id: id,
    source: descriptor.template?.content,
    filename: descriptor.filename,
    scoped: hasScoped,
    slotted: descriptor.slotted,
    ssr: false,
    isProd: false,
    sourceMap: true,
    compilerOptions: {
      allowJs: true,
      checkJs: true,
      jsx: 'Preserve',
      target: 'ESNext',
      module: 'ESNext',
      moduleResolution: 'Bundler',
      allowImportingTsExtensions: true,
      bindingMetadata: bindingMetadata,
    }
  });

  if (errors.length) {
    return errors
  }

  const fnName = ssr ? `ssrRender` : `render`

  code =
    `\n${code.replace(
      /\nexport (function|const) (render|ssrRender)/,
      `$1 ${fnName}`
    )}` + `\n${COMP_IDENTIFIER}.${fnName} = ${fnName}`

  console.log(code);

  return code;
}

function doCompileStyle(descriptor) {
  let css = ''
  for (const style of descriptor.styles) {
    const styleResult = compileStyle({
      filename: '',
      id: '',
      source: style.content,
      scoped: style.scoped,
      modules: !!style.module,
    });
    if (styleResult.errors.length) {
      // postcss uses pathToFileURL which isn't polyfilled in the browser
      // ignore these errors for now
      if (!styleResult.errors[0].message.includes('pathToFileURL')) {
      }
      // proceed even if css compile errors
    } else {
      css += styleResult.code + '\n'
    }
  }
  if (css) {
    css = css.trim()
  } else {
    css = '/* No <style> tags present */'
  }
  return css;
}
</script>

<template>
  <main>
    <div class="message">{{ message }}</div>
  </main>
</template>
