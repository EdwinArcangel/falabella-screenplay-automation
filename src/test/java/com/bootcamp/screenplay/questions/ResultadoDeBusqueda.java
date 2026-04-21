package com.bootcamp.screenplay.questions;

import com.bootcamp.screenplay.pages.FalabellaSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question; // IMPORTANTE: Agregar esta importación
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ResultadoDeBusqueda implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        // Espera explícita
        actor.attemptsTo(
                WaitUntil.the(FalabellaSearchPage.MSJ_NO_RESULTADOS, isVisible()).forNoMoreThan(10).seconds()
        );
        return Text.of(FalabellaSearchPage.MSJ_NO_RESULTADOS).answeredBy(actor);
    }

    public static ResultadoDeBusqueda texto() {
        return new ResultadoDeBusqueda();
    }
}