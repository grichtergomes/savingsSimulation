# savingsSimulation

Cenários de Teste:
Savings Simulator_Successful: cenário que avalia a simulação com sucesso. É executada 2 vezes, uma com o período em Meses e outra com o Período em Anos, utilizando Scenario Outline.
A avaliação de sucesso do teste é feita através da validação de 3 aspectos:
- exibição do texto "Em XX meses você terá guardado", com a indicação correta do número de meses. 
- presença de algum texto/valor na área que corresponde ao valor economizado no tempo simulado
- avaliação da tabela com outras opções, onde é verificado que na coluna "Tempo (Meses)" a indicação dos meses esteja correta, seguindo a lógica de cada linha corresponde ao incremento de 12 meses em relação a anterior.
