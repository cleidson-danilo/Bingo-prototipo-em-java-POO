import java.util.*;

public class Bingo {
    private static final int MAX_NUMERO = 75;
    private Set<Integer> numerosSorteados = new HashSet<>();
    private Random random = new Random();

    // Sorteia um número que ainda não saiu (retorna -1 se todos já saíram)
    public int sortearNumero() {
        if (numerosSorteados.size() == MAX_NUMERO) {
            return -1; // sinaliza que já acabou
        }

        System.out.print("Girando o bingo");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println();

        int numero;
        do {
            numero = random.nextInt(MAX_NUMERO) + 1;
        } while (numerosSorteados.contains(numero));

        numerosSorteados.add(numero);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nE o número sorteado é...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return numero;
    }

    // Exibe todos os números já sorteados
    public void exibirNumerosSorteados() {
        if (numerosSorteados.isEmpty()) {
            System.out.println("Nenhum número foi sorteado ainda.");
            return;
        }

        List<Integer> lista = new ArrayList<>(numerosSorteados);
        Collections.sort(lista);

        System.out.println("Números sorteados até agora:");
        for (int n : lista) {
            System.out.print(n + " ");
        }
        System.out.println("\nTotal: " + lista.size() + " números sorteados.");
    }

    // Método utilitário para reiniciar o bingo
    public void reiniciar() {
        numerosSorteados.clear();
    }
}
