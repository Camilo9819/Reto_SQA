package com.prueba.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src/test/resources/features/agregarCarrito.feature",
                glue ="com.prueba.stepDefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE )

public class Runners {
}
