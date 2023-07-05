package exercicio3joaomaiordeidade;

import java.util.Scanner;

public class Exercicio3JoaoMaiorDeIdade {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int idade;
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        
        if (idade >= 18){
            System.out.println("Maior de Idade");
        }else {
            System.out.println("Menor de Idade");
        }
        
        
        
    }
    
    
}
