import java.util.Scanner;

/**
 *
 * @author Gabriel Vazi
 */
public class VerificadorCpf {

    public static void main(String[] args) {
        String leitorCpf;
        int numCpf[] = new int[11]; /**vetor para receber o numero digitado pelo usuario*/
        int verificador1 = 0, verificador2 = 0;
        int n, p;

        System.out.println("Digite os 9 primeiros numeros do CPF: ");
        Scanner leia = new Scanner(System.in);

        leitorCpf = leia.next();

        while (leitorCpf.length() != 9) {
            /**
             * Verifica se o numero digitado pelo usuario é valido
             */
            System.out.println("Numeros invalidos!! tente novamente: ");
            leitorCpf = leia.next();
        }

        for (n = 0; n < 9; n++) {
            /**
             * transforma String em inteiro
             */
            numCpf[n] = Character.getNumericValue(leitorCpf.charAt(n));
        }

        for (n = 8, p = 2; n >= 0; n--, p++) {
            verificador1 += p * numCpf[n];
        }

        if ((verificador1 % 11) < 2) {
            verificador1 = 0;
        } else {
            verificador1 = 11 - (verificador1 % 11);
        }

        numCpf[9] = verificador1;

        for (n = 9, p = 2; n >= 0; n--, p++) {
            verificador2 += p * numCpf[n];
        }

        if ((verificador2 % 11) < 2) {
            verificador2 = 0;
        } else {
            verificador2 = 11 - (verificador2 % 11);
        }
        numCpf[10] = verificador2;
        System.out.println("CPF: ");
        for (n = 0; n < 11; n++) {
            System.out.print(numCpf[n]);

        }
        System.out.println("");
        /**
         * para não deixar o resultado colado com a frase "CONSTRUIDO COM
         * SUCESSO (tempo total: x segundos)"
         */
    }

}
