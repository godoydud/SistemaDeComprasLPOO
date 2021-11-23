public class Funcionario extends Pessoa {

    double salario;
    String funcao;

    public Funcionario(String nome, String cpf, Endereco endereco, String celular, double salario, String funcao) {
        super(nome, cpf, endereco, celular);
        this.salario = salario;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + getCelular() + ", Função: " + this.funcao + ", Salário: R$" + this.salario;
    }

}
