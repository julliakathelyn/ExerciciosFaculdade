
package exerciciojoaocondicional2;

public class ExercicioJoaoCondicional2 {

    public static void main(String[] args) {
    
        int a, b, c;
        
        a = 3;
        b = 4;
        c = 7;
        
        if((a+c)>b){
            System.out.println("Letra a: Verdadeira");
        }else{
            System.out.println("Letra a: Falsa");
        }
        
        if(b>=(a+2)){
            System.out.println("Letra b: Verdadeira");
        }else{
            System.out.println("Letra b: Falsa");
        }
        if(c==(b-a)){
            System.out.println("Letra c: Verdadeira");
        }else{
            System.out.println("Letra c: Falsa");
        }
        if ((b+a)<= c){
            System.out.println("Letra d: Verdadeira");
        }else{
            System.out.println("Letra d: Falsa");
        }
        if((c+a)>b){
            System.out.println("Letra e: Verdadeira");
        }else{
            System.out.println("Letra e: Falsa");
        }
           
        
    }
    
}
