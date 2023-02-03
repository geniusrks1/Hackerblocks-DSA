import java.util.*;

public class Main {
    static int MAX_SIZE = 1000001;
    static boolean[] IsPrime = new boolean[MAX_SIZE];
    static ArrayList<Integer> primes = new ArrayList<Integer>();

    static void SieveOfEratosthenes() {
      

        for (int p = 2; p*p < MAX_SIZE; p++) {
            if (!IsPrime[p]) {
                for (int i = p * p; i < MAX_SIZE; i += p)
                    IsPrime[i] = true;
            }
        }

        for (int p = 2; p < MAX_SIZE; p++)
            if (!IsPrime[p])
                primes.add(p);
    }

    public static void main(String[] args) {
        SieveOfEratosthenes();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            System.out.println(primes.get(n - 1));
        }
    }
} 
