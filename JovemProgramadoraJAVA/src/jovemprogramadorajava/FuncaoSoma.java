
package jovemprogramadorajava;

import java.util.Scanner;


public class FuncaoSoma {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = 80;
        int numero2 = 50;
        int soma;
        
        soma = SomaDoisNumero(numero1, numero2);
        System.out.println("Resultado da soma: " + soma);
        soma = SomaDoisNumero(50, 2);
        System.out.println("Resultado da soma: " + soma);
        soma = SomaDoisNumero(12, 3);
        System.out.println("Resultado da soma: " + soma);
        soma = SomaDoisNumero(65, 12);
        System.out.println("Resultado da soma: " + soma);
        soma = SomaDoisNumero(02, 23);
        System.out.println("Resultado da soma: " + soma);
        
    }

   public static int SomaDoisNumero(int num1, int num2){
   int resultado;
   
   resultado = num1 + num2;
   return resultado;
   }


}

