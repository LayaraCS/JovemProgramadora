
package jovemprogramadorajava;

import java.util.Scanner;


public class IdadeMaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idade;
        char brasileiro;
                System.out.println("OLA, VAMOS VER SE VOCE PODE VOTAR");
                System.out.println("DIGITE PRIMEIRO A SUA IDADE");
                idade = scan.nextInt();
                System.out.println("AGORA INFORME SE VOCE EH BRASILEIRO");
                System.out.println("APERT S PARA SIM E N PARA NAO");
                brasileiro = scan.next().charAt(0);
    
    if(idade >= 16 && (brasileiro == 'S' || brasileiro == 's')) {
    System.out.println("VC PODE VOTAR");
    }else {
    System.out.println("VOCE N PODE VOTAR");
    
}
}
}
