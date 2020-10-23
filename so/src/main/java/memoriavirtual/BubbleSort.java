package memoriavirtual;

public class BubbleSort {

    public static void sort(int []vetor){
        int aux;

        for(int i=0; i<vetor.length; i++){
            for(int j=1; j<vetor.length; j++){
                if(vetor[j-1] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[j-1];
                    vetor[j-1] = aux;
                }
            }
        }
    }
}
