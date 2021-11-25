public class Endereco {
    // Atributos
    private String rua, bairro, cidade, cep;
    private int numero;

    // Construtor com CEP
    public Endereco(String rua, int numero, String bairro, String cidade, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    // Construtor sem CEP
    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
