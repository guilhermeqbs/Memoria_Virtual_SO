package memoriavirtual;

import java.io.IOException;

/**
 * @author Guilherme e Thyago
 *
 */
public class Principal
{
        public static void main(String args[]) throws IOException {
            String leitura = "entrada.txt";
            String escrita = "saida.txt";
            
            int[] memoriaFisica;

            ManipuladorArquivo.leitor(leitura);

            Alocamento.insercaoValores();
            
            memoriaFisica = Alocamento.alocamentoMemoria();

            BubbleSort.sort(memoriaFisica);

            ManipuladorArquivo.escritor(escrita,memoriaFisica,Alocamento.getContador());
        }
}
