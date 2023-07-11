import java.util.Scanner;

public class Main {
    public static long sum(long n) {
        return (n * (n + 1)) / 2;
    }

    public static long sum(long s, long e) {
        if (s <= 1)
            return sum(e);
        return sum(e) - sum(s - 1);
    }

    public static long minSplitters(long k, long n) {
        long st = 1, en = k;
        while (st < en) {
            long md = (st + en) / 2;
            long s = sum(md, k);

            if (s == n)
                return k - md + 1;

            if (s > n)
                st = md + 1;
            else
                en = md;
        }
        return k - st + 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if (n == 1)
            System.out.println(0);
        else if (n <= k)
            System.out.println(1);
        else {
            k--;
            n--;

            if (sum(k) < n)
                System.out.println(-1);
            else
                System.out.println(minSplitters(k, n));
        }
    }
}
