import java.util.Scanner;

public class Pregunta8 {
    public static boolean isArmstrong(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Math.pow(c - '0', n);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println("¿Es Armstrong? " + isArmstrong(num));
    }
}
