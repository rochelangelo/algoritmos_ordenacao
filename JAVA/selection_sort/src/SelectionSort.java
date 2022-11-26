import java.util.Random;

public class SelectionSort {

    public int[] criaVetor(){
        Random random = new Random();
        int tamanho = random.nextInt(100);

        int vetor[] = new int[tamanho];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(1000);
        }

        return vetor;
    }

    public int[] ordenacao(int[] vetor){
        for(int i = 0; i < vetor.length; i++){

            int posMenor = i;

            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[posMenor]){
                    posMenor = j;
                }
            }
            if(vetor[i] != vetor[posMenor]){
                int aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }
        }
        return vetor;
    }

    public void imprimeVetor(int[] vetor, int flag){
        if(flag == 1){
            System.out.println("\nVetor nao Ordenado!");
        }else{
            System.out.println("\nVetor Ordenado!");
        }

        for(int i = 0; i < vetor.length; i++){
            if (i == (vetor.length - 1)) {
                System.out.print(vetor[i] + " ");
            } else {
                System.out.print(vetor[i] + " - ");
            }
        }
    }


    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        int[] vetor =  selectionSort.criaVetor();
        selectionSort.imprimeVetor(vetor, 1);
        int[] vetorOrdenado = selectionSort.ordenacao(vetor);
        selectionSort.imprimeVetor(vetorOrdenado, 0);

    }
}