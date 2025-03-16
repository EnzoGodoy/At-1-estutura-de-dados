import java.util.ArrayList;

import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");

        int n = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Digite os " + n + " números:");

        for (int i = 0; i < n; i++) {

            array.add(scanner.nextInt());

        }
        if (verificarAnteriores(array)) {

            System.out.println("Existe um elemento que é a soma de dois anteriores.");
        } else {

            System.out.println("Nenhum elemento é a soma de dois anteriores.");
        }
        scanner.close();
    }

    public static boolean verificarAnteriores(ArrayList<Integer> array) {

        for (int i = 2; i < array.size(); i++) {

            for (int j = 0; j < i; j++) {

                for (int k = 0; k < i; k++) {

                    if (j != k && array.get(i) == array.get(j) + array.get(k)) {
                        
                        return true;
                    }
                }
            }
        }
        return false;
    }
}