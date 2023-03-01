package question2fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibonacciCalculation;

        if (n < 2){
            fibonacciCalculation = n;
            System.out.println(n + ", " + n + "\nO número informado pertence a sequência!");
        } else {
            fibonacciCalculation = (n - 1) + (n - 2);
            System.out.println(n + ", " + fibonacciCalculation + "\nO número informado não pertence a sequência!");
        }
    }
}
