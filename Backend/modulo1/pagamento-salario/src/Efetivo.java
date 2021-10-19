public class Efetivo extends Funcionario{
    private double salarioBasico; // ver diferença double inicio maisculo e minuscula
    private double descontos;
    private double bonicacoes;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBasico, double descontos, double bonicacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBasico = salarioBasico;
        this.descontos = descontos;
        this.bonicacoes = bonicacoes;
    }

    @Override
    public double calcularPagamento() { return salarioBasico+bonicacoes-descontos;  }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Foi gerado um recibo impresso na quantia de: "+ quantia);
    }
}
