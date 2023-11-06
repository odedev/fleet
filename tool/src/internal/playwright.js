import { chromium, firefox, webkit } from '@playwright/test';


export async function getChromiumBrowser() {
  const browser = await chromium.launch();
  return browser;
}


export async function getFirefoxBrowser() {
  const browser = await firefox.launch();

  return browser;
}


export async function getWebkitBrowser() {
  const browser = await webkit.launch();

  return browser;
}

export async function runChromium(exec) {
  const browser = await chromium.launch();

  if (exec instanceof Function) {
    await exec(browser);
  }

  await browser.close()
}

export async function runFirefox(exec) {
  const browser = await chromium.launch();

  if (exec instanceof Function) {
    await exec(browser);
  }

  await browser.close()
}

export async function runWebkit(exec) {
  const browser = await chromium.launch();

  if (exec instanceof Function) {
    await exec(browser);
  }

  await browser.close()
}
