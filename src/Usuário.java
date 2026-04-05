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
        scanner.nextLine();
        if (respostaIdentificar ==1) {
            nome = "Anonimo";
            cpf = "Anonimo";
            numeroCelular = "Anonimo";
            idade = 0;
            solicitacao.setAnonimoOuNao(true);
        } else if (respostaIdentificar ==2){
            solicitacao.setAnonimoOuNao(false);
        } else {
            System.out.println("Alternativa inválida");
            return;
        }

            String localizacaoResposta;
            String descricaoSolicitacaoResposta;
            System.out.println("Qual a categoria da solicitação");
            System.out.println("1-Saúde");
            System.out.println("2-Educação");
            System.out.println("3-Limpeza");
            System.out.println("4-Buracos");
            System.out.println("5-Iluminação");
            System.out.println("6-Segurança escolar");
            int respostaCategoria = scanner.nextInt();
            scanner.nextLine();
            switch (respostaCategoria) {
                case 1:
                    solicitacao.setCategoria("Saúde");
                    break;
                case 2:
                    solicitacao.setCategoria("Educação");
                    break;
                case 3:
                    solicitacao.setCategoria("Limpeza");
                    break;
                case 4:
                    solicitacao.setCategoria("Buracos");
                    break;
                case 5:
                    solicitacao.setCategoria("Iluminação");
                    break;
                case 6:
                    solicitacao.setCategoria("Segurança escolar");
                    break;
                default:
                    System.out.println("Opção inválida");
                    return;
            }

        System.out.println("Qual a localização?");
        solicitacao.setLocalizacao(scanner.nextLine());
        System.out.println("Qual a descrição da solicitação?");
        solicitacao.setDescricao(scanner.nextLine());

        solicitacao.setStatus("Solicitacao criada");
    }
}
