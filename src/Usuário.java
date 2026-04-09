import java.sql.SQLOutput;
import java.util.Scanner;
public class Usuário {

    private String nome;
    private String cpf;
    private String numeroCelular;
    private int idade;
    private Solicitacoes solicitacao;
    private Scanner scanner = new Scanner(System.in);

    public Usuário(String nome, String cpf, String numeroCelular, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
        this.idade = idade;
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

    public Solicitacoes getSolicitacao() {
        return solicitacao;
    }

    public void registrarSolicitacao() {

        System.out.println("----------------EMERGENCIA----------------");
        System.out.println("Bem vindo(a) a registrar uma solicitação, você gostaria de:");
        System.out.println("1- Ser anônimo");
        System.out.println("2- Se identificar");
        System.out.println("----------------EMERGENCIA----------------");

        int respostaIdentificar = scanner.nextInt();
        scanner.nextLine();
        boolean anonimo = false;

        if (respostaIdentificar == 1) {
            anonimo = true;
        } else if (respostaIdentificar == 2) {
            anonimo = false;
        } else {
            System.out.println("Alternativa inválida");
            return;
        }

        String categoria = "";

        System.out.println("Qual a categoria da solicitação");
        System.out.println("1-Saúde");
        System.out.println("2-Educação");
        System.out.println("3-Limpeza");
        System.out.println("4-Meio ambiente");
        System.out.println("5-Iluminação");
        System.out.println("6-Segurança escolar");
        System.out.println("7-Policia");

        int respostaCategoria = scanner.nextInt();
        scanner.nextLine();

        switch (respostaCategoria) {
            case 1:
                categoria = "Saúde";
                break;
            case 2:
                categoria = "Educação";
                break;
            case 3:
                categoria = "Limpeza";
                break;
            case 4:
                categoria = "Meio ambiente";
                break;
            case 5:
                categoria = "Iluminação";
                break;
            case 6:
                categoria = "Segurança escolar";
                break;
            case 7:
                categoria =  "Policia";
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Digite sua localização: (Ou espere o GPS...)");
        String localizacao = scanner.nextLine();
        System.out.println("Qual a descrição da solicitação?");
        String descricao = scanner.nextLine();
        solicitacao = new Solicitacoes(categoria, descricao, localizacao);
        solicitacao.setAnonimoOuNao(anonimo);
        solicitacao.setStatus("Solicitação criada");
    }
}

