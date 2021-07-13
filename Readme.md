# Métodos e Parâmetros em Java

Este repositório contém apenas um pequeno programa feito em Java apenas demonstrar um pouco sobre como utilizar métodos e parâmetros na linguagem.

## Uso de métodos na linguagem

Siga o exemplo da imagem abaixo:

<img src="Img Métodos Java.png">

• Repare que nela passamos os valores armazenados nas variáveis **num1** e **num2** como **parâmetros**  **a** e **b** no **método media** como indicado pelas setas roxas, mas para isso tivemos de declarar os tipos de cada um separadamente, justamente por que pode haver parâmetros distintos.

• Estando já dentro do método media, criamos uma variável chamada media para realizar a média dos valores contidos nos parâmetros **a** e **b**. 

• Ao terminar de realizar a média dos valores armazenados nesses parâmetros, retornamos o valor final da média para a **variável m** do **método principal Main (corpo principal do programa)** como indicado na seta cinza, pois os **valores dos parâmetros são destruídos** (é perdido os valores armazenados neles) no **fim do método media**, devidamente por existirem apenas dentro do método.

**Observação:** As variáveis num1 e num2 do método principal (main) não são as mesmas variáveis do método media.

## Como explicar isto? 🤔

Na memória do computador há uma **divisão entre os métodos main e media**, dê uma olhada mais abaixo:

<img src="Explicação memória metodo main e media.png"> 

• Veja que na área de memória do **método main** as variáveis num1,num2 e m irão existir durante **toda a execução do programa**.

• Agora na área de memória do **método media** as variáveis a,b e media irão **existir apenas durante sua execução, por quê sua duração é rápida**. Com isso, esses tipos de variáveis podem ser chamadas de **variáveis locais**, justamente por existir apenas durante a execução do método, pois após sua finalização elas são destruídas.

• As variáveis num1 e num2 tem seus conteúdos copiados para os parâmetros a e b do método media. Isso só ocorre quando no método main(principal), o método media é chamado.

## Mas por final de contas, o que são métodos?
Métodos são pequenas ações realizadas pelo seu software. Fazendo uma analogia ao mundo real:

• Pense que você tem um objeto chamado carro com os seguintes métodos: virarDireita, virarEsquerda, manterPosicao, acelerar, frear e etc.

• Note que cada método tem uma ação específica de um carro (qualquer outro automóvel) e só pelo nome do método você não sabe exatamente como ele vai realizar aquela ação, mas que o resultado dela será o nome propriamente do método como literalmente virar à direita, virar à esquerda, manter posição, acelerar e frear.

• Então observe que o software, por mais pequeno que seja, é composto por um conjunto de métodos com ações bem definidas.

• No entanto vamos supor que deu erro ao virar para a esquerda, logo em seguida você tem um ponto inicial de onde pode encontrar a solução desse erro pelo fato do nome do método ser definitivamente a ação daquele carro (objeto), o quê facilita ler um código e dar manutenção no sistema.
