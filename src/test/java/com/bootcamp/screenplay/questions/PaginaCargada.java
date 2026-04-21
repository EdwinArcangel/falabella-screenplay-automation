package com.bootcamp.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.bootcamp.screenplay.pages.FalabellaHomePage.LOGO;

public class PaginaCargada implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LOGO).answeredBy(actor);
    }

    public static PaginaCargada esVisible() {
        return new PaginaCargada();
    }
}