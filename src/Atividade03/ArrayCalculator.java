package Atividade03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculator {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o número para posição" + "[" + i + "]" );
            numbers[i] = sc.nextInt();
        }

        int sum = Arrays.stream(numbers).sum();
        System.out.println("Array criado: " + Arrays.toString(numbers));
        System.out.println("Soma dos números: " + sum);

        int row = 3;
        int column = 3;

        int[][] matriz = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                System.out.print("Digite o número para posição [" + i + "][" + k + "]: ");
                matriz[i][k] = sc.nextInt();
            }
        }
        System.out.println("Matriz criado: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(); // para pular pra prox linha
        }
        int sumMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumMatriz += matriz[i][j];
            }
        }
        System.out.println("A soma da matriz é: " + sumMatriz);
    }
}



