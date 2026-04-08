public class Solicitacoes {

    private int id;
    private String categoria;
    private String descricao;
    private String localizacao;
    private boolean anonimoOuNao;
    private String status;
    private String retorno;

    public Solicitacoes(int id, String categoria, String descricao, String localizacao, boolean anonimoOuNao, String status) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.anonimoOuNao = anonimoOuNao;
        this.status = status;
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


}
