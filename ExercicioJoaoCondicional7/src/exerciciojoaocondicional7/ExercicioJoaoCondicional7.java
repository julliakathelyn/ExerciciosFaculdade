
package exerciciojoaocondicional7;

import java.util.Scanner;

public class ExercicioJoaoCondicional7 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      String nome, sexo;
      int idade;
      double hemoglobina;
      
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite seu sexo (feminino/masculino): ");
        sexo = entrada.nextLine();
        System.out.println("Digite a quantidade de hemoglobina: ");
        hemoglobina = entrada.nextDouble();
        
        if (idade < 6){
            System.out.println("");
        }
        
        
    }
    
}
