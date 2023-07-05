//Exercicio1: Crie um programa que:
//1. Solicite ao usuário o nome e o valor de duas notas;
//2. Calcule a média das notas;
//3. Imprima a média.
package exercicio1a;

import java.util.Scanner;

public class Exercicio1A {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        float nota1, nota2, media;

        System.out.println("Digite seu nome");
        nome = entrada.nextLine();
        System.out.println("Digite a nota 1");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a nota 2");
        nota2 = entrada.nextFloat();
        
        media = (nota1+nota2)/2;
       
        System.out.println(nome+",Sua media é" + media);
        
    }

}
