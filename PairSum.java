import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target Sum: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " and " + arr[j]);
                    System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("\nNo pair of numbers sums to " + target);
        }
        sc.close();
    }
}
