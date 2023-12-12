import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[] permutation = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            permutation[i] = scanner.nextInt();
        }

        int[] lastOccurrence = new int[n + 1];
        int maxNum = n;

        for (int i = n; i >= 1; i--) {
            lastOccurrence[permutation[i]] = i;
        }

        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            int maxNotInSubarray = maxNum;

            for (int num = maxNotInSubarray; num > 0; num--) {
                if (lastOccurrence[num] > r || lastOccurrence[num] < l) {
                    System.out.println(num);
                    break;
                }
            }
        }

        scanner.close();

        // Write your code here

    }
}
