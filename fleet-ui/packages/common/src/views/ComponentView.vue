<script setup>
import {compileScript, compileTemplate, parse, } from 'vue/compiler-sfc';

function getBlobURL(jsCode) {
  const blob = new Blob([jsCode], {type: 'text/javascript'});
  const blobURL = URL.createObjectURL(blob);
  return blobURL;
}

let sfc = `
<template>
  <div class="message">{{ message }}</div>
</template>

<script>
import { ref } from "vue";

export default {
  name: "Main",
  setup() {
    const message = ref("Main");
    return {
      message,
    };
  },
};

`

const {descriptor, errors} = parse(sfc);
console.log(descriptor);


const id = 'dsdsdsd';
const hasScoped = descriptor.styles.some(e => e.scoped);
const scopeId = hasScoped ? `data-v-${id}` : undefined;
const templateOptions = {
  id,
  source: descriptor.template.content,
  filename: descriptor.filename,
  scoped: hasScoped,
  slotted: descriptor.slotted,
  compilerOptions: {
    scopeId: hasScoped ? scopeId : undefined,
    mode: 'module',
  },
};
const script = compileScript(descriptor, {id, templateOptions, sourceMap:true});
const template = compileTemplate({...templateOptions, sourceMap: true});
console.log(script, template);

const moduleCode = `
  import script from '${getBlobURL(script.content)}';
  import {render} from '${getBlobURL(template.code)}';
  script.render = render;
  script.__file = 'demo.vue'
  script.__scopeId = 'dsd'
  export default script;
  `;

console.log(moduleCode);

</script>

<template>
  <main>
    <div class="message">{{ message }}</div>
  </main>
</template>
