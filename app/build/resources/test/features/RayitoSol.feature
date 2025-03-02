Feature: Automatizar pruebas en la pagina Rayitos de Sol

  Background:
    Given navego en la pagina principal de Rayitos de sol

  Scenario: Verificar el servicio de contactenos
    When ingreso a contactenos
    Then ingreso valores y envio el formulario
