package com.bootcamp.screenplay.tasks;

import com.bootcamp.screenplay.pages.FalabellaSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BuscarProducto implements Task {
    private final String term;

    public BuscarProducto(String term) {
        this.term = term;
    }


    public static BuscarProducto using(String term) {
        return instrumented(BuscarProducto.class, term);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FalabellaSearchPage.INPUT_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(term).into(FalabellaSearchPage.INPUT_BUSQUEDA),
                Click.on(FalabellaSearchPage.BTN_BUSCAR)

        );

    }
}

