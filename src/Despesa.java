import java.util.Scanner;
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
    Scanner ADDdescricao = new Scanner(System.in);
    System.out.println("Digite a descrição: ");
    descricao = ADDdescricao.nextLine();
    valorTotal = 0;
}
abstract void calcularDepesa();
abstract void listarDespesa();

}
