public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    void cadastrarDespesa(){
    this.descricao = descricao;
    valorTotal = 0;
}
abstract void calcularDepesa();
abstract void listarDespesa();

}
