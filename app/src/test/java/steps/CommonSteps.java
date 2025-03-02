package steps;

import io.cucumber.java.en.Given;
import pages.BasePage;

public class CommonSteps {
    BasePage basePage = new BasePage();

    @Given("^navego en la pagina principal de Rayitos de sol$")
    public void navigateToRayitosDeSol() {
        basePage.navigateTo("http://localhost:5173/");
    }
}