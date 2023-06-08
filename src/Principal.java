import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Alimentacao refeicoes = new Alimentacao();
        Transporte veiculos = new Transporte();
        Diaria diarias = new Diaria();
        GerenciadorDespesa gerenciador = new GerenciadorDespesa();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("------ Menu Principal ------");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Transporte");
            System.out.println("3 - Diária");
            System.out.println("4 - Apresentar análise de despesas");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarOperacoes(refeicoes, gerenciador);
                    break;
                case 2:
                    realizarOperacoes(veiculos, gerenciador);
                    break;
                case 3:
                    realizarOperacoes(diarias, gerenciador);
                    break;
                case 4:
                    apresentarAnaliseDespesas(gerenciador);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void realizarOperacoes(Despesa despesa, GerenciadorDespesa gerenciador) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n------ Menu de Operações ------");
            System.out.println("1 - Cadastrar despesa");
            System.out.println("2 - Calcular despesa");
            System.out.println("3 - Apresentar despesa");
            System.out.println("4 - Incluir despesa para análise");
            System.out.println("0 - Voltar");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    despesa.cadastrarDespesa();
                    break;
                case 2:
                    despesa.calcularDepesa();
                    break;
                case 3:
                    despesa.listarDespesa();
                    break;
                case 4:
                    gerenciador.analisarDespesas(despesa);
                    System.out.println("Despesa incluída para análise.");
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void apresentarAnaliseDespesas(GerenciadorDespesa gerenciador) {
        System.out.println("------ Análise de Despesas ------");
        System.out.println("Total de despesas de alimentação: " + gerenciador.getTotalAlimentacao());
        System.out.println("Total de despesas de transporte: " + gerenciador.getTotalTransporte());
        System.out.println("Total de despesas de diária: " + gerenciador.getTotalDiaria());
        System.out.println("Quantidade de despesas de alimentação: " + gerenciador.getQtdeAlimentacao());
        System.out.println("Quantidade de despesas de transporte: " + gerenciador.getQtdeTransporte());
        System.out.println("Quantidade de despesas de diária: " + gerenciador.getQtdeDiaria());
        System.out.println("Total geral de despesas: " + gerenciador.getTotalDespesas());
    }
}

