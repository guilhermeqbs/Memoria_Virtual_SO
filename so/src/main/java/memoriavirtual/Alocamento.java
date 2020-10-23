package memoriavirtual;

import java.util.ArrayList;

public class Alocamento {

    public static final ArrayList<String> listaStr = new ArrayList<String>();
    private static final ArrayList<Integer> listaNum = new ArrayList<Integer>();
    private static final ArrayList<Integer> e = new  ArrayList<Integer>();
    private static int m;
    private static int n;
    private static int p;
    private static int tam;
    private static int contador=0;
  
    public static int[] alocamentoMemoria(){
        int[] memoriaFisica = new int[n/p];
        
        for(int i=0; i<memoriaFisica.length; i++)
        {
            memoriaFisica[i] = e.get(i);
        }

        for(int j=memoriaFisica.length, i=0; j<tam; j++){
            if(checkMemoriaFisica(memoriaFisica,e.get(j)) == false){
                memoriaFisica[i] = e.get(j);

                i++;

                if(i==(memoriaFisica.length)){
                    i=0;
                }
                contador++;
            }
        }
        e.clear();
        return memoriaFisica;
    }

    private static boolean checkMemoriaFisica(int[] mf, int valor){
        for (int i=0; i<mf.length; i++){

            if(valor == mf[i]){
                return true;
            }
        }
        return false;
    }

    public static void insercaoValores(){
        
        for(int j=1; j<listaStr.size();j++){
            quebraLinha(listaStr.get(j));
        }

        listaStr.clear();
        
        m = listaNum.get(0);
        n = listaNum.get(1);
        p = listaNum.get(2);
        tam = listaNum.get(3);

        for(int i=0; i<tam; i++)
        {
            e.add(listaNum.get(i+4)/p);
        }
        listaNum.clear();
    }

    private static void quebraLinha(String linha)
    {   
        String[] linhaSeparada;

        linhaSeparada = linha.split(" ");

        for (int i = 0; i<linhaSeparada.length; i++){
            listaNum.add(Integer.parseInt(linhaSeparada[i]));
        }
    }

    public static int getContador() {
        return contador;
    }
}
