package com.bootcamp.screenplay.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaDetailPage {
    public static final Target NOMBRE_PRODUCTO = Target.the("nombre del producto en el detalle")
            .locatedBy("//h1[contains(@class,'product-name')]");

    public static final Target BTN_AGREGAR_CARRITO = Target.the("botón agregar al carrito")
            .locatedBy("//button[contains(@id, 'add-to-cart')]");
}
