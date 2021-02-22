package stepsDefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import pages.FormularioPage;
import pages.ListaPage;

public class CriarclienteSteps {
    ListaPage listaPage = new ListaPage();
    FormularioPage formularioPage = new FormularioPage();

    @Dado("^que eu acesse o formulario de cadastro do Sicredi e incluir um novo cliente$")
    public void que_eu_acesse_o_formulario_de_cadastro_do_sicredi_e_incluir_um_novo_cliente() throws InterruptedException {
        listaPage.novo_cliente();
    }
    @E("^preencha os dados \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void preencha_os_dados(String name,String lastname,String contactname,String phone,String addressfirst,String addresssecound,String city,String state,String postalcode,String country,String employeer,String creditlimit) {
        formularioPage.preencher_formulario(name,lastname,contactname,phone,addressfirst,addresssecound,city,state,postalcode,country,employeer,creditlimit);
    }

    @Quando("^eu clicar em Salvar$")
    public void eu_clicar_em_salvar() {
        formularioPage.salvar_cliente();
    }

    @Então("^o sistema registra os dados e apresenta a mensagem de sucesso \"([^\"]*)\"$")
    public void o_sistema_registra_os_dados_e_apresenta_a_mensagem_de_sucesso(String mensagem) {
        formularioPage.validar_mensagem(mensagem);
    }

    @E("^para excluir o registro cadastrado$")
    public void para_eu_excluir_o_registro_cadastrado() throws InterruptedException {
        formularioPage.opcao_voltar();
    }

    @Entao("^eu pesquiso pelo nome cadastrado \"([^\"]*)\"$")
    public void eu_pesquiso_pelo_nome_cadastrado(String name) throws Throwable {
        listaPage.pesquisar_registro(name);
    }

    @Quando("^eu clicar em Excluir e confirmar o alerta \"([^\"]*)\"$")
    public void eu_clicar_em_excluir_e_confirmar_o_alerta(String confirmarexclusao) throws InterruptedException {
        listaPage.excluir_registro(confirmarexclusao);
    }

    @Entao("^o sistema exclui e exibe a mensagem de sucesso \"([^\"]*)\"$")
    public void o_sistema_exclui_e_exibe_a_mensagem_de_sucesso(String mensagemexclusao) throws Throwable {
        listaPage.confirmar_exclusao(mensagemexclusao);
    }
}
