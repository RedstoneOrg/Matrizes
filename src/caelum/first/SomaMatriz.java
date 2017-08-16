package caelum.first;

import java.util.Scanner;

public class SomaMatriz {

    private static final Scanner scan = new Scanner(System.in);

    public void executar() {
        int linhas = 2;
        int colunas = 2;

        int[][] matriz1 = criarMatriz("Primeira Matriz", linhas, colunas);
        mostrar("Primeira Matriz", matriz1);

        int[][] matriz2 = criarMatriz("Segunda Matriz", linhas, colunas);
        mostrar("Segunda Matriz", matriz2);

        int[][] soma = somar(matriz1, matriz2);
        mostrar("Soma das Matrizes", soma);
    }

    private int[][] criarMatriz(String nome, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print("Digite os valores da " + nome + " [" + linha + " , " + coluna + "]: ");
                matriz[linha][coluna] = Integer.parseInt(scan.nextLine());
            }
        }
        return matriz;
    }

    private void mostrar(String nome, int[][] matriz) {
        System.out.println(nome + ":");
        int linhas = matriz.length;
        for (int linha = 0; linha < linhas; linha++) {
            int colunas = matriz[linha].length;
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
    }

    private int[][] somar(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int[][] soma = new int[linhas][];
        for (int linha = 0; linha < linhas; linha++) {
            int colunas = matriz1[linha].length;
            soma[linha] = new int[colunas];
            for (int coluna = 0; coluna < colunas; coluna++) {
                soma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        return soma;
    }

}
