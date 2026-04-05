import java.sql.SQLOutput;
import java.util.Scanner;
public class Usuário {

    private String nome;
    private String cpf;
    private String numeroCelular;
    private int idade;
    Solicitacoes solicitacao;
    Scanner scanner = new Scanner(System.in);

    public Usuário(String nome, String cpf, String numeroCelular, int idade, Solicitacoes solicitacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
        this.idade = idade;
        this.solicitacao = solicitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void registrarSolicitacao(){

        System.out.println("Bem vindo(a) ao registro de solicitaçoes. Você gostaria de:");
        System.out.println("1- Ser anônimo");
        System.out.println("2- Se identificar");
        int respostaIdentificar = scanner.nextInt();
        if (respostaIdentificar ==1){
            nome = "Anonimo";
            cpf = "Anonimo";
            numeroCelular = "Anonimo";
            idade = 0;
            solicitacao.setAnonimoOuNao(true);

            System.out.println("Qual a categoria da solicitação");
            System.out.println("1-Saúde");
            System.out.println("2-Educação");
            System.out.println("3-Limpeza");
            System.out.println("4-Buracos");
            System.out.println("5-Iluminação");
            System.out.println("6-Segurança escolar");
            int respostaCategoria = scanner.nextInt();
            switch (respostaCategoria){
                String localizacaoResposta;
                String descricaoSolicitacaoResposta;
                case 1:
                    solicitacao.setCategoria("Saude");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 2:
                    solicitacao.setCategoria("Educação");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 3:
                    solicitacao.setCategoria("Limpeza");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 4:
                    solicitacao.setCategoria("Buracos");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 5:
                    solicitacao.setCategoria("Iluminacao");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;

                case 6:
                    solicitacao.setCategoria("Segurança escolar");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;

                default:
                    System.out.println("Opção inválida");
            }


        } else if (respostaIdentificar == 2){
            nome = nome;
            cpf = cpf;
            numeroCelular = numeroCelular;
            idade = idade;
            solicitacao.setAnonimoOuNao(false);

            System.out.println("Qual a categoria da solicitação");
            System.out.println("1-Saúde");
            System.out.println("2-Educação");
            System.out.println("3-Limpeza");
            System.out.println("4-Buracos");
            System.out.println("5-Iluminação");
            System.out.println("6-Segurança escolar");
            int respostaCategoria = scanner.nextInt();
            switch (respostaCategoria){
                String localizacaoResposta;
                String descricaoSolicitacaoResposta;
                case 1:
                    solicitacao.setCategoria("Saude");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 2:
                    solicitacao.setCategoria("Educação");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 3:
                    solicitacao.setCategoria("Limpeza");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 4:
                    solicitacao.setCategoria("Buracos");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;
                case 5:
                    solicitacao.setCategoria("Iluminacao");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;

                case 6:
                    solicitacao.setCategoria("Segurança escolar");
                    System.out.println("Qual a localização?");
                    localizacaoResposta = scanner.nextLine();
                    solicitacao.setLocalizacao(localizacaoResposta);
                    System.out.println("Descreva a solicitacao:");
                    descricaoSolicitacaoResposta = scanner.nextLine();
                    solicitacao.setDescricao(descricaoSolicitacaoResposta);
                    solicitacao.setStatus("Solicitação criada");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } else {
            System.out.println("Alternativa inválida");
        }


    }
}
