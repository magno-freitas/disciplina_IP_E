# Lista de Exercícios - Unidade 7 - Subprogramas

Implemente  os exercícios a seguir utilizando o VSCode. Faça a análise do problema identificando as entradas, saídas e testes. Utilize  somente  os  comandos  que  você  aprendeu  na  disciplina  até  o  momento  para  a resolução das atividades.

Utilize o nome do arquivo Java e da Classe de acordo com o indicado no inicio de cada enunciado.

----------

**Uni7Exe01.java** Dada uma letra minúscula e uma frase em letras minúsculas faça um programa que, com base em um subprograma, informe quantas vezes a letra aparece na frase.


**Uni7Exe02.java** Dada uma frase e uma palavra faça um programa que, com base em um subprograma, informe quantas vezes a palavra aparece na frase. Desconsidere o uso de pontuação na frase.

   
**Uni7Exe03.java** Dada uma frase, onde cada palavra é separada por no mínimo um espaço em branco, faça um programa que, com base em um subprograma, imprima a frase e cada palavra da frase juntamente com o número de caracteres da palavra (veja exemplo a seguir):

ISTO É UM TESTE

ISTO	4

É	1

UM	2

TESTE	5


**Uni7Exe04.java** Dado um texto qualquer faça um programa que, através de subprogramas:

a)	forneça o número de vogais do texto.        

b)	informe o valor numérico que aparece no início do texto. Informe 0 (zero) se no início não há valor numérico (ver exemplos abaixo):

"27C1"	- valor numérico = 27

"134"	- valor numérico = 134

"XYZ"	- valor numérico = 0

"B21"	- valor numérico = 0

c)	forneça a posição de início de uma palavra dentro do texto. 


**Uni7Exe05.java** Faça um programa que leia várias expressões aritméticas e, com base em subprogramas, escreva:

a)	informe se cada expressão aritmética está correta sintaticamente em relação ao número de parênteses utilizados;

b)	para cada expressão aritmética informe o número de divisões e multiplicações utilizadas;

c)	informe a posição do primeiro operador aritmético de cada expressão.


**Uni7Exe06.java** Uma startup precisa medir a previsibilidade e a estabilidade do seu negócio. Para isso, a empresa monitora o faturamento diário durante um período de 7 dias para descobrir a média semanal e o desvio padrão da receita. Como estagiário de Ciência de Dados, você ficou encarregado de criar duas sub-rotinas para automatizar essa análise: 

a) double calcularMedia(double[] dados): Deve calcular e retornar a média aritmética dos valores. 

b) double calcularDesvioPadrao(double[] dados, double media): Deve calcular e retornar o desvio padrão dos dados. 

Obs.: desvio padrão é uma medida que indica o quanto os valores de um conjunto de dados se afastam da média, indicando a consistência dos resultados. Para calcular o desvio padrão siga os seguintes passos: calcule a média dos valores; realize a seguinte operação para cada valor do conjunto (n-média) ²; some os resultados obtidos na última conta; divida o resulta da soma pelo número de elementos; por último, faça a raiz quadrada do último valor. 


**Uni7Exe07.java** O sensor de presença de uma loja de conveniência registrou o número de clientes a cada duas horas durante um dia inteiro. No entanto, houve uma falha no sistema e algumas leituras foram corrompidas, gerando valores negativos. Crie uma sub-rotina para realizar o tratamento desses dados corrompidos. A função deve receber o vetor original, gerar e retornar um novo vetor totalmente íntegro, ou seja, um vetor que mantenha os dados corretos e substitua todos os valores negativos por 0. 


**Uni7Exe08.java** m grupo de cinéfilos está organizando uma ação de Dia dos Namorados para avaliar a compatibilidade de casais com base nas preferências de filmes. PO programa deve receber, de forma individual, uma nota de 1 a 5 para cinco filmes específicos: Parasita, A Viagem de Chihiro, Gladiador, O Diário de Uma Paixão e Os Intocáveis. Escreva uma sub-rotina que receba o vetor de notas da pessoa A e o vetor de notas da pessoa B. A função deve calcular a diferença absoluta (sem sinal negativo) entre as notas de cada filme e gerenciar um medidor de afinidade (que começa em 0) seguindo as regras abaixo:

- Se a diferença for igual a 0 (mesma nota): Adicione 3 pontos ao medidor.

- Se a diferença for de 1 ou 2 (notas próximas): Adicione 1 ponto ao medidor.

- Se a diferença for igual ou maior que 3 (gostos muito distantes): Subtraia 2 pontos do medidor.

Se a diferença for igual ou maior que 3 (gostos muito distantes): Subtraia 2 pontos do medidor. 


**Uni7Exe09.java** Em uma turma de Ciência de Dados, o professor solicitou que os alunos desenvolvessem um conversor decimal para binário. Em suas especificações o professor informou que: 

- O usuário deve digitar um número inteiro no formato decimal que deseja transformar.

- A sub-rotina valorConvertido realizará a conversão e retornará um vetor de inteiros contendo a representação do número em binário.

- O programa principal deve receber esse vetor retornado e imprimir o resultado final formatado na tela. 
