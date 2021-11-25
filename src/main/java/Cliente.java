public class Cliente extends Pessoa {

    // Construtor
    public Cliente(String nome, String cpf, Endereco endereco, String celular) {
        super(nome, cpf, endereco, celular);
    }

    // Método para printar
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getCelular();
    }
}
