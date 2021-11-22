import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Endereco end1, end2, end3, end4, end5, end6, endereco;
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

        //try{

            // // LEITURA DOS 6 ENDEREÇOS PADRAO
            // // Endereço 1
            // System.out.print("Digite a rua: ");
            // rua = sc.nextLine();
            // System.out.print("Digite o número: ");
            // num = sc.nextInt();
            // System.out.print("Digite o bairro: ");
            // bairro = sc.nextLine();
            // System.out.print("Digite a cidade: ");
            // cidade = sc.nextLine();
            // System.out.print("Digite o CEP: ");
            // cep = sc.nextLine();
            // end1 = new Endereco(rua, num, bairro, cidade, cep);

            // // Endereço 2
            // System.out.print("Digite a rua: ");
            // rua = sc.nextLine();
            // System.out.print("Digite o número: ");
            // num = sc.nextInt();
            // System.out.print("Digite o bairro: ");
            // bairro = sc.nextLine();
            // System.out.print("Digite a cidade: ");
            // cidade = sc.nextLine();
            // System.out.print("Digite o CEP: ");
            // cep = sc.nextLine();
            // end2 = new Endereco(rua, num, bairro, cidade, cep);

            // // Endereço 3
            // System.out.print("Digite a rua: ");
            // rua = sc.nextLine();
            // System.out.print("Digite o número: ");
            // num = sc.nextInt();
            // System.out.print("Digite o bairro: ");
            // bairro = sc.nextLine();
            // System.out.print("Digite a cidade: ");
            // cidade = sc.nextLine();
            // System.out.print("Digite o CEP: ");
            // cep = sc.nextLine();
            // end3 = new Endereco(rua, num, bairro, cidade, cep);

            // // Endereço 4
            // System.out.print("Digite a rua: ");
            // rua = sc.nextLine();
            // System.out.print("Digite o número: ");
            // num = sc.nextInt();
            // System.out.print("Digite o bairro: ");
            // bairro = sc.nextLine();
            // System.out.print("Digite a cidade: ");
            // cidade = sc.nextLine();
            // System.out.print("Digite o CEP: ");
            // cep = sc.nextLine();
            // end4 = new Endereco(rua, num, bairro, cidade, cep);

            // // Endereço 4
            // System.out.print("Digite a rua: ");
            // rua = sc.nextLine();
            // System.out.print("Digite o número: ");
            // num = sc.nextInt();
            // System.out.print("Digite o bairro: ");
            // bairro = sc.nextLine();
            // System.out.print("Digite a cidade: ");
            // cidade = sc.nextLine();
            // System.out.print("Digite o CEP: ");
            // cep = sc.nextLine();
            // end5 = new Endereco(rua, num, bairro, cidade, cep);

            // // Endereço 5
            // System.out.print("Digite a rua: ");
            // rua = sc.nextLine();
            // System.out.print("Digite o número: ");
            // num = sc.nextInt();
            // System.out.print("Digite o bairro: ");
            // bairro = sc.nextLine();
            // System.out.print("Digite a cidade: ");
            // cidade = sc.nextLine();
            // System.out.print("Digite o CEP: ");
            // cep = sc.nextLine();
            // end6 = new Endereco(rua, num, bairro, cidade, cep);


            // LEITURA DOS FUNCIONARIOS
            // Funcionário 1
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
            System.out.print("Digite o salário do funcionário: ");
            salario = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite a função do funcionário: ");
            funcao = sc.nextLine();
            func1 = new Funcionario(nome, cpf, endereco, celular, salario, funcao);

            // Funcionário 2
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
            System.out.print("Digite o salário do funcionário: ");
            salario = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite a função do funcionário: ");
            funcao = sc.nextLine();
            func2 = new Funcionario(nome, cpf, endereco, celular, salario, funcao);

            // CLIENTES
            // Cliente 1
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

            // Cliente 2
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

            // FORNECEDORES
            // Fornecedor 1
            System.out.print("Digite a razão social: ");
            razaoSocial = sc.nextLine();
            System.out.print("Digite o nome fantasia: ");
            nomeFantasia = sc.nextLine();
            System.out.print("Digite o cnpj: ");
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

            // Fornecedor 2
            System.out.print("Digite a razão social: ");
            razaoSocial = sc.nextLine();
            System.out.print("Digite o nome fantasia: ");
            nomeFantasia = sc.nextLine();
            System.out.print("Digite o cnpj: ");
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

            // PRODUTOS
            // Produto 1
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod1 = new Produto(nomeProduto, valor, forn1);

            // Produto 2
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod2 = new Produto(nomeProduto, valor, forn1);

            // Produto 3
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod3 = new Produto(nomeProduto, valor, forn1);

            // Produto 4
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod4 = new Produto(nomeProduto, valor, forn1);

            // Produto 5
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod5 = new Produto(nomeProduto, valor, forn1);

            // Produto 6
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod6 = new Produto(nomeProduto, valor, forn2);

            // Produto 7
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod7 = new Produto(nomeProduto, valor, forn2);

            // Produto 8
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod8 = new Produto(nomeProduto, valor, forn2);

            // Produto 9
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod9 = new Produto(nomeProduto, valor, forn2);

            // Produto 10
            System.out.print("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextFloat();
            sc.nextLine();
            prod10 = new Produto(nomeProduto, valor, forn2);

            // COMPRAS
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

            // SAIDA
            comp1.listarCompra();
            comp2.listarCompra();
        //}

//    • Usar exceção para tratar entradas inválidas para os valores referente a produtos e salário do Funcionario.
//    • Inserir pelo menos 2 compras com no mínimo 5 produtos.
//    • Listar os Cliente, os Fornecedore e as Compras conforme citado acima.
//    • Inserir pelo menos 6 Enderecos, 2 Funcionarios, 2 Clientes, 2 Fornecedores, 10 Produtos

        // Endereco end1 = new Endereco("Rua Um", 1, "Centro", "Campo Grande", "79070001");
        // Endereco end2 = new Endereco("Rua Dois", 2, "Centro", "Campo Grande", "79070001");
        // Endereco end3 = new Endereco("Rua Tres", 3, "Centro", "Campo Grande", "79070001");
        // Endereco end4 = new Endereco("Rua Quatro", 4, "Centro", "Campo Grande", "79070001");
        // Endereco end5 = new Endereco("Rua Cinco", 5, "Centro", "Campo Grande", "79070001");
        // Endereco end6 = new Endereco("Rua Seis", 6, "Centro", "Campo Grande", "79070001");  
        
        // Funcionario func1 = new Funcionario("Eduardo", "10213293986", end1, "67934567323", 100000, "Estagiário");
        // Funcionario func2 = new Funcionario("Everton", "04653302154", end2, "67997634856", 5000, "Gerente de processos");
        
        // Cliente c1 = new Cliente("Valdemar", "10213293986", end3, "67996436522");
        // Cliente c2 = new Cliente("Rosângela", "10213293986", end4, "67993254327");
        
        // Fornecedor forn1 = new Fornecedor("Silva & Santos", "Loja TOP", "99696821000171", end5, "67934657875");
        // Fornecedor forn2 = new Fornecedor("Oliveira e CIA LTDA", "Supermercado Padrão", "75832476000198", end6, "67934892345");
       
        // Produto prod0 = new Produto("Pão", 5.50f, forn1);
        // Produto prod1 = new Produto("Mussarela", 10.50f, forn1);
        // Produto prod2 = new Produto("Presunto", 25.0f, forn1);
        // Produto prod3 = new Produto("Banana Nanica", 3.75f, forn1);
        // Produto prod4 = new Produto("Banana Gigante", 5f, forn1);
        // Produto prod5 = new Produto("Carolina", 100f, forn2);
        // Produto prod6 = new Produto("Gol", 55000.25f, forn2);
        // Produto prod7 = new Produto("Borracha", 0.75f, forn2);
        // Produto prod8 = new Produto("Macbook", 30000f, forn2);
        // Produto prod9 = new Produto("Pão Dormido", 1f, forn2);

        // Compra compra1 = new Compra(func1, c1);
        // compra1.adicionaProduto(prod0);
        // compra1.adicionaProduto(prod1);
        // compra1.adicionaProduto(prod2);
        // compra1.adicionaProduto(prod4);
        // compra1.adicionaProduto(prod9);
        
        // Compra compra2 = new Compra(func1, c2);
        // compra2.adicionaProduto(prod3);
        // compra2.adicionaProduto(prod5);
        // compra2.adicionaProduto(prod6);
        // compra2.adicionaProduto(prod8);
        // compra2.adicionaProduto(prod7);
        
        // System.out.println(end1);
        // System.out.println(end2);
        // System.out.println(end3);
        // System.out.println(end4);
        // System.out.println(end5);
        // System.out.println(end6);

        // System.out.println(func1);
        // System.out.println(func2);
        
        // System.out.println(c1);
        // System.out.println(c2);

        // System.out.println(forn1);
        // System.out.println(forn2);

        // compra1.listarCompra();
        // System.out.println();
        // compra2.listarCompra();
    }
}
