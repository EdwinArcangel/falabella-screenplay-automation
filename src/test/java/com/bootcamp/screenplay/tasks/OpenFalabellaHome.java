package com.bootcamp.screenplay.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Tasks;

public class OpenFalabellaHome implements Task {

    @Override
    @Step("{0} abre la página principal de Falabella") // Sin la 'p' extra
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co")
        );
    }

    public static OpenFalabellaHome enLaPagina() {
        return Tasks.instrumented(OpenFalabellaHome.class);
    }
}