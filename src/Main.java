//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main (String [] args){

        Usuário clara = new Usuário("Clara", "07423964956", "(44) 984338003", 20);
        Sistema sistemaGov = new Sistema();
        clara.registrarSolicitacao();

        if (clara.getSolicitacao() != null) {
            sistemaGov.adicionarSolicitacao(clara.getSolicitacao());
        }

        sistemaGov.listarSolicitacoes();
    }
}
