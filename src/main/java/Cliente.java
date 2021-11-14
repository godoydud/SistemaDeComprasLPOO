/**
 *
 * @author Godoy
 */
public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String celular, Endereco endereco) {
        super(nome, cpf, celular, endereco);
    }

    @Override
    public String toString() {
        return " " + getNome() + " " + getCpf() + " " + getCelular();
    }
}
