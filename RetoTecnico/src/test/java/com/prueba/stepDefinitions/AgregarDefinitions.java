package com.prueba.stepDefinitions;

import com.prueba.questions.Verificar;
import com.prueba.task.AgregarProductosTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que Camilo quiera agregar productos de la categria amor")
    public void queCamiloQuieraAgregarProductosDeLaCategriaAmor() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @Cuando("le de click a los productos")
    public void leDeClickALosProductos() {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductosTask.AgregarCarrito()
        );
    }
    @Entonces("pueda verlos en el carrito de compras")
    public void puedaVerlosEnElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        Verificar.resultados(), Matchers.equalTo(true)
                )
        );
    }
}
