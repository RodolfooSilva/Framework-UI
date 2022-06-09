#Author: Dolfo.3@hotmail.com



Feature: pesquisa no google
  Eu como usuario quero o site para realizar uma pesquisa

  
  Scenario: Pesquisar nome da escola no google
    Given que eu esteja no "https://www.itau.com.br"
    When pesquisar o nome da escola
    Then valido as informacoes

