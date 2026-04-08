import java.util.ArrayList;

public class Sistema {
    private ArrayList<Solicitacoes> solicitacoes = new ArrayList<>();

    public void adicionarSolicitacao(Solicitacoes solicitacao){
        solicitacoes.add(solicitacao);
    }

    public Solicitacoes buscarPorId(int id) {
        for (Solicitacoes solicitacao : solicitacoes) {
            if (solicitacao.getId() == id) {
                return solicitacao;
            }
        }

        return null;
    }

    public void listarSolicitacoes() {
        for (Solicitacoes solicitacao : solicitacoes) {
            solicitacao.exibirDetalhes();
            System.out.println("------------------");
        }
    }
}
