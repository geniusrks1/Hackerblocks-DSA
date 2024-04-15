// 1. **Input Parsing**: Reads the recipe and ingredient quantities, prices, and budget.

// 2. **Counting Ingredients**: Counts occurrences of each ingredient in the recipe.

// 3. **Binary Search**: Finds the maximum number of burgers within the budget.

// 4. **Price Calculation**: Calculates total ingredient cost for a given number of burgers.

// 5. **Binary Search Implementation**: Adjusts search range based on ingredient cost compared to budget.

// 6. **Output**: Prints the maximum number of affordable burgers.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int lb = 0, lc = 0, ls = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') lb++;
            else if (s.charAt(i) == 'C') lc++;
            else ls++;
        }

        int nb = scanner.nextInt();
        int ns = scanner.nextInt();
        int nc = scanner.nextInt();
        int pb = scanner.nextInt();
        int ps = scanner.nextInt();
        int pc = scanner.nextInt();
        long r = scanner.nextLong();

        long low = 0, high = r + 1000, mid = 0, ans = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            long z = price(mid, lb, lc, ls, nb, ns, nc, pb, ps, pc);
            if (z == r) {
                System.out.println(mid);
                return;
            }

            if (z > r)
                high = mid - 1;
            else{
                low = mid + 1;
                ans = mid;
            }
        }

        System.out.println(ans);
    }

    static long price(long x, int lb, int lc, int ls, int nb, int ns, int nc, int pb, int ps, int pc) {
        long fb = Math.max(x * lb - nb, 0);
        long fc = Math.max(x * lc - nc, 0);
        long fs = Math.max(x * ls - ns, 0);

        return fb * pb + fc * pc + fs * ps;
    }
}

