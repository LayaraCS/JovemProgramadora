
package jovemprogramadorajava;

import java.util.Scanner;


public class Nome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String sobrenome;
        int idade;
        System.out.println("Diga o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Diga o seu sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.println("Qual eh a sua idade: ");
        idade = scan.nextInt();
        System.out.println("Seu nome eh: " + nome + " " + "seu sobrenome eh " + sobrenome + " " + "sua idade eh: " + idade + " " + "anos");
        
    }
}
