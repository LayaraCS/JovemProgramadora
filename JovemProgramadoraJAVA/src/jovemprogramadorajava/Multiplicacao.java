
package jovemprogramadorajava;

import java.util.Scanner;


public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int multiplicacao;
        
        System.out.println("DIGITE O PRIMEIRO NUMERO");
        int num1 = scan.nextInt();
        System.out.println("DIGITE O SEGUNDO NUMERO");
        int num2 = scan.nextInt();
        
        
    multiplicacao = multiplicacaoDoisNumeros(num1, num2);
        System.out.println("Resultado da multiplicacao eh: " + multiplicacao);
    }
    
    public static int multiplicacaoDoisNumeros(int numero1, int numero2){
    int resultado;
    resultado = numero1 * numero2;
    return resultado;
    }
}

