
package exerciciosjoaocondicional6;

import java.util.Scanner;

public class ExerciciosJoaoCondicional6 {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        double PESO_LIMITE = 50; // peso limite em quilos
        double MULTA_POR_QUILO_EXCEDENTE = 4.0; // valor da multa por quilo excedente

        System.out.print("Informe o peso de peixes trazido no dia (em quilos): ");
        double pesoDePeixes = scanner.nextDouble();

        double multa = 0.0; // inicializa a variável multa com zero

        if (pesoDePeixes > PESO_LIMITE) {
            double pesoExcedente = pesoDePeixes - PESO_LIMITE;
            multa = pesoExcedente * MULTA_POR_QUILO_EXCEDENTE;
        }

        System.out.printf("O valor da multa é de R$ %.2f", multa);

        scanner.close();
    }
}
