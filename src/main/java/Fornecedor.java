import java.util.InputMismatchException;
import java.util.Scanner;

public class Fornecedor implements Verificavel {
    Scanner sc = new Scanner(System.in);

    private String razaoSocial, nomeFantasia, cnpj, celular;
    private Endereco endereco;

    public Fornecedor(String razaoSocial, String nomeFantasia, String cnpj, Endereco endereco, String celular) {

        // obs: no construtor deve-se validar o CNPJ antes de atribuir o valor do cnpj
        // Então é preciso chamar o método para validar(String codigo)
        // Se o CNPJ estiver correto, ele será atribuído,
        // Caso contrário deverá solicitar um novo valor para o cnpj
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.celular = celular;
        this.endereco = endereco;

        // Validar CNPJ
        boolean check;
        check = validar(cnpj);
       
        if (!check)  
            solicitarNovo();
        else
            this.cnpj = cnpj;
    }

    @Override
    public boolean validar(String cnpj) {
        // Substituição dos caracteres especiais por uma concatenação
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("-", "");
        cnpj = cnpj.replace("/", "");

        if (cnpj.length() == 14) {
            try {
                Long.parseLong(cnpj);
            } catch (NumberFormatException e) {
                return false;
            }

            // Considera-se erro CNPJ's formados por uma sequencia de numeros iguais
            if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111")
                    || cnpj.equals("22222222222222") || cnpj.equals("33333333333333")
                    || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
                    || cnpj.equals("66666666666666") || cnpj.equals("77777777777777")
                    || cnpj.equals("88888888888888") || cnpj.equals("99999999999999") || (cnpj.length() != 14)) {
                return (false);
            }

            char dig13, dig14;
            int sm, i, r, num, peso;

            // "try" - protege o código para eventuais
            // erros de conversao de tipo (int)
            try {
                // Calculo do 1o. Digito Verificador
                sm = 0;
                peso = 2;
                for (i = 11; i >= 0; i--) {
                    // converte o i-ésimo caractere do CNPJ em um número
                    num = (int) (cnpj.charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso + 1;
                    if (peso == 10) {
                        peso = 2;
                    }
                }

                r = sm % 11;
                if ((r == 0) || (r == 1)) {
                    dig13 = '0';
                } else {
                    dig13 = (char) ((11 - r) + 48);
                }

                // Calculo do segundo Digito Verificador
                sm = 0;
                peso = 2;
                for (i = 12; i >= 0; i--) {
                    num = (int) (cnpj.charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso + 1;
                    if (peso == 10) {
                        peso = 2;
                    }
                }
                r = sm % 11;

                if ((r == 0) || (r == 1)) {
                    dig14 = '0';
                } else {
                    dig14 = (char) ((11 - r) + 48);
                }

                // Verifica-se os dígitos calculados conferem com os dígitos informados
                if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
                    return (true);
                } else {
                    return (false);
                }
            } catch (InputMismatchException erro) {
                return (false);
            }
        } else {
            return false;
        }
    }

    @Override
    public void solicitarNovo() {
        // este método solicita um novo CNPJ, até que o valor do CNPJ informado esteja correto
        String cnpj;
        boolean check;

        System.out.print("CNPJ inválido, insira um CNPJ válido: ");
        cnpj = sc.nextLine();
        check = validar(cnpj);

        if (!check)
            solicitarNovo();
        else
            this.cnpj = cnpj;
    }

}
