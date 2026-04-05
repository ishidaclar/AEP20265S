public class Solicitacoes {

    private int id;
    private String categoria;
    private String dewscricao;
    private String localizacao;
    private boolean anonimoOuNão;
    private String status;

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

    public String getDewscricao() {
        return dewscricao;
    }

    public void setDewscricao(String dewscricao) {
        this.dewscricao = dewscricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isAnonimoOuNão() {
        return anonimoOuNão;
    }

    public void setAnonimoOuNão(boolean anonimoOuNão) {
        this.anonimoOuNão = anonimoOuNão;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
