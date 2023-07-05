package exerciciocondicionalif;

import java.util.Scanner;

public class ExercicioCondicionalIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Em que ano voce nasceu?");
        int nasc = entrada.nextInt();
        int idade = 2023 - nasc;
        System.out.println("Voce tem: "+ idade +" anos.");
        if (idade >= 18) {
            System.out.println("Voce e Maior de Idade.");
        } else {
            System.out.println("Voce e Menor de Idade.");
        }

    }

}
