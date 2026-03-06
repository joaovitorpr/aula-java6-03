package br.com.fiap.bean;

public class FolhaDePagamento {
    //atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontosINSS;
    public double valorPlanoDeSaude;
    double resultadoLiquido;
    //métodos
    public void calcularSalarioLiquido() {
        salarioBruto = 100000;
        numeroDeDependentes = 4;
        descontosINSS = 20;
        valorPlanoDeSaude = 500 * (numeroDeDependentes);

        resultadoLiquido = salarioBruto - (valorPlanoDeSaude) * (descontosINSS/100);



    }
}
