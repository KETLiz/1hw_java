import java.util.Scanner;

public class treangle {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = iScanner.nextInt();
        iScanner.close();
        System.out.println("Полученное треугольное число:");
        System.out.println(result(i));
    }
    static int result(int n) {
        int t = n*(n+1)/2;
        return t;
    }
    
}
