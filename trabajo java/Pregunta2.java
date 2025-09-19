import java.util.*;

public class Pregunta2 {
    public static boolean hasTwoSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0;i < n; i++) nums[i] = sc.nextInt();
        System.out.print("Ingrese el valor target: ");
        int target = sc.nextInt();

        System.out.println("¿Existen dos números que sumen target? " + hasTwoSum(nums, target));
    }
}
