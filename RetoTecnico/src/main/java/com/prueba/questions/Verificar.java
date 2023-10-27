package com.prueba.questions;

import com.prueba.ui.VerificarUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {

    public static Verificar resultados(){
        return new Verificar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VerificarUI.CARRITO.resolveFor(actor).isVisible();
    }
}
