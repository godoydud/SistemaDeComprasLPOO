public class Produto implements Comparable<Produto>{
    // Atributos
    private String nomeProduto;
    private Float valor;
    private Fornecedor empresa;

    // Construtor
    public Produto(String nomeProduto, float valor, Fornecedor empresa) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.empresa = empresa;
    }

    // Método que faz com que a ordenação no listar compra seja do menor para o maior valor.
    @Override
    public int compareTo(Produto produto){
        return this.getValor().compareTo(produto.getValor());
    }

    // Método para printar
    @Override
    public String toString() {
        return "Produto: " + this.nomeProduto + ", Preço: R$" + this.valor;
    }

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Fornecedor getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Fornecedor empresa) {
        this.empresa = empresa;
    }
}
