public class Main {
    public static void main(String[] args) {


//    • Usar exceção para tratar entradas inválidas para os valores referente a produtos e salário do Funcionario.
//    • Inserir pelo menos 2 compras com no mínimo 5 produtos.
//    • Listar os Cliente, os Fornecedore e as Compras conforme citado acima.

//    • Inserir pelo menos 6 Enderecos, 2 Funcionarios, 2 Clientes, 2 Fornecedores, 10 Produtos
        Endereco end1 = new Endereco("Rua Um", "Centro", "Campo Grande", "79070001", 1);
        Endereco end2 = new Endereco("Rua Dois", "Centro", "Campo Grande", "79070001", 2);
//        Endereco end3 = new Endereco("Rua Tres", "Centro", "Campo Grande", "79070001", 3);
//        Endereco end4 = new Endereco("Rua Quatro", "Centro", "Campo Grande", "79070001", 4);
//        Endereco end5 = new Endereco("Rua Cinco", "Centro", "Campo Grande", "79070001", 5);
//        Endereco end6 = new Endereco("Rua Seis", "Centro", "Campo Grande", "79070001", 6);  
        
        Funcionario func1 = new Funcionario("Eduardo", "013434", "67934567323", end1, 910, "Estagiário");
        Funcionario func2 = new Funcionario("Everton", "04653302154", "67997634856", end2, 5000, "Gerente de processos");
        
//        Cliente c1 = new Cliente("Valdemar", "09387234656", "67996436522", end3);
//        Cliente c2 = new Cliente("Rosângela", "05476583262", "67993254327", end4);
//        
//        Fornecedor forn1 = new Fornecedor("Silva & Santos", "Loja TOP", "99696821000171", "67934657875", end5);
//        Fornecedor forn2 = new Fornecedor("Oliveira e CIA LTDA", "Supermercado Padrão", "75832476000198", "67934892345", end6);
//        
       // System.out.println(func2.validar(func2.getCpf()));
        
       
        
        
    }
}
