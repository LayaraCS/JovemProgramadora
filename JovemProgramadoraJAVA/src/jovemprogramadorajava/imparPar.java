
package jovemprogramadorajava;

import java.util.Scanner;


public class imparPar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int idade;
        System.out.println("QUAL EH A SUA IDADE");
        idade = scan.nextInt();
       
        if(idade >= 18){
            System.out.println("VOCE EH MAIOR DE IDADE");
        }
        else {
            System.out.println("VOCE EH MENOR DE IDADE");
        }
    }
}
