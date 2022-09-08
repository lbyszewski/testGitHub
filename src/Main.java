import java.util.Scanner;

public class Main {

    public double silnia(double n){
        if(n == 0){
            return 1;
        } else {
            return  n * silnia(n-1);
        }
    }

    public static void main(String[] args) {


        System.out.println("podaj n: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        Main main = new Main();
        double result = main.silnia(n);

        System.out.println("podana silnia wynosi: " + " " + result);

    }
}