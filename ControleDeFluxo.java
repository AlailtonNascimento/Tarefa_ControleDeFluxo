
import java.util.Scanner;

public class ControleDeFluxo {

    public static void main (String args[]){

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a primeira Nota: ");
        float nota1 = ler.nextFloat();
        System.out.print("Digite a segunda Nota: ");
        float nota2 = ler.nextFloat();

        float media = (nota1 + nota2)/2;

        if(media >= 7){
            System.out.println ("\nAprovado - Média: " + media);
        } else if (media >= 5) {
            System.out.println("\nRecuperação - Média: " + media);
        }else{
            System.out.println("\nReprovado - Média: " + media);
        }


    }
}
