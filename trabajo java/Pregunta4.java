
import java.util.*;
public class Pregunta4 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0, end = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (interval[0] < end) {
                count++;
            } else {
                end = interval[1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de intervalos: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Ingrese los intervalos (inicio fin):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        System.out.println("Mínimo a eliminar: " + eraseOverlapIntervals(intervals));
    }
}
