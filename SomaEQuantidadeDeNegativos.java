import java.util.Scanner;
public class SomaEQuantidadeDeNegativos {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int inteiros, soma = 0, negativos = 0;
        
        System.out.println("Digite os 50 valores a serem verificados.");
        for(int i = 0; i < 50; i++){
            inteiros = ler.nextInt();
            if(inteiros < 0)
                negativos ++;
            else{
                soma += inteiros;
            }
        }
        System.out.println("A soma dos inteiros positivos é igual a " + soma + ".");
        System.out.println("A quantidade de valores negativos é igual a " + negativos + ".");
    
    }
}
