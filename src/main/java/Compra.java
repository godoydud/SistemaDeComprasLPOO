import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Compra {
    // Atributos
    private Funcionario funcionario;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    // Construtor
    public Compra(Funcionario funcionario, Cliente cliente) {
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    
    // Método para adicionar produtos à uma compra
    public void adicionaProduto(Produto prod){
        this.produtos.add(prod);
    }
    
    // Método para printar os produtos de uma compra ordenados a partir do produto com menor valor.
    public void listarCompra(){
        float soma = 0;

        System.out.printf("\nFuncionário: %s \nCliente: %s\n", this.funcionario.getNome(), this.cliente.getNome());

        Collections.sort(produtos);
        System.out.printf("%-16s  %15s\n", "PRODUTO", "PREÇO");
        System.out.println("___________________________________");
        for (Produto produto : produtos){
            System.out.printf("|%-15s | %15.2f|\n", produto.getNomeProduto(), produto.getValor());
            soma += produto.getValor();
        }
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.printf("Total: %.2f\n\n", soma);
    }
}
