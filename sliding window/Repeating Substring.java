import java.util.*;
public class Main{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
    int ans =longestSubstringWithoutRepeatingChars(str);
    System.out.println(ans);
     
    }

public static int longestSubstringWithoutRepeatingChars(String s) {
    int n = s.length();
    int[] lastIndex = new int[256];
    Arrays.fill(lastIndex, -1);
    int maxLength = 0;
    int start = 0;
    
    for (int end = 0; end < n; end++) {
        char c = s.charAt(end);
        if (lastIndex[c] >= start) {
            start = lastIndex[c] + 1;
        }
        lastIndex[c] = end;
        
        maxLength = Math.max(maxLength, end - start + 1);
    }
    
    return maxLength;
}
}
