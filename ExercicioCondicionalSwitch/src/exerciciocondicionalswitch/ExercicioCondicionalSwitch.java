package exerciciocondicionalswitch;
import java.util.Scanner;
public class ExercicioCondicionalSwitch {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
    int perna = entrada.nextInt();
    String tipo;
        System.out.println("Isso e um(a)");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
              
        }
        System.out.println(tipo);
        
        
    }
    
}
