import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Compra {
    private Funcionario funcionario;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public Compra(Funcionario funcionario, Cliente cliente) {
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    
    public void adicionaProduto(Produto prod){
        this.produtos.add(prod);
    }
    
    public void listarCompra(){
//        O método listar compra deverá informar o Funcionário que fez a venda e o cliente que
//        fez a compra
//        Em seguida, deverá listar todos os produtos comprados pelo cliente ordenado do menor
//        para o maior valor do produto
//        Ao final mostrar o valor total da compra.
//        O valor do Produto impresso deve possuir 2 casas decimais.
        float soma = 0;

        System.out.printf("\nFuncionário: %s, Cliente: %s\n\n", this.funcionario.getNome(), this.cliente.getNome());

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
