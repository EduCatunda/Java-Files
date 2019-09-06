package Ingressos;

public class CamaroteSuperior extends VIP {
    public double ValorCS = 30;
    
    public double ValorAdd (){
        return ValorCS += super.ValorAdd();
    }
    public void imprimeValorCS(){
        System.out.println("Valor do Ingresso VIP (Camarote Superior): R$" + ValorCS);
    }
}
