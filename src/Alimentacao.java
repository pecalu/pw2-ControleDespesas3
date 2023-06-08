import java.util.Scanner;

public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int quantidadeRefeicoes;
    @Override
    void calcularDepesa() {
        Scanner qtdRefeicao = new Scanner(System.in);
        System.out.printf("Digite a quantidade de refeição");
        quantidadeRefeicoes = qtdRefeicao.nextInt();
        this.setValorTotal(quantidadeRefeicoes * 18);
    }

    @Override
    void listarDespesa() {
        System.out.println("Nome restaurante: " + nomeRestaurante);
        System.out.println("Quantidade de refeições: " + quantidadeRefeicoes);
        System.out.println("Descrição da despesa: " + getDescricao());
        System.out.println("Valor total: " + getValorTotal());
    }

    @Override
    void cadastrarDespesa() {
        super.cadastrarDespesa();
        Scanner addAtributos = new Scanner(System.in);
        System.out.println("Digite o nome do restaurante: ");
        nomeRestaurante = addAtributos.nextLine();
        setValorTotal(0);
    }


}
