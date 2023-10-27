package com.prueba.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificarUI {
    public static final Target CARRITO = Target.the("Carrito").located(By.xpath("// a [@class=\"dropdown-toggle mini-cart\"]"));

}
