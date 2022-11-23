# SELECTION SORT

Este tipo de algoritmo funciona basicamente em **colocar o menor valor do vetor a se ordenado para a primeira posição** (dependendo da ordem poder ser o maior valor), depois o segundo menor valor para a segunda posição e assim sucessivamente, **até o últimos dois elementos** (elemento n-1 e n nas posições n-1 e n).

O selection sort funciona da seguinte maneira:

Escolhe o primeiro número **(x)** do vetor, este número escolhido será comparado com os demais a sua direita, quando encontrado um número menor, o **x** ocupa a posição deste número menor encontrado e o numero encontrado ocupa o lugar do x. Após a troca, seleciona o numero da posição seguinte ao numero do vetor selecionando antes, verifica novamente número por número, quando encontrado um número menor que o atual selecionado faz novamente a troca e assim sussecivamente até toda a lista esteja ordenada. **Uma observação**, caso a direita do número selecionado não tenha menor que ele, este número já está na sua posição correta.
