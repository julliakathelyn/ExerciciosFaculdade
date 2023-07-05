
package exerciciojoao1;

import java.util.Scanner;


public class ExercicioJoao1 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.println("Digite a temperatura em celsius: ");
        celsius = entrada.nextDouble();
        // dois numeros inteiros resultam em numeros inteiros porem se tiver um numeor double resulta em numero double
        fahrenheit = celsius*(9.0/5)+32;
        
        System.out.println("A temperatura em fahrenheit e: " + fahrenheit);
    }
    
}
