
/*minha ideia foi criar tipo uma empresa (que só tenha dois funcionários kk) e gerenciar salário e estatisticas, como média de filhos, por exemplo.*/

public class Pessoa {
public String nome;
public int idade;
public String cargo; // Função dentro da empresa.
public int salario;
public String CestaBasica; // Depende do numero de filhos.
public int HoraExtra; // Por quanto tempo (em horas) a Pessoa fez hora extra.
public int DiasFerias; // Quantos dias de férias a Pessoa tem por ano.
public int filhos; // Números de filhos.

public Pessoa(String nome, int idade, String cargo, int salario, int filhos, String CestaBasica, int HoraExtra, int DiasFerias){
this.nome = nome;
this.idade = idade;
this.cargo = cargo;
this.salario = salario;
this.filhos = filhos;
this.CestaBasica = CestaBasica;
this.HoraExtra = HoraExtra;
this.DiasFerias = DiasFerias;

System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
System.out.println("Cargo: " + cargo);
System.out.println("Número de filhos: " + filhos);
System.out.println("Possui cesta básica: " + CestaBasica);
System.out.println("Horas extras no mês: " + HoraExtra);
System.out.println("Dias de férias no ano: " + DiasFerias);
System.out.println("-------------------------------------");
}
public double mediaSalário(double a, double b){
double mediaS = (a + b) / 2;
return mediaS;
}
public double mediaFilhos(double a, double b){
double mediaF = (a + b) / 2;
return mediaF;
}
public double maiorSalario(double a, double b){
double maiorS;
if(a >= b)
maiorS = a;
else maiorS = b;
return maiorS;
}
public double redefinirSalario(int a){
double redifSalario = 0;
double aumento;
if(HoraExtra >= 30){
int i = HoraExtra - 30;
aumento = a * (i+10)/100; // Adiciona 10% ao salário do trabalhador de acordo com horas extras.
redifSalario = a + aumento;
}
else redifSalario = a;
return redifSalario;
}

public static void main(String[] args) {
Pessoa p1 = new Pessoa ("TIMBOOOO", 21, "Operário de Sistemas", 2500, 0, "Não", 50, 31);

Pessoa p2 = new Pessoa ("Gol do André Luis", 45, "Engenheiro Elétrico", 6750, 3, "Sim", 3, 51);

System.out.println("Redefinição de salários - Adiciona 10% ao salário do trabalhador de acordo com horas extras.");
System.out.println("Novo salário de " + p1.nome + ": " + p1.redefinirSalario(p1.salario) + " reais");
System.out.println("Novo salário de " + p2.nome + ": " + p2.redefinirSalario(p2.salario) + " reais");

System.out.println("=====================================");
System.out.println("Estatísticas da Empresa:");
System.out.println("Média do número de filhos: " + p1.mediaFilhos(p1.filhos, p2.filhos) + " filho(s).");
System.out.println("Média de salário: " + p1.mediaSalário(p1.redefinirSalario(p1.salario), p2.redefinirSalario(p2.salario)) + " reais.");
System.out.println("Maior salário: " + p1.maiorSalario(p1.redefinirSalario(p1.salario), p2.redefinirSalario(p2.salario)) + " reais.");
}
}