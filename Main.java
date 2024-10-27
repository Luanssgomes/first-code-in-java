//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name? ");

        String nome = scanner.nextLine();

        System.out.println("Hello " + nome + "!");

        scanner.close();
    }
}
