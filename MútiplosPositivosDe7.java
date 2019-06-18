import java.util.Scanner;
public class MútiplosPositivosDe7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int multiplo = 1, quantidade = 0, numero, intervalo;
        System.out.println("Saiba os múltiplos positivos de qualquer inteiro em qualquer intervalo!");
        System.out.println("Digite o inteiro: ");
        numero = ler.nextInt();
        System.out.println("Digite o intervalo: (de 1 até...) ");
        intervalo = ler.nextInt();
        
        System.out.println("Descubra a quantidade de múltiplos de " + numero + " no intervalo de 1 até " + intervalo + "!");
        while(multiplo <= intervalo){
            if(multiplo % numero == 0){
                quantidade ++;
                System.out.println("O número " + multiplo + " é múltiplo de " + numero + ".");
            }
            multiplo ++;
        }
        
        if(quantidade == 0)
            System.out.println("Não há múltiplos de " + numero + " nesse intervalo");
        else System.out.println("A quantidade de múltiplos do número " + numero + " no intervalo de 1 até " + intervalo + " é igual a " + quantidade + ".");
    }
}
