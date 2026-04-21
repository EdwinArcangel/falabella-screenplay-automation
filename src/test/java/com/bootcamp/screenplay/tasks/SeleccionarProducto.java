package com.bootcamp.screenplay.tasks;

import com.bootcamp.screenplay.pages.FalabellaSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FalabellaSearchPage.PRIMER_PRODUCTO, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(FalabellaSearchPage.PRIMER_PRODUCTO)
        );
    }

    public static SeleccionarProducto elPrimero() {
        return instrumented(SeleccionarProducto.class);
    }
}