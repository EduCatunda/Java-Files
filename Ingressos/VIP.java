
package Ingressos;

public class VIP extends Ingresso {
    public double ValorVip = 80;
    
    public double ValorAdd (){
        return ValorVip += super.Valor;
    }
    public void imprimeValorV(){
        System.out.println("Valor do Ingresso VIP: R$" + ValorVip);
    }
}
