import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolhe;
        boolean continuar = true;
        String compra = " ", nome, venda = " ";
        System.out.println("Bem vindo ao Menu!");
        System.out.println("Qual o seu nome?");
            nome = ler.nextLine();
        System.out.println("Qual produto deseja vender?");
            venda = ler.nextLine();
        System.out.println("Qual produto deseja comprar?");
            compra = ler.nextLine();
            
        while(continuar == true){
            System.out.println("================================");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("| 1 - Venda        |");
            System.out.println("| 2 - Vendedor     |");
            System.out.println("| 3 - Compra       |");
            System.out.println("| 4 - Produto      |");
            System.out.println("| 5 - Cliente      |");
            System.out.println("| 6 - Fornecedor   |");
            System.out.println("| 0 - Sair         |");

            escolhe = ler.nextInt();        

                switch(escolhe){
                    case 1:
                        System.out.println("Bem vindo à tela de vendas!");
                        System.out.println("Você vendeu " + venda + "!!" );
                        break;

                    case 2:
                        System.out.println("Você está na tela de Vendedor!");
                        System.out.println("O nome do vendedor é Duzão das Tapiocas!");
                        break;

                    case 3:
                        System.out.println("Você está na tela de Compra!");
                        System.out.println("Você comprou " + compra + "!!" );
                        break;

                    case 4:
                        System.out.println("Você está na tela de Produto!");
                        System.out.println("Seus produtos são: " + compra + " (comprou) e " + venda + " (vendeu)");
                        break;

                    case 5:
                        System.out.println("Você está na tela de Cliente!");
                        System.out.println("Nome do Cliente: " + nome);
                        break;

                    case 6:
                        System.out.println("Você está na tela de Fornecedor!");
                        System.out.println("Fornecedor: Coorporação da Prefeitura de Fortaleza dos Garis");
                        break;

                    case 0:
                        System.out.println("Você saiu do Menu");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Você digitou uma opção inválida!");


                }
        }   
    }
}