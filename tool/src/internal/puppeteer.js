import puppeteer from 'puppeteer';

export async function runBrowser(exec) {
  const browser = await puppeteer.launch();

  if (exec instanceof Function) {
    await exec(browser);
  }

  await browser.close()
}
