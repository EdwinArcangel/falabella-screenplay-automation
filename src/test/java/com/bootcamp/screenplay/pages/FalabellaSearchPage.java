package com.bootcamp.screenplay.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaSearchPage {
    public static final Target INPUT_BUSQUEDA = Target.the("campo para buscar productos")
            .located(By.id("testId-SearchBar-Input"));

    public static final Target BTN_BUSCAR = Target.the("boton buscar")
            .locatedBy("//button[contains(@class,'searchBtnIcon')]");

    public static final Target PRIMER_PRODUCTO = Target.the("primer producto de la lista")
            .locatedBy("(//div[@id='testId-searchResults-products']//picture)[1]");

    public static final Target MSJ_NO_RESULTADOS = Target.the("mensaje de no resultados")
            .locatedBy("//h3[contains(., 'Lo sentimos, no encontramos resultados')]");

}