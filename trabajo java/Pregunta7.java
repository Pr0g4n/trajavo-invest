import java.util.*;

public class Pregunta7 {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private static int getNext(int n) {
        int total = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            total += d * d;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("¿Es número feliz? " + isHappy(n));
    }
}

