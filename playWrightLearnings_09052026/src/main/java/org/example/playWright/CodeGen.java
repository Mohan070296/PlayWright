package org.example.playWright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class CodeGen {
    public void codeGenerator() {
                try (Playwright playwright = Playwright.create()) {
                    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                            .setHeadless(false));
                    BrowserContext context = browser.newContext();
                    Page page = context.newPage();
                    page.navigate("https://demo.playwright.dev/todomvc/#/");
                    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("What needs to be done?")).click();
                    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("What needs to be done?")).fill("Hello");
                    page.getByText("This is just a demo of").click();
                    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("What needs to be done?")).fill("Hello ");
                    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("What needs to be done?")).click();
                    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("What needs to be done?")).fill("Hello welcome");
                }
            }
        }

