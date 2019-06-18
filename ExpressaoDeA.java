import java.util.Scanner;
public class ExpressaoDeA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double A = 0, expressao = 0; 
        double n;
        
        System.out.println("A Expressão de A é dada pela formula: A = N + (N - 1)/2 + (N - 2)/3 + (N - 3)/4 + ... + (N - (N - 1))/N");
        System.out.println("Ou seja, A = N + (N - i)/(i + 1), sendo i = 1 até N - 1");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Digite o valor de N para a expressão de A: ");
        n = ler.nextDouble();
        for(int i = 1; i < n; i++)
            expressao += (n - i)/(i + 1);
        
        A = n + expressao;
        System.out.println("O valor da expressão de A é igual a " + A + ".");
        
    }
}
