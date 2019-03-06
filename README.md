# savingsSimulation



## Feature: Savings Simulator_Successful
### Scenario: Validate Successful Savings Simulation
Cenário que avalia a simulação de poupança com sucesso. É executada 2 vezes, uma com o período em Meses e outra com o Período em Anos, utilizando Scenario Outline.
A avaliação de sucesso do teste é feita através da validação de 3 aspectos:
- exibição do texto "Em XX meses você terá guardado", com a indicação correta do número de meses. 
- presença de algum texto/valor na área que corresponde ao valor economizado no tempo simulado
- avaliação da tabela com outras opções, onde é verificado que na coluna "Tempo (Meses)" a indicação dos meses esteja correta, seguindo a lógica de cada linha corresponde ao incremento de 12 meses em relação a anterior.

## Feature: SavingsSimulator_InvalidInput

### Scenario: Validate Invalid Initial Value Input
Valida que ao inserir um valor inferior a 20,00 no campo de "Valor a Aplicar", seja exibido o alerta "Valor mínimo de 20.00".

### Scenario; Validate Invalid Monthly Value Input
Valida que ao inserir um valor inferior a 20,00 no campo de "Valor a Poupar", seja exibido o alerta "Valor mínimo de 20.00".

### Scenario: Validate Invalid Time Value Input
Valida que ao inserir 0 no campo "Por quanto tempo poupar", seja exibido o alerta "Valor esperado não confere"

## Técnicas e Tecnologias
Foram criados testes básicos para atender aos critérios de aceitação informados. Mas poderiam ser realizados vários outros cenários.

Os testes foram realizados utilizando BDD e PageObjects. Estruturados através Features, Steps, Pages, PageElements e runners para cada Feature.

Para criação dessa estrutura foram utilizados Selenium, Cucumber, JUnit e o projeto foi escrito em Java.
