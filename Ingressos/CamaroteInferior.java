package Ingressos;

public class CamaroteInferior extends VIP {
    private String Local;
    
    public void setLocal(String local){
        this.Local = local;
    }
    public String getLocal(){
        return Local;
    }
    public void imprimeValorCI(){
        System.out.println("Valor do Ingresso VIP (Camarote Inferior): R$" + super.ValorAdd());
    }
}
