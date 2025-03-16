import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1 {
  
    public static int encontraRepetido(int[] array) {

        ArrayList<Integer> vistos = new ArrayList<>();

        
        for (int num : array) {

            if (vistos.contains(num)) {

                return num; 
            }
            vistos.add(num);
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array (n): ");

        int n = scanner.nextInt();
        
        int[] array = new int[n];

        System.out.println("Digite os " + n + " números:");

        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
        }

        int repetido = encontraRepetido(array);
        
        if (repetido != -1) {

            System.out.println("Número repetido = " + repetido);

        } else {

            System.out.println("Nenhum número repetido foi encontrado.");
        }

        scanner.close();
    }
}
