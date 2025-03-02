package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RayitosContactenosPage;

public class RayitoContactenosStep {
    RayitosContactenosPage rayitosSol = new RayitosContactenosPage();

    @When("^ingreso a contactenos$")
    public void clickButtonCalculadora() {
        rayitosSol.clickButtonCalculadora();
    }

    @Then("^ingreso valores y envio el formulario$")
    public void setValuesContacto() {
        rayitosSol.setValuesContacto();
    }
}