package com.bootcamp.screenplay.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaHomePage {

    public static final Target LOGO = Target.the("logo de falabella")
            .located(By.cssSelector("a[id*='logo']"));
}