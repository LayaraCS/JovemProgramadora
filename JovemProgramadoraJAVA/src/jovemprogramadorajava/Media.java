
package jovemprogramadorajava;

import java.util.Scanner;


public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double resultado;
        
        System.out.println("Ola digite a primeira nota: ");
        nota1 = scan.nextDouble();
         System.out.println("Ola digite a segunda nota: ");
         nota2 = scan.nextDouble();
          System.out.println("Ola digite a terceira nota: ");
          nota3 = scan.nextDouble();
          resultado = (nota1 + nota2 + nota3) / 3;
          System.out.println("O seu resultado eh: " + resultado);
    }
   
}
