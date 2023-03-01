import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a string para inversão: ");
        String string = sc.nextLine();

        for (int i = string.length(); i>0; i--){
            char letra = string.charAt(i-1);
            System.out.print(letra);
        }
    }
}
