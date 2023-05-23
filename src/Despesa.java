public abstract class Despesa {
    private String descricao;
    private double valorTotal;

void cadastrarDespesa(){
    this.descricao = descricao;
    valorTotal = 0;
}
abstract void calcularDepesa();
abstract void listarDespesa();

}
