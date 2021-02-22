package pages;

import elements.FormularioElementMap;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;


public class FormularioPage extends FormularioElementMap {

    public FormularioPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void preencher_formulario(String name, String lastname, String contactname, String phone, String addressfirst, String addresssecound, String city, String state, String postalcode, String country, String employeer, String creditlimit) {
        nameform.sendKeys(name);
        lastNameform.sendKeys(lastname);
        contacFirsttNameform.sendKeys(contactname);
        phoneform.sendKeys(phone);
        addressLineumform.sendKeys(addressfirst);
        addressLinedoisform.sendKeys(addresssecound);
        cityform.sendKeys(city);
        stateform.sendKeys(state);
        postalCodeform.sendKeys(postalcode);
        countryform.sendKeys(country);
        chosenEmployeerform.click();
        //Select cmbEmployeer = new Select(fromEmployeerform);
        //cmbEmployeer.selectByValue(employeer);
        textEmployeerform.sendKeys(employeer);
        textEmployeerform.sendKeys(Keys.ENTER);
        creditLimitform.sendKeys(creditlimit);
    }

    public void salvar_cliente() {
        saveform.click();
    }

    public void validar_mensagem(String mensagem) {
        String[] mensagemExibida = mensagemform.getText().split("\\.");
        Assert.assertEquals(mensagem, mensagemExibida[0]);
    }

    public void opcao_voltar(){
        cancelform.click();
    }
}
