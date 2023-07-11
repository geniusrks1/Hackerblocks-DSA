import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int n = scanner.nextInt();

     
      int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

       
        boolean result = findTriplet(nums);
        if(result)
        System.out.println(1);
        else
            System.out.println(0);
    }

  public static boolean findTriplet(int[] nums){
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] < nums[k] && nums[k] < nums[j])
                    return true;
            }
        }
    }
    return false;
}}
