import java.util.Scanner;

public class RecursiveSubtract {
    static void f(int number) {
        //System.out.print(number + " ");
        if (number <= 0)
            return;
        f(number - 5);
        System.out.print(number + " ");

}
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.printf("Insert a number: ");
        sayi = giris.nextInt();
        f(sayi);

    }
}