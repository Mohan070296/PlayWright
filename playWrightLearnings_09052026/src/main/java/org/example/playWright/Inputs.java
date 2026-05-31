package org.example.playWright;

import com.microsoft.playwright.*;

public class Inputs {
    public void getInputs() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        Page page = browser.newPage();
        page.navigate("https://letcode.in/edit");
        page.locator("#fullName").fill("Mohan");
        Locator locator = page.locator("#join");
        locator.fill("Join");

        String attribute = page.locator("id=getMe").getAttribute("value");
        System.out.println("Attribute value : " + attribute);

        page.locator("id=clearMe").clear();
    }
}
