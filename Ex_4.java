import java.util.Scanner;

class Triangulo {
    double a, b, c;

    Triangulo(double a, double b, double c) {
        this.a = a;

        this.b = b;

        this.c = c;
    }

    double perimetro() {

        return a + b + c;
    }

    double area() {

        double p = perimetro() / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    void mostrar() {

        System.out.println("Lados: " + a + ", " + b + ", " + c);

        System.out.println("Área: " + area());

        System.out.println("Perímetro: " + perimetro());

        System.out.println("---------------------------");
    }
}

public class Ex_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        Triangulo t = new Triangulo(a, b, c);
        
        t.mostrar();

        scanner.close();
    }
}
