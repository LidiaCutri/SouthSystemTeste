$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/criar_cliente.feature");
formatter.feature({
  "name": "Cadastrar Cliente",
  "description": "  Como Quality Assurance\n  Quero validar o formulário de cadastro de cliente do Sicredi",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Cadastrar Cliente",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que eu acesse o formulario de cadastro do Sicredi e incluir um novo cliente",
  "keyword": "Dado "
});
formatter.step({
  "name": "preencha os dados \"\u003cname\u003e\",\"\u003clastname\u003e\",\"\u003ccontactname\u003e\",\"\u003cphone\u003e\",\"\u003caddressfirst\u003e\",\"\u003caddresssecound\u003e\",\"\u003ccity\u003e\",\"\u003cstate\u003e\",\"\u003cpostalcode\u003e\",\"\u003ccountry\u003e\",\"\u003cemployeer\u003e\",\"\u003ccreditlimit\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "eu clicar em Salvar",
  "keyword": "Quando "
});
formatter.step({
  "name": "o sistema registra os dados e apresenta a mensagem de sucesso \"\u003cmensagem\u003e\"",
  "keyword": "Entao "
});
formatter.step({
  "name": "para excluir o registro cadastrado",
  "keyword": "E "
});
formatter.step({
  "name": "eu pesquiso pelo nome cadastrado \"\u003cname\u003e\"",
  "keyword": "Entao "
});
formatter.step({
  "name": "eu clicar em Excluir e confirmar o alerta \"\u003cconfirmarexclusao\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "o sistema exclui e exibe a mensagem de sucesso \"\u003cmensagemexclusao\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "contactname",
        "phone",
        "addressfirst",
        "addresssecound",
        "city",
        "state",
        "postalcode",
        "country",
        "employeer",
        "creditlimit",
        "mensagem",
        "confirmarexclusao",
        "mensagemexclusao"
      ]
    },
    {
      "cells": [
        "Teste Sicredi Cutri",
        "Teste",
        "Lidia",
        "51 9999-9999",
        "Av Assis Brasil, 3970",
        "Torre D",
        "Porto Alegre",
        "RS",
        "91000-000",
        "Brasil",
        "Fixter",
        "200",
        "Your data has been successfully stored into the database",
        "Are you sure that you want to delete this 1 item?",
        "Your data has been successfully deleted from the database."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Cadastrar Cliente",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse o formulario de cadastro do Sicredi e incluir um novo cliente",
  "keyword": "Dado "
});
formatter.match({
  "location": "CriarclienteSteps.que_eu_acesse_o_formulario_de_cadastro_do_sicredi_e_incluir_um_novo_cliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencha os dados \"Teste Sicredi Cutri\",\"Teste\",\"Lidia\",\"51 9999-9999\",\"Av Assis Brasil, 3970\",\"Torre D\",\"Porto Alegre\",\"RS\",\"91000-000\",\"Brasil\",\"Fixter\",\"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarclienteSteps.preencha_os_dados(String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar em Salvar",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarclienteSteps.eu_clicar_em_salvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema registra os dados e apresenta a mensagem de sucesso \"Your data has been successfully stored into the database\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarclienteSteps.o_sistema_registra_os_dados_e_apresenta_a_mensagem_de_sucesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "para excluir o registro cadastrado",
  "keyword": "E "
});
formatter.match({
  "location": "CriarclienteSteps.para_eu_excluir_o_registro_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pesquiso pelo nome cadastrado \"Teste Sicredi Cutri\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarclienteSteps.eu_pesquiso_pelo_nome_cadastrado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar em Excluir e confirmar o alerta \"Are you sure that you want to delete this 1 item?\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarclienteSteps.eu_clicar_em_excluir_e_confirmar_o_alerta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exclui e exibe a mensagem de sucesso \"Your data has been successfully deleted from the database.\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarclienteSteps.o_sistema_exclui_e_exibe_a_mensagem_de_sucesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://www.grocerycrud.com/demo/bootstrap_theme_v4/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});