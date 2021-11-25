public class Produto implements Comparable<Produto>{
    private String nomeProduto;
    private Float valor;
    private Fornecedor empresa;

    public Produto(String nomeProduto, float valor, Fornecedor empresa) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.empresa = empresa;
    }

    public int compareTo(Produto produto){
        return this.getValor().compareTo(produto.getValor());
    }

    @Override
    public String toString() {
        return "Produto: " + this.nomeProduto + ", Preço: R$" + this.valor;
    }

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
