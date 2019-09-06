package Animal;

import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Animal a1 = new Animal();
        Gato g1 = new Gato();
        Cachorro c1 = new Cachorro();
        Animal a2 = new Animal("Leão", "Geopardo");
       
        int escolhe = 0;
        boolean bo = true;
        while(bo == true){
            System.out.println("Qual o seu animal?");
            System.out.println("| 1 - Gato     |");
            System.out.println("| 2 - Cachorro |");
            escolhe = ler.nextInt();
            if(escolhe == 1 || escolhe == 2)
                bo = false;
            else System.out.println("Opção inválida!");
        }
       
        System.out.println("Qual o nome do seu animal? ");
        String nomeA = ler.next();
        a1.setNome(nomeA);
       
        System.out.println("Qual a raça do seu animal? ");
        String racaA = ler.next();
        a1.setRaca(racaA);
       
        String miar = "";
        String latir = "";
       
        if(escolhe == 1){
            System.out.print("Qual o som do miado do seu gato? ");
            miar = ler.next();
        }
        else{
            System.out.print("Qual o som do latido do seu cachorro? ");
            latir = ler.next();
        }
       
        bo = true;
        int escolhe2 = 0;
        int escolhe3 = 0;
        while(bo == true){
            System.out.println("O que deseja fazer? ");
            System.out.println("| 1 - Acompanhar o animal                 |");
            System.out.println("| 2 - Visualizar as informações do animal |");
            System.out.println("| 3 - Sair                                |");
            escolhe2 = ler.nextInt();
           
            if(escolhe2 == 1){ // Acompanhar o animal
                if(escolhe == 1){ //É um gato
                    //System.out.println(g1.caminha(a1.getNome()));
                    System.out.println("Deseja interagir? ");
                    System.out.println("| 1 - Sim |");
                    System.out.println("| 2 - Não |");
                    escolhe3 = ler.nextInt();
                    if(escolhe3 == 1) // Desejou interagir
                        System.out.println(g1.Miar(miar));
                   
                }
                else{ //É um cachorro
                    //System.out.println(c1.caminha(a1.getNome()));
                    System.out.println("Deseja interagir? ");
                    System.out.println("| 1 - Sim |");
                    System.out.println("| 2 - Não |");
                    escolhe3 = ler.nextInt();
                    if(escolhe3 == 1) // Desejou interagir
                        System.out.println(c1.Latir(latir));
                }  
            }
            else if(escolhe2 == 2){ // Visualizar as informações
                if(escolhe == 1) // Animal: Gato
                    System.out.println("Animal: Gato");
                else // Animal: Cachorro
                    System.out.println("Animal: Cachorro");
                System.out.println("Nome do animal: " + a1.getNome());
                System.out.println("Raça do animal: " + a1.getRaca());
               
            }
            else{
                System.out.println("Até mais!");
                bo = false;
            }
        }
    }
}