import java.util.Scanner;

public class Pregunta9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, reversed = 0;
        while (x != 0) {
            int d = x % 10;
            reversed = reversed * 10 + d;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println("¿Es palíndromo? " + isPalindrome(num));
    }
}
