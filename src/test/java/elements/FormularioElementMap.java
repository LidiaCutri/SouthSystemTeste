package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormularioElementMap {
    @FindBy(id = "field-customerName")
    protected WebElement nameform;

    @FindBy(id = "field-contactLastName")
    protected WebElement lastNameform;

    @FindBy(id = "field-contactFirstName")
    protected WebElement contacFirsttNameform;

    @FindBy(id = "field-phone")
    protected WebElement phoneform;

    @FindBy(id = "field-addressLine1")
    protected WebElement addressLineumform;

    @FindBy(id = "field-addressLine2")
    protected WebElement addressLinedoisform;

    @FindBy(id = "field-city")
    protected WebElement cityform;

    @FindBy(id = "field-state")
    protected WebElement stateform;

    @FindBy(id = "field-postalCode")
    protected WebElement postalCodeform;

    @FindBy(id = "field-country")
    protected WebElement countryform;

    @FindBy(id = "field-salesRepEmployeeNumber")
    protected WebElement fromEmployeerform;

    @FindBy(id = "field_salesRepEmployeeNumber_chosen")
    protected WebElement chosenEmployeerform;

    @FindBy(css = "div[class='chosen-search']>input")
    protected WebElement textEmployeerform;

    @FindBy(id = "field-creditLimit")
    protected WebElement creditLimitform;

    @FindBy(id = "form-button-save")
    protected WebElement saveform;

    @FindBy(id = "cancel-button")
    protected WebElement cancelform;

    @FindBy(css = "div[id='report-success']>p")
    protected WebElement mensagemform;

}
