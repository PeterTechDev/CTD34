public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String numeroConta; // como é um número que não será usado em calculo pode usar string

    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario(){
        double quantia;
        quantia = calcularPagamento();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    protected abstract double calcularPagamento();
    protected abstract void imprimirRecibo(double quantia);
    protected void depositar(double quantia){
        System.out.println("Foi depositado uma quantia de "+ quantia + " na conta " + numeroConta);
    }

}
