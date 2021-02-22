package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import elements.ListaElementMap;
import static jdk.nashorn.internal.objects.NativeString.trim;

public class ListaPage extends ListaElementMap {

    public ListaPage(){

        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void novo_cliente() throws InterruptedException {
        Select cmbVersion = new Select(selectVersion);
        cmbVersion.selectByValue("bootstrap_theme_v4");
        Thread.sleep(300);
        addCustomer.click();
    }

    public void pesquisar_registro(String name) throws InterruptedException {
        searchName.sendKeys(name);
        Thread.sleep(1500);
    }

    public void excluir_registro(String confirmarexclusao) throws InterruptedException {
        checkbox.click();
        delete.click();
        Thread.sleep(600);
        Assert.assertEquals(confirmarexclusao,trim(deletequestion.getText()));
    }

    public void confirmar_exclusao(String mensagemexclusao) throws InterruptedException {
        deleteconfirmation.click();
        Thread.sleep(1500);
        Assert.assertEquals(mensagemexclusao,mensagemconfirmation.getText());
    }
}
