import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    • Usar exceção para tratar entradas inválidas para os valores referente a produtos e salário do Funcionario.
//    • Inserir pelo menos 2 compras com no mínimo 5 produtos.
//    • Listar os Cliente, os Fornecedore e as Compras conforme citado acima.
//    • Inserir pelo menos 6 Enderecos, 2 Funcionarios, 2 Clientes, 2 Fornecedores, 10 Produtos

        Endereco end1 = new Endereco("Rua Um", 1, "Centro", "Campo Grande", "79070001");
        Endereco end2 = new Endereco("Rua Dois", 2, "Centro", "Campo Grande", "79070001");
        Endereco end3 = new Endereco("Rua Tres", 3, "Centro", "Campo Grande", "79070001");
        Endereco end4 = new Endereco("Rua Quatro", 4, "Centro", "Campo Grande", "79070001");
        Endereco end5 = new Endereco("Rua Cinco", 5, "Centro", "Campo Grande", "79070001");
        Endereco end6 = new Endereco("Rua Seis", 6, "Centro", "Campo Grande", "79070001");  
        
        Funcionario func1 = new Funcionario("Eduardo", "10213293986", end1, "67934567323", 100000, "Estagiário");
        Funcionario func2 = new Funcionario("Everton", "04653302154", end2, "67997634856", 5000, "Gerente de processos");
        
        Cliente c1 = new Cliente("Valdemar", "10213293986", end3, "67996436522");
        Cliente c2 = new Cliente("Rosângela", "10213293986", end4, "67993254327");
        
        Fornecedor forn1 = new Fornecedor("Silva & Santos", "Loja TOP", "99696821000171", end5, "67934657875");
        Fornecedor forn2 = new Fornecedor("Oliveira e CIA LTDA", "Supermercado Padrão", "75832476000198", end6, "67934892345");
       
        Produto prod0 = new Produto("Pão", 5.50f, forn1);
        Produto prod1 = new Produto("Mussarela", 10.50f, forn1);
        Produto prod2 = new Produto("Presunto", 25.0f, forn1);
        Produto prod3 = new Produto("Banana Nanica", 3.75f, forn1);
        Produto prod4 = new Produto("Banana Gigante", 5f, forn1);
        Produto prod5 = new Produto("Carolina", 100f, forn2);
        Produto prod6 = new Produto("Gol", 55000.25f, forn2);
        Produto prod7 = new Produto("Borracha", 0.75f, forn2);
        Produto prod8 = new Produto("Macbook", 30000f, forn2);
        Produto prod9 = new Produto("Pão Dormido", 1f, forn2);

        Compra compra1 = new Compra(func1, c1);
        compra1.adicionaProduto(prod0);
        compra1.adicionaProduto(prod1);
        compra1.adicionaProduto(prod2);
        compra1.adicionaProduto(prod4);
        compra1.adicionaProduto(prod9);
        
        Compra compra2 = new Compra(func1, c2);
        compra2.adicionaProduto(prod3);
        compra2.adicionaProduto(prod5);
        compra2.adicionaProduto(prod6);
        compra2.adicionaProduto(prod8);
        compra2.adicionaProduto(prod7);
        
        System.out.println(end1);
        System.out.println(end2);
        System.out.println(end3);
        System.out.println(end4);
        System.out.println(end5);
        System.out.println(end6);

        System.out.println(func1);
        System.out.println(func2);
        
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(forn1);
        System.out.println(forn2);

        compra1.listarCompra();
        System.out.println();
        compra2.listarCompra();
    }
}
