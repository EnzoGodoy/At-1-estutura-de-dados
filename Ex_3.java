import java.util.ArrayList;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");

        int n = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Digite os " + n + " números:");

        for (int i = 0; i < n; i++) {

            array.add(scanner.nextInt());
        }
        System.out.println("Digite o valor de k:");

        int k = scanner.nextInt();

        reorganizarArray(array, k);

        System.out.println("Array reorganizado: " + array);

        scanner.close();
    }

    public static void reorganizarArray(ArrayList<Integer> array, int k) {
        int i = 0;
        
        for (int j = 0; j < array.size(); j++) {

            if (array.get(j) <= k) {

                int temp = array.get(i);

                array.set(i, array.get(j));

                array.set(j, temp);
                
                i++;
            }
        }
    }
}
