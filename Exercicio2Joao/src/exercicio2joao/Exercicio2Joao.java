package exercicio2joao;

import java.util.Scanner;


public class Exercicio2Joao {
// calcular o imc de uma pessoa
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        double peso, altura, imc;
        
        System.out.println("Digite seu peso(kg): ");
        peso = entrada.nextDouble();
        System.out.println("Digite sua altura(cm):");
        altura = entrada.nextDouble();
        
        imc = peso/ Math.pow(altura, 2) ;
        
        System.out.println("Seu IMC é: "+ imc);
         
    }
    
}
