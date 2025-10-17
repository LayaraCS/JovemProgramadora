
package jovemprogramadorajava;

import java.util.Scanner;


public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       
        double altura, IMC, peso;
        char sexo;
        System.out.println("DIGITE SEU GENERO - H PARA HOMEM - M PARA MULHER");
        sexo = scan.next().charAt(0);
        
        if (sexo != 'h' && sexo != 'H' && sexo != 'm' && sexo != 'M'){
        System.err.println("VOCE DIGITOU UM SEXO INVALIDO");
         System.exit(0);
    }
        System.out.println("DIGITE QUAL EH O SEU PESO");
        peso = scan.nextDouble();
        System.out.println("DIGITE QUAL EH A SUA ALTURA");
        altura = scan.nextDouble();
        IMC = peso/(altura*altura);
        System.out.println("O SEU IMC EH " + IMC);
        if (sexo == 'M' || sexo == 'm'){
        }
            if(IMC > 39.0){
                System.out.println("SEU INDICE EH OBESIDADE MORBIDA");
            } else if(IMC >= 30 && IMC <=39){
                System.out.println("SEU INDICE EH OBESIDADE MODERADA");
            } else if (IMC >= 25 && IMC <+ 29.9){
                System.out.println("SEU INDICE EH OBESIDADE LEVE");
                }else if (IMC >=20 && IMC <=24.9){
                    System.out.println("SEU INDICE EH NORMAL");
                }else{
                    System.out.println("SEU INDICE EH ABAIXO DO NORMAL");
            
                }
    }
}
