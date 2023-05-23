public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int quantidadeRefeicoes;
    @Override
    void calcularDepesa() {
        setValorTotal();  //terminar este metodo em casa
    }

    @Override
    void listarDespesa() {

    }

    @Override
    void cadastrarDespesa() {
        super.cadastrarDespesa();
    }


}
