import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        String keypad=s.next();
        String word=s.next();

int ans=0;
HashMap<Character,Integer> map=new HashMap<>();
for(int i=1;i<=keypad.length();i++){
    map.put(keypad.charAt(i-1),i);
}
        for(int i=0;i<word.length()-1;i++){
           ans+=Math.abs(map.get(word.charAt(i))-map.get(word.charAt(i+1)));
        }
System.out.println(ans);
    }
}
