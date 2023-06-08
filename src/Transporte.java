import java.util.Scanner;
public class Transporte extends Despesa{
    private double kmPercorrida;
    private double valorPedagios;

    @Override
    void calcularDepesa() {
        Scanner quilometragem = new Scanner(System.in);
        System.out.printf("Digite quantos quilometros foram percorridos: ");
        kmPercorrida = quilometragem.nextDouble();
        Scanner gastoPedagios = new Scanner(System.in);
        System.out.printf("Digite quanto foi gasto em pedagios:  ");
        valorPedagios = gastoPedagios.nextDouble();
        this.setValorTotal((kmPercorrida * 3)+valorPedagios);

    }

    @Override
    void listarDespesa() {
        System.out.println("Quilometros percorridos: " + kmPercorrida);
        System.out.println("Valor gosto nos pedagios: " + valorPedagios);
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor total gasto: " + getValorTotal());
    }
}
