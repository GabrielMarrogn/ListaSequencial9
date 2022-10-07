import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double Fahrenheit, Celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de graus em Fahrenheit");
        Fahrenheit = sc.nextDouble();
        Celsius = 5 * ((Fahrenheit-32) / 9);
        System.out.println("Na converção a temperatura fica: " +Celsius +"°C");
        sc.close();
    }
}
