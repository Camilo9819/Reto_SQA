package com.prueba.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarUI {
    public static final Target BTN_CUMPLEAÑOS = Target.the("El usuario da click en el boton amor").located(By.xpath("//*[@id=\"primary-menu\"]/li[3]"));
    public static final Target PRODUCTO_CUMPLEAÑOS_UNO = Target.the("El usuario da click en el boton amor").located(By.xpath("//*[@id=\"primary-menu\"]/li[3]"));
    public static final Target BTN_AÑADIR_CARRITO = Target.the("El usuario da click en el boton amor").located(By.xpath("//*[@id=\"primary-menu\"]/li[3]"));
    public static final Target BTN_ELIMINAR = Target.the("El usuario da click en el boton amor").located(By.xpath("//*[@id=\"primary-menu\"]/li[3]"));

}
