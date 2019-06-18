import java.util.Scanner;
public class Multiplicaçãox13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, máximo;
        máximo = 13;
        System.out.println("Tabela de multiplicação");
        System.out.println("Digite o numero a ser multiplicado de 1 até " + máximo + ".");
        
        numero = ler.nextInt();
        int i = 1;
        System.out.println("-----------------------------");
        while(i <= máximo){
            System.out.println("| " + numero + " x " + i + " = " + numero * i + " |");
            i++;
        }
        System.out.println("-----------------------------");
    }
}