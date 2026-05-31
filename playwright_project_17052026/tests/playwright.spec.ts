import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://playwright.dev/');
  await page.getByRole('link', { name: 'Docs' }).click();
  await page.getByRole('link', { name: 'How to install Playwright' }).click();
  await page.getByRole('link', { name: 'Write tests using web-first' }).click();
  await page.getByRole('link', { name: 'How to write the first test' }).click();
  await page.getByRole('button', { name: 'Copy code to clipboard' }).first().click();
  await page.getByRole('link', { name: 'Playwright logo Playwright' }).click();
});