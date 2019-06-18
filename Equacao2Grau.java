import java.util.Scanner;
public class Equacao2Grau {
public static void main(String[] args){

int a = 0, b = 0, c = 0;

Scanner in = new Scanner(System.in);
while(a == 0){
    System.out.println("Uma equação do 2º grau é expressa da seguinte forma: a*x^2 + b*x +c") ; 
    System.out.println("Digite o valor de a: ");
        a = in.nextInt();
    if(a == 0)
        System.out.println("Essa equação não é do segundo grau!!");
}
    System.out.println("Digite o valor de b: ");
        b = in.nextInt();
    System.out.print("Digite o valor de c: ");
        c = in.nextInt();
    
double delta = (b*b)-4*a*c;

if(delta>0){
System.out.println("Delta = " + delta);
System.out.println("Essa equação possui duas raízes");
double x1 = (-b+Math.sqrt(delta))/(2*a);
double x2 = (-b-Math.sqrt(delta))/(2*a); 
System.out.println("A primeira raiz X1 dessa equação é = " + x1);
System.out.println("A segunda raiz X2 dessa equação é = " + x2);
}else if(delta == 0){
System.out.println("Delta = 0");
System.out.println("Essa equação possui apenas uma raiz");
double x1 = (-b+Math.sqrt(delta))/(2*a);
System.out.println("A raiz X1 dessa equação é = "+x1);

}else{
System.out.println("Delta < 0");
System.out.println("Essa equação não possui raízes nos reais"); 
}
}
}
