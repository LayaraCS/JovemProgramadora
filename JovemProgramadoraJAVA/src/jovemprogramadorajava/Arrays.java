
package jovemprogramadorajava;

import java.util.Scanner;


public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        double[] notas = new double[3];
        double media;
        
        
        System.out.println("Ola digite a primeira nota: ");
        notas[0] = scan.nextDouble();
         System.out.println("Ola digite a segunda nota: ");
         notas[1] = scan.nextDouble();
          System.out.println("Ola digite a terceira nota: ");
          notas[2] = scan.nextDouble();
         
          media = (notas[0] + notas[1] + notas[2])/3;
          
        System.out.println("A MEDIA DAS NOTAS EH: " + media);
        
        
    }
          
}
