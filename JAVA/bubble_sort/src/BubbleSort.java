import java.util.Random;

public class BubbleSort {

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
            for(int j = 0; j < vetor.length - 1; j++){
                if(vetor[j] > vetor[j + 1]){ //AQUI SE ESCOLHE SE A ORDENACAO SERA CRESCENTE OU DECRESCENTE!!!
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
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


    //SEMPRE REUTILIZAR METODOS DE PROJETOS ANTERIOES ;)

    public static void main(String[] args){
        BubbleSort bubbbleSort = new BubbleSort();

        int[] vetor = bubbbleSort.criaVetor();
        bubbbleSort.imprimeVetor(vetor, 1);
        int[] vetorOrdenado = bubbbleSort.ordenacao(vetor);
        bubbbleSort.imprimeVetor(vetor, 0);
    }
}
