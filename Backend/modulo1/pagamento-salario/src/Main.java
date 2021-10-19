public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Efetivo("Odair", "Antunes", "12358413", 5000.0, 1000.0, 500.0);


        funcionario.pagamentoSalario();
        System.out.println("-------------------------------------");

        funcionario = new Contratado("Marlene", "Peixoto", "321454", 100.0, 80);

        funcionario.pagamentoSalario();

    }
}
