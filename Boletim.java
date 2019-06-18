import java.util.Scanner;
public class Boletim {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double nota1, nota2, nota3, nota4, media = 0;
        System.out.println("Nota do primeiro bimestre:");
        nota1 = ler.nextDouble();
        System.out.println("Nota do segundo bimestre:");
        nota2 = ler.nextDouble();
        System.out.println("Nota do terceiro bimestre:");
        nota3 = ler.nextDouble();
        System.out.println("Nota do quarto bimestre:");
        nota4 = ler.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Media dos bimestres: " + media);
        
        if(media >= 7.0)
            System.out.println("Situacao: APROVADO");
        else{
            System.out.println("Situacao: REPROVADO");
            
        }
        
    }
}
