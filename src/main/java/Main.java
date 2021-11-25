import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Endereco endereco;
        Funcionario func1, func2;
        Cliente c1, c2;
        String rua, bairro, cidade, cep;
        int num;

        String nome, cpf, celular, funcao;
        double salario;

        Fornecedor forn1, forn2;
        String razaoSocial, nomeFantasia, cnpj, celularForn;

        Produto prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10;
        String nomeProduto;
        Float valor;

        Compra comp1, comp2;

        
        // LEITURA DOS FUNCIONARIOS
        // Funcionário 1
        System.out.println("\n--------Funcionário 1--------");
        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF do funcionário: ");
        cpf = sc.nextLine();
        System.out.print("Digite a rua do funcionário: ");
        rua = sc.nextLine();
        System.out.print("Digite o número da residência do funcionário: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o bairro do funcionário: ");
        bairro = sc.nextLine();
        System.out.print("Digite a cidade do funcionário: ");
        cidade = sc.nextLine();
        System.out.print("Digite o CEP do funcionário: ");
        cep = sc.nextLine();
        endereco = new Endereco(rua, num, bairro, cidade, cep);
        System.out.print("Digite o número do funcionário: ");
        celular = sc.nextLine();
        try{
            System.out.print("Digite o salário do funcionário: ");
            salario = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            salario = 0;
        }
        System.out.print("Digite a função do funcionário: ");
        funcao = sc.nextLine();
        func1 = new Funcionario(nome, cpf, endereco, celular, salario, funcao);
        System.out.println();

        // Funcionário 2
        System.out.println("--------Funcionário 2--------");
        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF do funcionário: ");
        cpf = sc.nextLine();
        System.out.print("Digite a rua do funcionário: ");
        rua = sc.nextLine();
        System.out.print("Digite o número da residência do funcionário: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o bairro do funcionário: ");
        bairro = sc.nextLine();
        System.out.print("Digite a cidade do funcionário: ");
        cidade = sc.nextLine();
        System.out.print("Digite o CEP do funcionário: ");
        cep = sc.nextLine();
        endereco = new Endereco(rua, num, bairro, cidade, cep);
        System.out.print("Digite o número do funcionário: ");
        celular = sc.nextLine();
        try{
            System.out.print("Digite o salário do funcionário: ");
            salario = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            salario = 0;
        }
        System.out.print("Digite a função do funcionário: ");
        funcao = sc.nextLine();
        func2 = new Funcionario(nome, cpf, endereco, celular, salario, funcao);
        System.out.println();

        // LEITURA DOS CLIENTES
        // Cliente 1
        System.out.println("----------Cliente 1----------");
        System.out.print("Digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cpf = sc.nextLine();
        System.out.print("Digite a rua do cliente: ");
        rua = sc.nextLine();
        System.out.print("Digite o número da residência do cliente: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o bairro do cliente: ");
        bairro = sc.nextLine();
        System.out.print("Digite a cidade do cliente: ");
        cidade = sc.nextLine();
        System.out.print("Digite o CEP do cliente: ");
        cep = sc.nextLine();
        endereco = new Endereco(rua, num, bairro, cidade, cep);
        System.out.print("Digite o número do cliente: ");
        celular = sc.nextLine();
        c1 = new Cliente(nome, cpf, endereco, celular);
        System.out.println();

        // Cliente 2
        System.out.println("----------Cliente 2----------");
        System.out.print("Digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cpf = sc.nextLine();
        System.out.print("Digite a rua do cliente: ");
        rua = sc.nextLine();
        System.out.print("Digite o número da residência do cliente: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o bairro do cliente: ");
        bairro = sc.nextLine();
        System.out.print("Digite a cidade do cliente: ");
        cidade = sc.nextLine();
        System.out.print("Digite o CEP do cliente: ");
        cep = sc.nextLine();
        endereco = new Endereco(rua, num, bairro, cidade, cep);
        System.out.print("Digite o número do cliente: ");
        celular = sc.nextLine();
        c2 = new Cliente(nome, cpf, endereco, celular);
        System.out.println();

        // LEITURA DOS FORNECEDORES
        // Fornecedor 1
        System.out.println("--------Fornecedor 1--------");
        System.out.print("Digite a razão social: ");
        razaoSocial = sc.nextLine();
        System.out.print("Digite o nome fantasia: ");
        nomeFantasia = sc.nextLine();
        System.out.print("Digite o CNPJ: ");
        cnpj = sc.nextLine();
        System.out.print("Digite a rua do fornecedor: ");
        rua = sc.nextLine();
        System.out.print("Digite o número da residência do fornecedor: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o bairro do fornecedor: ");
        bairro = sc.nextLine();
        System.out.print("Digite a cidade do fornecedor: ");
        cidade = sc.nextLine();
        System.out.print("Digite o CEP do fornecedor: ");
        cep = sc.nextLine();
        endereco = new Endereco(rua, num, bairro, cidade, cep);
        System.out.print("Digite o celular do fornecedor: ");
        celularForn = sc.nextLine();
        forn1 = new Fornecedor(razaoSocial, nomeFantasia, cnpj, endereco, celularForn);
        System.out.println();

        // Fornecedor 2
        System.out.println("--------Fornecedor 2--------");
        System.out.print("Digite a razão social: ");
        razaoSocial = sc.nextLine();
        System.out.print("Digite o nome fantasia: ");
        nomeFantasia = sc.nextLine();
        System.out.print("Digite o CNPJ: ");
        cnpj = sc.nextLine();
        System.out.print("Digite a rua do fornecedor: ");
        rua = sc.nextLine();
        System.out.print("Digite o número da residência do fornecedor: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o bairro do fornecedor: ");
        bairro = sc.nextLine();
        System.out.print("Digite a cidade do fornecedor: ");
        cidade = sc.nextLine();
        System.out.print("Digite o CEP do fornecedor: ");
        cep = sc.nextLine();
        endereco = new Endereco(rua, num, bairro, cidade, cep);
        System.out.print("Digite o celular do fornecedor: ");
        celularForn = sc.nextLine();
        forn2 = new Fornecedor(razaoSocial, nomeFantasia, cnpj, endereco, celularForn);
        System.out.println();

        // LEITURA DOS PRODUTOS
        // Produto 1
        System.out.println("---------Produto 1---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod1 = new Produto(nomeProduto, valor, forn1);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod1 = new Produto(nomeProduto, 0, forn1);
        }
        System.out.println();
        
        // Produto 2
        System.out.println("---------Produto 2---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod2 = new Produto(nomeProduto, valor, forn1);
        } catch (InputMismatchException e) {
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod2 = new Produto(nomeProduto, 0, forn1);
        }
        System.out.println();

        // Produto 3
        System.out.println("---------Produto 3---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod3 = new Produto(nomeProduto, valor, forn1);
        } catch (InputMismatchException e) {
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod3 = new Produto(nomeProduto, 0, forn1);
        }
        System.out.println();

        // Produto 4
        System.out.println("---------Produto 4---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod4 = new Produto(nomeProduto, valor, forn1);
        } catch (InputMismatchException e) {
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod4 = new Produto(nomeProduto, 0, forn1);
        }
        System.out.println();

        // Produto 5
        System.out.println("---------Produto 5---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod5 = new Produto(nomeProduto, valor, forn1);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod5 = new Produto(nomeProduto, 0, forn1);

        }
        System.out.println();

        // Produto 6
        System.out.println("---------Produto 6---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod6 = new Produto(nomeProduto, valor, forn2);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod6 = new Produto(nomeProduto, 0, forn2);

        }
        System.out.println();

        // Produto 7
        System.out.println("---------Produto 7---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod7 = new Produto(nomeProduto, valor, forn2);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod7 = new Produto(nomeProduto, 0, forn2);
        }
        System.out.println();

        // Produto 8
        System.out.println("---------Produto 8---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try {
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod8 = new Produto(nomeProduto, valor, forn2);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod8 = new Produto(nomeProduto, 0, forn2);
        }
        System.out.println();

        // Produto 9
        System.out.println("---------Produto 9---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod9 = new Produto(nomeProduto, valor, forn2);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod9 = new Produto(nomeProduto, 0, forn2);
        }
        System.out.println();

        // Produto 10
        System.out.println("---------Produto 10---------");
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        try{
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod10 = new Produto(nomeProduto, valor, forn2);
        } catch (InputMismatchException e){
            System.out.println("->Entrada inválida.\nDefinindo valor padrão (0)");
            prod10 = new Produto(nomeProduto, 0, forn2);
        }
        System.out.println();
        sc.close();

        // ADIÇÃO DAS COMPRAS
        // Compra 1
        comp1 = new Compra(func1, c1);
        comp1.adicionaProduto(prod1);
        comp1.adicionaProduto(prod2);
        comp1.adicionaProduto(prod3);
        comp1.adicionaProduto(prod4);
        comp1.adicionaProduto(prod5);
        
        // Compra 2
        comp2 = new Compra(func2, c2);
        comp2.adicionaProduto(prod6);
        comp2.adicionaProduto(prod7);
        comp2.adicionaProduto(prod8);
        comp2.adicionaProduto(prod9);
        comp2.adicionaProduto(prod10);

        // SAÍDA
        // Funcionários
        System.out.println("->FUNCIONARIOS:");
        System.out.println(func1.toString());
        System.out.println();
        System.out.println(func2.toString());
        System.out.println();

        // Clientes
        System.out.println("->CLIENTES:");
        System.out.println(c1.toString());
        System.out.println();
        System.out.println(c2.toString());
        System.out.println();

        // Fornecedores
        System.out.println("->FORNECEDORES:");
        System.out.println(forn1.toString());
        System.out.println();
        System.out.println(forn2.toString());
        System.out.println();

        // Produtos
        System.out.println("->PRODUTOS:");
        System.out.println(prod1.toString());
        System.out.println("-------");
        System.out.println(prod2.toString());
        System.out.println("-------");
        System.out.println(prod3.toString());
        System.out.println("-------");
        System.out.println(prod4.toString());
        System.out.println("-------");
        System.out.println(prod5.toString());
        System.out.println("-------");
        System.out.println(prod6.toString());
        System.out.println("-------");
        System.out.println(prod7.toString());
        System.out.println("-------");
        System.out.println(prod8.toString());
        System.out.println("-------");
        System.out.println(prod9.toString());
        System.out.println("-------");
        System.out.println(prod10.toString());
        System.out.println();

        // Saída compras
        System.out.println("->COMPRAS:");
        comp1.listarCompra();
        comp2.listarCompra();
    }
}
