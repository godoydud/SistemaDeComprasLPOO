
/**
 *
 * @author Godoy
 */
public class Funcionario extends Pessoa {

    double salario;
    String funcao;

    public Funcionario(String nome, String cpf, String celular, Endereco endereco, double salario, String funcao) {
        super(nome, cpf, celular, endereco);
        this.salario = salario;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return " " + funcao + " " + salario + " " + getNome() + " "
                + getCpf() + " " + getCelular();
    }

}
