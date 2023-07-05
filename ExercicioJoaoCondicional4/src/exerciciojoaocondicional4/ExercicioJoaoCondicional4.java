
package exerciciojoaocondicional4;

import java.util.Scanner;

public class ExercicioJoaoCondicional4 {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        int a;
        System.out.println("Digite um numero: ");
        a = entrada.nextInt();

        if (a % 2 == 0) {
            if (a >= 0) {
                System.out.println(a + "Positivo e Par!");

            } else {
                System.out.println(a+"Negativo e Par!");

            }
            
        } else {
            if (a >= 0){
                System.out.println(a + "Positivo e Impar!");
            }else{
                System.out.println("Negativo e Impar");
            }
            

        }
        
    }
    
}
