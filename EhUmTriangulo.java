import java.util.Scanner;
public class EhUmTriangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o primeiro lado do triangulo ");
        a = ler.nextInt();
        System.out.println("Digite o segundo lado do triangulo ");
        b = ler.nextInt();
        System.out.println("Digite o terceiro lado do triangulo ");
        c = ler.nextInt();
        
        /*| b - c | < a < b + c
        | a - c | < b < a + c
        | a - b | < c < a + b*/
        
        if( Math.abs(b - c) < a && a < b + c && Math.abs(a - c) < b && b < a + c && Math.abs(a - b) < c && c < a + b ){
            System.out.println("Esse triangulo existe!");
            if(a != b && a != c && b != c )
                System.out.println("Esse triângulo é escaleno! (Todos os lados diferentes)");
            else if(a == b && a != c || b == c && a != c || a == c && a != b)
                System.out.println("Esse triângulo é isósceles! (Dois lados iguais)");
            else System.out.println("Esse triângulo é isósceles! (Todos os lados iguais)");
        }
        else System.out.println("Esse triangulo não existe.");
        
        /*Triângulo escaleno: Todos os lados e ângulos são diferentes.
        Triângulos isósceles: dois lados iguais e os ângulos opostos a esses lados iguais. 
        Triângulo equilátero: Todos os lados e ângulos iguais. Concluímos que seus ângulos serão de 60°. */
    
    }
}