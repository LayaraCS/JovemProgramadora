
package jovemprogramadorajava;

import java.util.Scanner;


public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char peso;
        char altura;
        int IMC;
        String SEXO;
        System.out.println("DIGITE QUAL EH O SEU PESO");
        peso = scan.next().charAt(0);
        System.out.println("QUAL EH A SUA ALTURA");
        altura = scan.next().charAt(0);
        IMC = ((altura * altura)/peso);
        System.out.println("O SEU IMC EH " + IMC);
    }
}
