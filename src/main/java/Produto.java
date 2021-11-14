/**
 *
 * @author Godoy
 */
public class Produto implements Comparable<Produto>{
    private String nomeProduto;
    private float valor;
    private Fornecedor empresa;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Fornecedor empresa) {
        this.empresa = empresa;
    }

    
    public Produto(String nomeProduto, float valor, Fornecedor empresa) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.empresa = empresa;
    }
    
   public int compareTo(Produto produto){
       return (int) (this.getValor() - produto.getValor());
   }

    @Override
    public String toString() {
        return "Produto{" + "nomeProduto=" + nomeProduto + ", valor=" + valor + ", empresa=" + empresa + '}';
    }
    
    
    
    
    
}
