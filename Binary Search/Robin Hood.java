// Sure, let's go through the provided Java code step by step:

// 1. **Input Parsing**:
//    - Reads the integers `n` (the number of cartons), and `k` (the maximum number of days to delay drinking a carton) from the standard input.
//    - Reads the expiration dates of the `n` cartons from the standard input into an array `v`.

// 2. **Binary Search for Maximum Delay**:
//    - Initializes the binary search range (`b` and `e`) to [1, 2000000000].
//    - Performs a binary search to find the maximum delay `mid` such that it's possible for Olya to drink all the cartons in the fridge without exceeding the limit `k`.
//    - Inside the binary search loop:
//      - Calculates the sum of delays for each carton in the fridge based on the current `mid`.
//      - If the sum is less than or equal to `k`, updates the lower bound `b` to `mid`. Otherwise, updates the upper bound `e` to `mid - 1`.
//    - After the binary search, updates the expiration dates in the fridge array `v` to the new maximum delay `mid`.

// 3. **Adjusting for Maximum Delay**:
//    - Checks if there is any remaining capacity to delay drinking for the remaining cartons in the fridge.
//    - Adjusts the expiration dates in the fridge array `v` accordingly by increasing the expiration dates of some cartons if there's extra capacity `sum` available.

// 4. **Binary Search for Minimum Delay**:
//    - Re-initializes the binary search range (`b` and `e`) to [1, 2000000000].
//    - Performs a binary search to find the minimum delay `mid` such that it's possible for Olya to drink all the cartons in the fridge without exceeding the limit `k`.
//    - Inside the binary search loop:
//      - Calculates the sum of excess delays for each carton in the fridge based on the current `mid`.
//      - If the sum is less than or equal to `k`, updates the upper bound `e` to `mid`. Otherwise, updates the lower bound `b` to `mid + 1`.
//    - After the binary search, updates the expiration dates in the fridge array `v` to the new minimum delay `mid`.

// 5. **Calculating Maximum Difference**:
//    - Finds the maximum and minimum expiration dates (`maxVal` and `minVal`) in the updated fridge array `v`.
//    - Calculates and prints the difference between `maxVal` and `minVal`, representing the maximum number of days Olya can delay drinking the cartons without exceeding the limit `k`.

// This code implements a binary search algorithm to find the optimal delays for each carton in Olya's fridge, ensuring that she can drink all the cartons without exceeding the daily limit `k`. Finally, it calculates and outputs the maximum number of days Olya can delay drinking the cartons.




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long k = scanner.nextLong();

        long[] v = new long[n];
        for (int i = 0; i < n; ++i) {
            v[i] = scanner.nextLong();
        }

        long b = 1, e = 2000000000L;
        long mid;

        while (b < e) {
            mid = (b + e) >> 1;
            if (b == mid) ++mid;

            long sum = 0;
            for (int i = 0; i < n; ++i)
                sum += Math.max(0, mid - v[i]);

            if (sum <= k)
                b = mid;
            else e = mid - 1;

        }
        mid = b;
        long sum = k;
        for (int i = 0; i < n; ++i) {
            sum -= Math.max(0, mid - v[i]);
            v[i] = Math.max(v[i], mid);
        }
        for (int i = 0; i < n; ++i)
            if (sum > 0 && v[i] == mid) {
                --sum;
                ++v[i];
            }

        b = 1;
        e = 2000000000L;

        while (b < e) {
            mid = (b + e) >> 1;

            long sum2 = 0;
            for (int i = 0; i < n; ++i)
                sum2 += Math.max(0, v[i] - mid);

            if (sum2 <= k)
                e = mid;
            else b = mid + 1;
        }
        mid = b;

        sum = k;
        for (int i = 0; i < n; ++i) {
            sum -= Math.max(0, v[i] - mid);
            v[i] = Math.min(v[i], mid);
        }
        for (int i = 0; i < n; ++i)
            if (sum > 0 && v[i] == mid) {
                --sum;
                --v[i];
            }

        long maxVal = Long.MIN_VALUE, minVal = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, v[i]);
            minVal = Math.min(minVal, v[i]);
        }

        System.out.println(maxVal - minVal);
    }
}
