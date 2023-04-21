import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        String str=s.next();
        System.out.print(canDistributeBalloons(n,k,str));

    }
    public static String canDistributeBalloons(int n, int k, String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (int cnt : map.values()) {
        if (cnt > k) {
            return "NO";
        }
    }
    return "YES";
}

}
