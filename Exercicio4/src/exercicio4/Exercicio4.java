//• 4) Faça um código que leia:
//• O ano de nascimento de uma pessoa e o ano atual.
//• Calcule e mostre:
//• A idade dessa pessoa;
//• Quantos anos essa pessoa terá em 2030.
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nasceu, atual;

        System.out.println("Em qual ano voce nasceu?");
        nasceu = entrada.nextInt();

        System.out.println("Qual é o ano atual?");
        atual = entrada.nextInt();

        int calcular;
        calcular = (nasceu - atual);

        System.out.println("Voce tem ou tera em "+atual+" "+calcular + " anos de idade.");
        
        int idade2030;
        int calcular2030;
        
        idade2030 = 2030;
        calcular2030 = nasceu-idade2030;
        
        System.out.println("Em 2030 voce tera:"+calcular2030);
    }

}
