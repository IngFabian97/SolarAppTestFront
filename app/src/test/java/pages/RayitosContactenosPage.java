package pages;

public class RayitosContactenosPage extends BasePage {
    // Locators
    private String buttonContact = "(//a[contains(text(),'Contáctanos')])";
    private String inputName = "//input[@id='name']";
    private String inputEmail = "//input[@id='email']";
    private String inputMensaje = "//textarea[@id='message']";
    private String buttonEnviar = "//button[contains(text(),'Enviar')]";

    public RayitosContactenosPage() {
        // Constructor
        super(driver);
    }

    public void clickButtonCalculadora() {
        // Metodo para hacer click en el boton Contactenos
        clickElement(buttonContact);
    }

    public void setValuesContacto() {
        // Metodo para ingresar valores y enviar
        write(inputName, "Fabian Guarin");
        write(inputEmail, "fabian.guarin@hotmail.com");
        write(inputMensaje, "Hola, me gustaria saber mas sobre sus servicios");
        clickElement(buttonEnviar);
    }

    
}
