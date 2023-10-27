package com.prueba.stepDefinitions;

import com.prueba.task.AgregarProductosTask;
import com.prueba.task.EliminarProductosTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteDefinitions {

    @Dado("que Camilo quiera agregar un producto de la categria cumpleaños")
    public void queCamiloQuieraAgregarUnProductoDeLaCategriaCumpleanos() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }

    @Cuando("le de click para agregar al carrito un producto de la categoria cumpleaños")
    public void leDeClickParaAgregarAlCarritoUnProductoDeLaCategoriaCumpleanos() {
        theActorInTheSpotlight().attemptsTo(
                EliminarProductosTask.EliminarCarrito()
        );

    }

    @Entonces("pueda eliminarlo posteriormente del carrito de compras")
    public void puedaEliminarloPosteriormenteDelCarritoDeCompras() {


    }




}
