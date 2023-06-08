public class GerenciadorDespesa {
    private double totalAlimentacao;
    private double totalTransporte;
    private double totalDiaria;
    private int qtdeAlimentacao;
    private int qtdeTransporte;
    private int qtdeDiaria;
    private double totalDespesas;

    public void analisarDespesas(Despesa despesa) {
        if (despesa instanceof Alimentacao) {
            Alimentacao alimentacao = (Alimentacao) despesa;
            totalAlimentacao += alimentacao.getValorTotal();
            qtdeAlimentacao++;
        } else if (despesa instanceof Transporte) {
            Transporte transporte = (Transporte) despesa;
            totalTransporte += transporte.getValorTotal();
            qtdeTransporte++;
        } else if (despesa instanceof Diaria) {
            Diaria diaria = (Diaria) despesa;
            totalDiaria += diaria.getValorTotal();
            qtdeDiaria++;
        }

        totalDespesas += despesa.getValorTotal();
    }

    public double getTotalAlimentacao() {
        return totalAlimentacao;
    }

    public void setTotalAlimentacao(double totalAlimentacao) {
        this.totalAlimentacao = totalAlimentacao;
    }

    public double getTotalTransporte() {
        return totalTransporte;
    }

    public void setTotalTransporte(double totalTransporte) {
        this.totalTransporte = totalTransporte;
    }

    public double getTotalDiaria() {
        return totalDiaria;
    }

    public void setTotalDiaria(double totalDiaria) {
        this.totalDiaria = totalDiaria;
    }

    public int getQtdeAlimentacao() {
        return qtdeAlimentacao;
    }

    public void setQtdeAlimentacao(int qtdeAlimentacao) {
        this.qtdeAlimentacao = qtdeAlimentacao;
    }

    public int getQtdeTransporte() {
        return qtdeTransporte;
    }

    public void setQtdeTransporte(int qtdeTransporte) {
        this.qtdeTransporte = qtdeTransporte;
    }

    public int getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(int qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    public double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }
}