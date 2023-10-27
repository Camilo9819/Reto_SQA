package com.prueba.task;

import com.prueba.ui.AgregarUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(AgregarUI.BTN_AMOR),
                Click.on(AgregarUI.PRODUCTO_UNO),
                Click.on(AgregarUI.CONFIRMACION_PRODUCTO_UNO),
                Click.on(AgregarUI.SEGUIR_COMPRANDO),
                Click.on(AgregarUI.PRODUCTO_DOS),
                Click.on(AgregarUI.CONFIRMACION_PRODUCTO_DOS)
        );
}

    public static Performable AgregarCarrito() {
        return instrumented(AgregarProductosTask.class);
   }
}

