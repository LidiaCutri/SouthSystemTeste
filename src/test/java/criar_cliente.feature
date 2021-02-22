#language: pt

Funcionalidade: Cadastrar Cliente
  Como Quality Assurance
  Quero validar o formulário de cadastro de cliente do Sicredi


  Esquema do Cenario: Cadastrar Cliente
    Dado que eu acesse o formulario de cadastro do Sicredi e incluir um novo cliente
    E preencha os dados "<name>","<lastname>","<contactname>","<phone>","<addressfirst>","<addresssecound>","<city>","<state>","<postalcode>","<country>","<employeer>","<creditlimit>"
    Quando eu clicar em Salvar
    Entao o sistema registra os dados e apresenta a mensagem de sucesso "<mensagem>"
    E para excluir o registro cadastrado
    Entao eu pesquiso pelo nome cadastrado "<name>"
    Quando eu clicar em Excluir e confirmar o alerta "<confirmarexclusao>"
    Entao o sistema exclui e exibe a mensagem de sucesso "<mensagemexclusao>"


    Exemplos:
      |name                |lastname     |contactname    |phone         |addressfirst               |addresssecound   |city           |state    |postalcode    |country    |employeer         |creditlimit    |mensagem                                                |confirmarexclusao                                |mensagemexclusao                                          |
      |Teste Sicredi Cutri |Teste        |Lidia          |51 9999-9999  |Av Assis Brasil, 3970      |Torre D          |Porto Alegre   |RS       |91000-000     |Brasil     |Fixter            |200            |Your data has been successfully stored into the database|Are you sure that you want to delete this 1 item?|Your data has been successfully deleted from the database.|