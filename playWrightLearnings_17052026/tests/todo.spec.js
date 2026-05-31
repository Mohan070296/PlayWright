import { test, expect } from '@playwright/test';

test('youtube', async ({ page }) => {
  await page.goto('https://www.youtube.com/');
  await page.getByRole('combobox', { name: 'Search' }).click();
  await page.getByRole('combobox', { name: 'Search' }).fill('Playwright');
  await page.getByRole('combobox', { name: 'Search' }).press('Enter');
  await page.goto('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252Ffeed%252Flibrary&dsh=S1530076551%3A1779027332292639&hl=en&passive=true&service=youtube&uilel=3&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWa2PatXXPuCBpVRpwdACj-7pRL68vL0RBNZla-hotvN-b-2DNjOzDQVx9dvCn898CFqd7IzRbNMlQ');
  await page.getByRole('button', { name: 'Create account' }).click();
  await page.getByRole('button', { name: 'Create account' }).click();
  await page.getByRole('button', { name: 'Create account' }).click();
  await page.getByText('For my personal use').click();
});