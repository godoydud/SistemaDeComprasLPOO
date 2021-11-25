public class Funcionario extends Pessoa {

    // Atributos
    private double salario;
    private String funcao;

    // Construtor
    public Funcionario(String nome, String cpf, Endereco endereco, String celular, double salario, String funcao) {
        super(nome, cpf, endereco, celular);
        this.salario = salario;
        this.funcao = funcao;
    }

    // Método para printar
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getCelular() + "\nFunção: " + this.funcao + "\nSalário: R$" + this.salario;
    }

}
