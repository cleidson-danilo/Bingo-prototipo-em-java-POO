import java.util.Scanner;

public class MainBingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bingo bingo = new Bingo();
        int opcao = 0;

        System.out.println("==============================");
        System.out.println("===== BEM-VINDO AO BINGO =====");
        System.out.println("==============================");

        do {
            System.out.println("=========== MENU =============");
            System.out.println("1 - Sortear novo número");
            System.out.println("2 - Exibir números já sorteados");
            System.out.println("3 - Reiniciar sorteio (limpar números)");
            System.out.println("0 - Sair");
            System.out.println("==============================");
            System.out.print("\nEscolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
                continue;
            }

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    int numero = bingo.sortearNumero();
                    if (numero == -1) {
                        System.out.println("Todos os números já foram sorteados!");
                    } else {
                        System.out.println("Número sorteado: " + numero);
                    }
                    break;

                case 2:
                    bingo.exibirNumerosSorteados();
                    break;

                case 3:
                    bingo.reiniciar();
                    System.out.println("Números reiniciados. Agora o sorteio começa do zero.");
                    break;

                case 0:
                    System.out.println("Encerrando o jogo. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            if (opcao != 0) {
                System.out.print("\nPressione Enter para continuar...");
                scanner.nextLine(); // pausa para o usuário ler
            }

        } while (opcao != 0);

        scanner.close();
    }
}
