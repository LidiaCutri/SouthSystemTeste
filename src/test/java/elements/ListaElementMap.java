package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListaElementMap {
    @FindBy(id = "switch-version-select")
    protected WebElement selectVersion;

    @FindBy(css = "div[class='floatL t5']>a")
    protected WebElement addCustomer;

    @FindBy(css = "input[name='customerName']")
    protected WebElement searchName;

    @FindBy(css = "input[class='select-all-none']")
    protected WebElement checkbox;

    //excluir
    @FindBy(css = "td[class='no-border-left ']>div:nth-child(1)")
    protected WebElement delete;

    //voce deseja realmente exluir?
    @FindBy(css = "div[class='modal-body']>p[class='alert-delete-multiple-one']")
    protected WebElement deletequestion;

    //botao de confirmaçao da exclusao
    @FindBy(css = "div[class='modal-footer']>button[class='btn btn-danger delete-multiple-confirmation-button']")
    protected WebElement deleteconfirmation;

    //mensagem de confirmaçao de exclusao
    @FindBy(css = "div[class='alert alert-success growl-animated animated bounceInDown']>span:nth-child(4)")
    protected WebElement mensagemconfirmation;

}
