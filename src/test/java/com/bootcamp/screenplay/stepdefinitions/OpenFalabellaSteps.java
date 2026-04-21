package com.bootcamp.screenplay.stepdefinitions;

import com.bootcamp.screenplay.pages.FalabellaDetailPage;
import com.bootcamp.screenplay.pages.FalabellaSearchPage;
import com.bootcamp.screenplay.questions.PaginaCargada;
import com.bootcamp.screenplay.tasks.BuscarProducto;
import com.bootcamp.screenplay.tasks.OpenFalabellaHome;
import com.bootcamp.screenplay.tasks.SeleccionarProducto;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Managed; // Importante
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is; // Mejor usar is()

public class OpenFalabellaSteps {

    @Managed
    WebDriver url;

    @Before
    public void setStage() {
        OnStage.setTheStage(Cast.ofStandardActors());
    }


    @Dado("que el usuario abre la página de Falabella")
    public void abrirPagina() {
        OnStage.theActorCalled("Edwin")
                .can(BrowseTheWeb.with(url))
                .attemptsTo(OpenFalabellaHome.enLaPagina());
    }

    @Cuando("busca el producto {string}")
    public void buscarProducto(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarProducto.using(producto)
        );
    }

    @Y("selecciona el primer resultado de la búsqueda")
    public void seleccionarResultado() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.elPrimero()
        );
    }

    @Entonces("debería ver la página de detalle del producto")
    public void validarDetalle() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(FalabellaDetailPage.BTN_AGREGAR_CARRITO), isVisible())
        );
    }
}