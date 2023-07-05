package exerciciojoaocondicional5;

import java.util.Scanner;

public class ExercicioJoaoCondicional5 {

    public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);
      
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = scanner.next();

        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.printf("O peso ideal para um homem de %.2f m de altura é: %.2f kg", altura, pesoIdeal);
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("O peso ideal para uma mulher de %.2f m de altura é: %.2f kg", altura, pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
        }

        scanner.close();
        
        
        
        
        
        
        
        
    }
    
}
