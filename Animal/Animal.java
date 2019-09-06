package Animal;

public class Animal {
    private String nome;
    private String raca;
   
    public Animal(){}
   
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    public Animal(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    
    public void caminha(String nome){
        System.out.print("Está caminhando, o " + nome);
       
    }
   
}
