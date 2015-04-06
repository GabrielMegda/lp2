package numeromuitogrande;

import java.util.Scanner;

/**
 *
 * @author Gabriel Vazi
 */
public class NumeroMuitoGrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String a = null, b = null;

        System.out.println("Escreva valor 1: ");
        a = leia.next();
        System.out.println("Escreva valor 2: ");
        b = leia.next();
        while (a.length() > 30 || b.length() > 30) {
            System.out.println("Numeros invalidos!! tente novamente: ");
            a = leia.next();
            b = leia.next();
        }

        int i = 0, j = 0, k = 0;
        int[] valor1 = new int[i];
        int[] valor2 = new int[j];
        int[] resultadoSoma = new int[k];

        for (i = 0; i < 29; i++) {
            valor1[i] = Character.getNumericValue(a.charAt(i));
        }
        for (j = 0; j < 29; j++) {
            valor2[j] = Character.getNumericValue(b.charAt(j));
        }

        for (k = 0; k < 10; k++) {
            resultadoSoma[k] += valor1[i] + valor2[k];
        }
        if(resultadoSoma[k]>30){
            System.out.println("numero maior que 30 posições");
        }else{
            System.out.println("Resutado soma: " + resultadoSoma);
        }
    }
}
