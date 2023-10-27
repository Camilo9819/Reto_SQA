package com.prueba.task;

import com.prueba.ui.AgregarUI;
import com.prueba.ui.EliminarUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarProductosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(EliminarUI.BTN_CUMPLEAÑOS),
                Click.on(EliminarUI.PRODUCTO_CUMPLEAÑOS_UNO),
                        Click.on(EliminarUI.BTN_AÑADIR_CARRITO),
                        Click.on(EliminarUI.BTN_ELIMINAR)
        );

    }
    public static Performable EliminarCarrito(){
        return instrumented(EliminarProductosTask.class);
    }
}
