package com.prueba.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarUI {

    public static final Target BTN_AMOR = Target.the("El usuario da click en el boton amor").located(By.xpath("//*[@id=\"primary-menu\"]/li[3]"));
    public static final Target PRODUCTO_UNO = Target.the("El usuario escoge un producto").located(By.xpath("//a[@title='MDF 0001']"));

    public static final Target CONFIRMACION_PRODUCTO_UNO = Target.the("El usuario agrega al carrito").located(By.xpath("// button [@name=\"add-to-cart\"]"));
    public static final Target SEGUIR_COMPRANDO = Target.the("El usuario da click para seguir comprando").located(By.xpath("//*[@id=\"primary-menu\"]/li[3]"));
    public static final Target PRODUCTO_DOS = Target.the("El usuario escoge el segundo producto").located(By.xpath("//a[@title='MDF 0001']"));

    public static final Target CONFIRMACION_PRODUCTO_DOS = Target.the("El usuario agrega al carrito").located(By.xpath("// button [@name=\"add-to-cart\"]"));

}
