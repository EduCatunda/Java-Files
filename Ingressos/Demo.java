package Ingressos;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Ingresso i = new Ingresso();
        i.Valor = 100.00;
        i.imprimeValor(); 
        
        
        boolean bo = true;
        int escolhe;
        while(bo == true){
            System.out.println("Qual tipo de ingresso deseja comprar? ");
            System.out.println("| 1 - Normal |");
            System.out.println("| 2 - VIP    |");
            escolhe = ler.nextInt();
            if(escolhe == 1){
                Normal n = new Normal();
                n.imprimeValorN(i.Valor);
                bo = false;
            }
            else if(escolhe == 2){
                VIP vip = new VIP();
                vip.ValorAdd();
                vip.imprimeValorV();
                bo = false;
                
                boolean boo = true;
                while(boo == true){
                    System.out.println("Escolha a opção do ingresso VIP: ");
                    System.out.println("| 1 - Camarote Superior |");
                    System.out.println("| 2 - Camarote Inferior |");
                    escolhe = ler.nextInt();
                    if(escolhe == 1){
                        CamaroteSuperior cs = new CamaroteSuperior();
                        cs.ValorAdd();
                        cs.imprimeValorCS();
                        boo = false;
                    }
                    else if(escolhe == 2){
                        CamaroteInferior ci = new CamaroteInferior();
                        ci.setLocal("Camarote Inferior");
                        System.out.println("Localização: " + ci.getLocal());
                        ci.imprimeValorCI();
                        
                        boo = false;
                    }
                    else
                        System.out.println("Opção Inválida!");
                }
            }
            else
                System.out.println("Opção Inválida!");
        }
    }
}
