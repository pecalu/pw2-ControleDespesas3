import java.util.Scanner;
public class Diaria extends Despesa{
    private int qtdeDiarias;
    @Override
    void calcularDepesa() {
        Scanner quantidadeDiarias = new Scanner(System.in);
        System.out.println("Digite a quantidade de diarias: ");
        qtdeDiarias = quantidadeDiarias.nextInt();
        this.setValorTotal(qtdeDiarias * 50);
    }

    @Override
    void listarDespesa() {
        System.out.println("Quantidade de diarias: " + qtdeDiarias);
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor total: " + getValorTotal());
    }
}
