public class Solicitacoes {

    public static final String ABERTO = "Aberto";
    public static final String TRIAGEM = "Triagem";
    public static final String EM_EXECUCAO = "Em execução";
    public static final String RESOLVIDO = "Resolvido";
    public static final String ENCERRADO = "Encerrado";
    private int id;
    private String categoria;
    private String descricao;
    private String localizacao;
    private boolean anonimoOuNao=false;
    private String status;
    private String retorno;
    private static int contador=1;

    public Solicitacoes(String categoria, String descricao, String localizacao) {
        this.id = contador++;
        this.categoria = categoria;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.status = ABERTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isAnonimoOuNao() {
        return anonimoOuNao;
    }

    public void setAnonimoOuNao(boolean anonimoOuNao) {
        this.anonimoOuNao = anonimoOuNao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public void avancarStatus() {
        if (status==null){
            return;
        }
        if (status.equals(ABERTO)) {
            status = TRIAGEM;
        } else if (status.equals(TRIAGEM)) {
            status = EM_EXECUCAO;
        } else if (status.equals(EM_EXECUCAO)) {
            status = RESOLVIDO;
        } else if (status.equals(RESOLVIDO)) {
            status = ENCERRADO;
        }
    }

    public void atualizarStatusComRetorno(String novoStatus, String retorno) {
        this.status = novoStatus;
        this.retorno = retorno;
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descrição: " + descricao);
        System.out.println("Localização: " + localizacao);
        System.out.println("Status: " + status);
        System.out.println("Retorno: " + retorno);
    }

}
