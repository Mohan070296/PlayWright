package org.example.playWright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Title {
    public void printTitle() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        Page page = browser.newPage();
        page.navigate("https://playwright.dev/java");

        System.out.println("Title : " + page.title());

        page.close();
        browser.close();
        playwright.close();
    }
}
