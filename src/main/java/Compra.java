import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Funcionario funcionario;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public Compra(Funcionario funcionario, Cliente cliente) {
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    
    public void adicionaProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public void listarCompra(){
//        O método listar compra deverá informar o Funcionário que fez a venda e o cliente que
//        fez a compra
//        Em seguida, deverá listar todos os produtos comprados pelo cliente ordenado do menor
//        para o maior valor do produto
//        Ao final mostrar o valor total da compra.
//        O valor do Produto impresso deve possuir 2 casas decimais.
    }
    
    
}
