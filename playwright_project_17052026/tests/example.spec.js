import { test, expect } from '@playwright/test';

test('first', async ({ page }) => {
  await page.goto('http://localhost:3000/');
  await page.getByText('Edit src/App.js and save to reload.Learn React').click();
  await page.getByText('Edit src/App.js and save to').click();
});

test('second', async ({ page }) => {
  await page.goto('http://localhost:3000/');
  await page.getByText('Edit src/App.js and save to reload.Learn React').click();
  await page.getByText('Edit src/App.js and save to').click();
});